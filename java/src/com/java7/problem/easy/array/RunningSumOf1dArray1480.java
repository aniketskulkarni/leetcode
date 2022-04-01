package com.java7.problem.easy.array;

/**
 * Given an array nums. We define a running sum of an array as runningSum[i] =
 * sum(nums[0]…nums[i]).
 * 
 * Return the running sum of nums.
 *
 * Example 1:
 * 
 * Input: nums = [1,2,3,4]
 * Output: [1,3,6,10]
 * Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
 */
public class RunningSumOf1dArray1480 {

    // Time: O(n) | Space O(n)
    public int[] runningSum(int[] nums) {
        if (nums == null || nums.length == 0) {
            return new int[0];
        }

        int runningSum = 0;
        int[] answer = new int[nums.length];

        for (int index = 0; index < nums.length; index++) {
            runningSum += nums[index];
            answer[index] = runningSum;
        }

        return answer;
    }
}
