package com.java7.problem.easy.array;

/**
 * Given an integer array nums of length n, you want to create an array ans of
 * length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n
 * (0-indexed).
 * 
 * Specifically, ans is the concatenation of two nums arrays.
 * 
 * Return the array ans.
 * 
 * Example 1:
 * 
 * Input: nums = [1,2,1]
 * Output: [1,2,1,1,2,1]
 * Explanation: The array ans is formed as follows:
 * - ans = [nums[0],nums[1],nums[2],nums[0],nums[1],nums[2]]
 * - ans = [1,2,1,1,2,1]
 */
public class ConcatenationOfArray1929 {

    // Time: O(n) | Space: O(n^2)
    public int[] getConcatenation(int[] nums) {
        if (nums == null || nums.length == 0) {
            return new int[0];
        }

        int[] answer = new int[nums.length * 2];

        int index = 0;
        int answerIndex = 0;

        while (index < nums.length) {
            answer[answerIndex] = nums[index];
            index += 1;
            answerIndex += 1;
        }

        index = 0;

        while (index < nums.length) {
            answer[answerIndex] = nums[index];
            index += 1;
            answerIndex += 1;
        }

        return answer;
    }
}
