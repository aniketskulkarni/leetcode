package com.java7.problem.easy.array;

/**
 * Given a binary array nums, return the maximum number of consecutive 1's in the array.
 *
 * Input: nums = [1,1,0,1,1,1]
 * Output: 3
 * Explanation: The first two digits or the last three digits are consecutive 1s. 
 * The maximum number of consecutive 1s is 3.
 */

class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        if(nums == null)
            return 0;
        
        int maxConsecutiveOnes = 0;
        int maxConsecutiveOnesInWindow = 0;
        for(int num: nums) {
            if(num == 1) 
                maxConsecutiveOnesInWindow += 1;
            else 
                maxConsecutiveOnesInWindow = 0;
            
            maxConsecutiveOnes = maxConsecutiveOnesInWindow > maxConsecutiveOnes ? maxConsecutiveOnesInWindow : maxConsecutiveOnes;
        }
        return maxConsecutiveOnes;
    }
}