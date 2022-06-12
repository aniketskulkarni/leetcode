package com.java7.problem.easy.binarysearch;

public class BinarySearch704 {

    // Time: O(log(n)) | Space: O(1)
    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (target == nums[mid]) {
                return mid;
            } else if (target < nums[mid]) {
                r = mid - 1;
            } else if (target > nums[mid]) {
                l = mid + 1;
            }
        }
        return -1;
    }
}
