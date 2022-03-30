package com.java7.problem.easy.array;

/**
 * Given an array of integers arr, return true if and only if it is a valid
 * mountain array.
 * 
 * Recall that arr is a mountain array if and only if:
 * arr.length >= 3
 * There exists some i with 0 < i < arr.length - 1 such that:
 * arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
 * arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
 * 
 * Input: arr = [3,5,5]
 * Output: false
 * 
 * Input: arr = [0,3,2,1]
 * Output: true
 */
public class ValidMountainArray {

    public boolean validMountainArray(int[] arr) {
        if (arr == null || arr.length < 3)
            return false;

        int n = arr.length, leftIndex = 0, rightIndex = n - 1;
        while (leftIndex < n - 1) {
            if (arr[leftIndex] < arr[leftIndex + 1])
                leftIndex++;
            else
                break;
        }

        if (leftIndex == n - 1)
            return false;

        while (rightIndex > 0) {
            if (arr[rightIndex] < arr[rightIndex - 1])
                rightIndex--;
            else
                break;
        }

        if (rightIndex == 0)
            return false;

        return leftIndex == rightIndex;
    }

    public static void main(String[] args) {
        ValidMountainArray obj = new ValidMountainArray();
        System.out.println(obj.validMountainArray(new int[] { 2, 1 }));
        System.out.println(obj.validMountainArray(new int[] { 3, 5, 5 }));
        System.out.println(obj.validMountainArray(new int[] { 0, 3, 2, 1 }));
        System.out.println(obj.validMountainArray(new int[] { 5, 4, 3, 2, 0 }));
        System.out.println(obj.validMountainArray(new int[] { 0, 2, 4, 7, 9 }));
    }
}
