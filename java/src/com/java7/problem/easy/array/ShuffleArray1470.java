package com.java7.problem.easy.array;

/**
 * Given the array nums consisting of 2n elements in the form
 * [x1,x2,...,xn,y1,y2,...,yn].
 * 
 * Return the array in the form [x1,y1,x2,y2,...,xn,yn].
 *
 * Example 1:
 * 
 * Input: nums = [2,5,1,3,4,7], n = 3
 * Output: [2,3,5,4,1,7]
 * Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is
 * [2,3,5,4,1,7].
 */

public class ShuffleArray1470 {

    // Time: O(n) | Space: O(n)
    public int[] shuffle(int[] nums, int n) {
        if (nums == null || nums.length == 0) {
            return new int[0];
        }

        int xPtr = 0;
        int yPtr = n;
        int[] ans = new int[n * 2];
        int index = 0;

        while (xPtr < n) {
            ans[index] = nums[xPtr];
            ans[index + 1] = nums[yPtr];
            index += 2;
            xPtr += 1;
            yPtr += 1;
        }

        return ans;
    }
}
