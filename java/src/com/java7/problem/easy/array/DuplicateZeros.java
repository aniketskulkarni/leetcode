package com.java7.problem.easy.array;

/**
 * Given a fixed-length integer array arr,
 * duplicate each occurrence of zero, shifting the remaining elements to the
 * right.
 * 
 * Input: arr = [1,0,2,3,0,4,5,0]
 * Output: [1,0,0,2,3,0,0,4]
 * Explanation: After calling your function, the input array is modified to:
 * [1,0,0,2,3,0,0,4]
 */
public class DuplicateZeros {

    public void duplicateZeros(int[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }

        for (int index = 0; index < arr.length; index++) {
            if (arr[index] == 0) {
                shiftElementsToRight(index, arr);
                index++;
            }
        }
    }

    private void shiftElementsToRight(int index, int[] arr) {
        for (int end = arr.length - 1; end > index; end--) {
            arr[end] = arr[end - 1];
        }
    }
}