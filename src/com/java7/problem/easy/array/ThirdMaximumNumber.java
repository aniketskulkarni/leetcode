package com.java7.problem.easy.array;

import java.util.Arrays;

/**
 * Given an integer array nums, return the third distinct maximum number in this
 * array. If the third maximum does not exist, return the maximum number.
 * 
 * Input: nums = [3,2,1]
 * Output: 1
 * Explanation:
 * The first distinct maximum is 3.
 * The second distinct maximum is 2.
 * The third distinct maximum is 1.
 * 
 * Input: nums = [1,2]
 * Output: 2
 * Explanation:
 * The first distinct maximum is 2.
 * The second distinct maximum is 1.
 * The third distinct maximum does not exist, so the maximum (2) is returned
 * instead.
 */
public class ThirdMaximumNumber {

    public int thirdMax(int[] nums) {
        int[] sorted = Arrays.stream(nums).sorted().distinct().toArray();
        if (sorted.length == 2) {
            return sorted[sorted.length - 1];
        } else if(sorted.length == 1) {
            return sorted[0];
        } else {
            return sorted[sorted.length - 3];
        }
    }

    public static void main(String[] args) {
        ThirdMaximumNumber obj = new ThirdMaximumNumber();
        System.out.println(obj.thirdMax(new int[] {2,3}));
    }
}
