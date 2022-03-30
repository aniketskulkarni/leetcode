package com.java7.problem.easy.array;

/**
 * Given an array arr, replace every element in that array with the greatest
 * element among the elements to its right, and replace the last element with
 * -1.
 * After doing so, return the array.
 * 
 * Input: arr = [17,18,5,4,6,1]
 * Output: [18,6,6,6,1,-1]
 * Explanation:
 * - index 0 --> the greatest element to the right of index 0 is index 1 (18).
 * - index 1 --> the greatest element to the right of index 1 is index 4 (6).
 * - index 2 --> the greatest element to the right of index 2 is index 4 (6).
 * - index 3 --> the greatest element to the right of index 3 is index 4 (6).
 * - index 4 --> the greatest element to the right of index 4 is index 5 (1).
 * - index 5 --> there are no elements to the right of index 5, so we put -1.
 * 
 * Input: arr = [400]
 * Output: [-1]
 * Explanation: There are no elements to the right of index 0.
 */

public class ReplaceWithGreatestElement {

    public int[] replaceElements(int[] arr) {
        if (arr == null || arr.length == 0) {
            return new int[0];
        }

        int end = arr.length - 1;
        int maxElement = arr[end];
        arr[end] = -1;
        end--;

        while (end >= 0) {
            int temp = arr[end];
            arr[end] = maxElement;
            if (temp > maxElement) {
                maxElement = temp;
            }

            end--;
        }
        return arr;
    }

    public static void main(String[] args) {
        ReplaceWithGreatestElement obj = new ReplaceWithGreatestElement();
        // int[] output = obj.replaceElements(new int[] {17,18,5,4,6,1});
        // int[] output = obj.replaceElements(new int[] {400});
        int[] output = obj.replaceElements(new int[] { 400, 200 });
        for (int element : output) {
            System.out.print(element + " ");
        }
    }
}
