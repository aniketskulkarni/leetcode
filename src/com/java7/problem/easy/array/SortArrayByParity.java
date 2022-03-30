package com.java7.problem.easy.array;

/**
 * Given an integer array nums, move all the even integers at the beginning of
 * the array followed by all the odd integers.
 * Return any array that satisfies this condition.
 *
 * Input: nums = [3,1,2,4]
 * Output: [2,4,3,1]
 * Explanation: The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be
 * accepted.
 */
public class SortArrayByParity {

    public int[] sortArrayByParity(int[] nums) {
        if (nums == null || nums.length == 0) {
            return new int[0];
        }

        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            if (nums[start] % 2 != 0) {
                int temp = nums[end];
                nums[end] = nums[start];
                nums[start] = temp;
                end--;
                continue;
            }
            start++;
        }
        return nums;
    }

    public static void main(String[] args) {
        SortArrayByParity obj = new SortArrayByParity();
        int[] output = obj.sortArrayByParity(new int[] { 0 });
        for (int element : output) {
            System.out.print(element + " ");
        }
    }
}