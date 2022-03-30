package com.java7.problem.easy.array;

/**
 * Given an integer array nums and an integer val,
 * remove all occurrences of val in nums in-place. The relative order of the
 * elements may be changed.
 * Do not allocate extra space for another array.
 * You must do this by modifying the input array in-place with O(1) extra
 * memory.
 * 
 * Input: nums = [3,2,2,3], val = 3
 * Output: 2, nums = [2,2,_,_]
 * Explanation: Your function should return k = 2, with the first two elements
 * of nums being 2.
 * It does not matter what you leave beyond the returned k (hence they are
 * underscores).
 */

public class RemoveElement {

    public int removeElement(int[] nums, int val) {
        int k = 0;
        int swapIndex = 0;
        for (int index = 0; index < nums.length; index++) {
            if(nums[index] != val){
                int temp = nums[swapIndex];
                nums[swapIndex] = nums[index];
                nums[index] = temp;
                k++;
                swapIndex++;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        /* int[] nums = {3,2,2,3};
        int val = 3; */
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;
        RemoveElement obj = new RemoveElement();
        int k = obj.removeElement(nums, val);
        System.out.println(k);
    }
}
