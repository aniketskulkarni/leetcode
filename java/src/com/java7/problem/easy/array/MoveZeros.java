package com.java7.problem.easy.array;

/**
 * Given an integer array nums, move all 0's to the end of it while maintaining
 * the relative order of the non-zero elements.
 * Note that you must do this in-place without making a copy of the array.
 * 
 * Input: nums = [0,1,0,3,12]
 * Output: [1,3,12,0,0]
 * 
 * Input: nums = [0]
 * Output: [0]
 */
public class MoveZeros {

    public void moveZeroes(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }
        int writeIndex, readIndex;
        writeIndex = readIndex = 0;
        for (; readIndex < nums.length; readIndex++) {
            if (nums[readIndex] != 0) {
                nums[writeIndex] = nums[readIndex];
                writeIndex++;
            }
        }
        while (readIndex != writeIndex) {
            nums[writeIndex] = 0;
            writeIndex++;
        }
    }

    public static void main(String[] args) {
        MoveZeros obj = new MoveZeros();
        //int[] nums = new int[] { 0, 1, 0, 3, 12 };
        int[] nums = new int[] { 0};
        obj.moveZeroes(nums);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
