package com.java7.problem.easy.array;

import java.util.ArrayList;
import java.util.List;

/**
 * Given an array nums of n integers where nums[i] is in the range [1, n],
 * return an array of all the integers in the range [1, n] that do not appear in
 * nums.
 * 
 * Input: nums = [4,3,2,7,8,2,3,1]
 * Output: [5,6]
 * 
 * Input: nums = [1,1]
 * Output: [2]
 */

public class DisappearedNumersSearch {

    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> missingNums = new ArrayList<>();

        for (int index = 0; index < nums.length;) {
            int correctPosition = nums[index] - 1;
            if (nums[index] != nums[correctPosition]) {
                swap(nums, index, correctPosition);
            } else {
                index++;
            }
        }

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j + 1) {
                missingNums.add(j + 1);
            }
        }

        return missingNums;
    }

    private void swap(int[] nums, int index, int correctPosition) {
        int temp = nums[index];
        nums[index] = nums[correctPosition];
        nums[correctPosition] = temp;
    }

    public static void main(String[] args) {
        DisappearedNumersSearch obj = new DisappearedNumersSearch();
        System.out.println(obj.findDisappearedNumbers(new int[] { 4, 3, 2, 7, 8, 2, 3, 1 }));
        System.out.println(obj.findDisappearedNumbers(new int[] { 1, 1 }));
    }
}
