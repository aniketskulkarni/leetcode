package com.java7.problem.easy.array;

/**
 * You are given two integer arrays nums1 and nums2, sorted in non-decreasing
 * order, and two integers m and n,
 * representing the number of elements in nums1 and nums2 respectively.
 * Merge nums1 and nums2 into a single array sorted in non-decreasing order.
 * The final sorted array should not be returned by the function,
 * but instead be stored inside the array nums1.
 * To accommodate this, nums1 has a length of m + n,
 * where the first m elements denote the elements that should be merged,
 * and the last n elements are set to 0 and should be ignored. nums2 has a
 * length of n.
 * 
 * Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
 * Output: [1,2,2,3,5,6]
 * Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
 * The result of the merge is [1,2,2,3,5,6] with the underlined elements coming
 * from nums1.
 */
public class MergeSortedArrays {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n == 0) {
            return;
        }

        int num2Index = 0;
        for (int num1Index = 0; num1Index < nums1.length && num2Index < n; num1Index++) {
            if (nums1[num1Index] > nums2[num2Index]) {
                shiftElementsToRight(num1Index, nums1);
                nums1[num1Index] = nums2[num2Index];
                num2Index++;
            }
        }

        while (num2Index != n) {
            nums1[m + num2Index] = nums2[num2Index];
            num2Index++;
        }
    }

    private void shiftElementsToRight(int index, int[] arr) {
        for (int end = arr.length - 1; end > index; end--) {
            arr[end] = arr[end - 1];
        }
    }

    /*
     * public static void main(String[] args) {
     * int[] nums1 = {4,0,0,0,0,0};
     * int[] nums2 = {1,2,3,5,6};
     * new MergeSortedArrays().merge(nums1, 1, nums2, 5);
     * int[] nums3 = {1};
     * int[] nums4 = {};
     * new MergeSortedArrays().merge(nums3, 1, nums4, 0);
     * int[] nums5 = {0};
     * int[] nums6 = {1};
     * new MergeSortedArrays().merge(nums5, 0, nums6, 1);
     * int[] nums7 = {1,2,3,0,0,0};
     * int[] nums8 = {2,5,6};
     * new MergeSortedArrays().merge(nums7, 3, nums8, 3);
     * int[] nums9 = {2,0};
     * int[] nums10 = {1};
     * new MergeSortedArrays().merge(nums9, 1, nums10, 1);
     * }
     */
}