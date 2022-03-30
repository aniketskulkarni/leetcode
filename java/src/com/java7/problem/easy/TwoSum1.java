/**
 * Given nums = [2, 7, 11, 15], target = 9,
   Because nums[0] + nums[1] = 2 + 7 = 9,
   return [0, 1].
 */
package com.java7.problem.easy;

/**
 * @author Aniket Kulkarni
 *
 */
public class TwoSum1 {
    /**
     * 
     * @param nums
     * @param target
     * @return int[]
     */

    public int[] twoSum(int[] nums, int target) {
	if (nums.length == 0 || nums.length == 1) {
	    return nums;
	}
	for (int i = 0; i < nums.length; i++) {
	    for (int j = i + 1; j < nums.length; j++) {
		if ((nums[i] + nums[j]) == target) {
		    int[] solution = { i, j };
		    return solution;
		}
	    }
	}
	return nums;
    }

}
