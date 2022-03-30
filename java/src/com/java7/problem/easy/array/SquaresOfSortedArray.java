package com.java7.problem.easy.array;

/**
 * Given an integer array nums sorted in non-decreasing order, 
 * return an array of the squares of each number sorted in non-decreasing order.
 * Input: nums = [-4,-1,0,3,10]
 * Output: [0,1,9,16,100]
 * Explanation: After squaring, the array becomes [16,1,0,9,100].
 * After sorting, it becomes [0,1,9,16,100].
 */

import java.util.Arrays;

public class SquaresOfSortedArray {
    public int[] sortedSquares(int[] nums) {
        if(nums == null || nums.length == 0) {
            return new int[0];
        }

        int[] output = new int[nums.length];
        for (int index = 0; index < nums.length; index++) {
            output[index] = nums[index] * nums[index];
        }
        
        Arrays.sort(output);

        return output;
    }
}
