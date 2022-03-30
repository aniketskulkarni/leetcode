/**
 * Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
   You may assume no duplicates in the array.
   
   Input: [1,3,5,6], 5
   Output: 2
   
   Input: [1,3,5,6], 2
   Output: 1
   
   Input: [1,3,5,6], 7
   Output: 4
   
   Input: [1,3,5,6], 0
   Output: 0
 */
package com.java7.problem.easy;

/**
 * @author Aniket Kulkarni
 *
 */
public class SearchInsertPosition35 {

    public int searchInsert(int[] nums, int target) {
	if (nums == null || nums.length == 0) {
	    return 0;
	}
	int ans = -1;
	for (int i = 0; i < nums.length; i++) {
	    if (target <= nums[i]) {
		ans = i;
		break;
	    }
	}
	if (ans == -1) {
	    ans = nums.length;
	}
	return ans;
    }
}
