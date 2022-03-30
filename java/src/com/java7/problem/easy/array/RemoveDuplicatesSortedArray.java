package com.java7.problem.easy.array;

/**
 * Given an integer array nums sorted in non-decreasing order, remove the
 * duplicates in-place such that each unique element appears only once. The
 * relative order of the elements should be kept the same.
 * Return k after placing the final result in the first k slots of nums.
 * Do not allocate extra space for another array. You must do this by modifying
 * the input array in-place with O(1) extra memory.
 * 
 * Input: nums = [1,1,2]
 * Output: 2, nums = [1,2,_]
 * Explanation: Your function should return k = 2, with the first two elements
 * of nums being 1 and 2 respectively.
 * It does not matter what you leave beyond the returned k (hence they are
 * underscores).
 */
public class RemoveDuplicatesSortedArray {

    public int removeDuplicates(int[] nums) {
        int uniqueElements = 1;
        for (int index = 1; index < nums.length; index++) {
            if (nums[index] != nums[uniqueElements - 1]) {
                nums[uniqueElements] = nums[index];
                uniqueElements++;
            }
        }
        return uniqueElements;
    }

    public static void main(String[] args) {
        //int[] nums = { 1, 1, 2 };
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        RemoveDuplicatesSortedArray obj = new RemoveDuplicatesSortedArray();
        int k = obj.removeDuplicates(nums);
        System.out.println(k);
    }

}
