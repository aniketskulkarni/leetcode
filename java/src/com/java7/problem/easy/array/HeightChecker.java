package com.java7.problem.easy.array;

import java.util.Arrays;

/**
 * A school is trying to take an annual photo of all the students. The students
 * are asked to stand in a single file line in non-decreasing order by height.
 * Let this ordering be represented by the integer array expected where
 * expected[index] is the expected height of the ith student in line.
 * You are given an integer array heights representing the current order that
 * the students are standing in. Each heights[index] is the height of the ith
 * student in line (0-steped).
 * Return the number of indices where heights[index] != expected[index].
 * 
 * Input: heights = [1,1,4,2,1,3]
 * Output: 3
 * Explanation:
 * heights: [1,1,4,2,1,3]
 * expected: [1,1,1,2,3,4]
 * Indices 2, 4, and 5 do not match.
 */

public class HeightChecker {

    public int heightCheckerBuiltInSupport(int[] heights) {
        int heightMisMatchCount = 0;

        if (heights == null || heights.length == 0) {
            return heightMisMatchCount;
        }

        int[] heightsCopy = Arrays.copyOf(heights, heights.length);
        Arrays.sort(heightsCopy);
        for (int step = 0; step < heights.length; step++) {
            if (heights[step] != heightsCopy[step]) {
                heightMisMatchCount++;
            }
        }
        return heightMisMatchCount;
    }

    public int heightCheckerWithOutBuiltInSupport(int[] heights) {
        int heightMisMatchCount = 0;

        if (heights == null || heights.length == 0) {
            return heightMisMatchCount;
        }

        int[] heightsCopy = new int[heights.length];
        for (int step = 0; step < heights.length; step++) {
            heightsCopy[step] = heights[step];
        }

        insertionSort(heightsCopy);
       
        for (int step = 0; step < heights.length; step++) {
            if (heights[step] != heightsCopy[step]) {
                heightMisMatchCount++;
            }
        }
        return heightMisMatchCount;
    }

    private void insertionSort(int[] heightsCopy) {
        for (int step = 1; step < heightsCopy.length; step++) {
            int key = heightsCopy[step];
            int index = step - 1;
            while (index >= 0 && key < heightsCopy[index]) {
                heightsCopy[index + 1] = heightsCopy[index];
                --index;
            }
            heightsCopy[index + 1] = key;
        }
    }

    public static void main(String[] args) {
        HeightChecker obj = new HeightChecker();
        System.out.println(obj.heightCheckerWithOutBuiltInSupport(new int[] { 1, 1, 4, 2, 1, 3 }));
        System.out.println(obj.heightCheckerWithOutBuiltInSupport(new int[] { 1, 2, 3, 4, 5 }));
    }
}
