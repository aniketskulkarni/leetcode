package com.java7.problem.easy.binarysearch;

/**
 * Given a characters array letters that is sorted in non-decreasing order and a
 * character target, return the smallest character in the array that is larger
 * than target.
 * 
 * Note that the letters wrap around.
 * 
 * For example, if target == 'z' and letters == ['a', 'b'], the answer is 'a'.
 * 
 * Example 1:
 * Input: letters = ["c","f","j"], target = "a"
 * Output: "c"
 * 
 * Example 2:
 * Input: letters = ["c","f","j"], target = "c"
 * Output: "f"
 * 
 * Example 3:
 * Input: letters = ["c","f","j"], target = "d"
 * Output: "f"
 * 
 * https://leetcode.com/problems/find-smallest-letter-greater-than-target/
 */
public class FindSmallestLetterGreaterThanTarget744 {

    // Time: O(log(n)) | Space: O(1)
    public char nextGreatestLetter(char[] letters, char target) {
        int n = letters.length;

        if (target >= letters[n - 1]) {
            target = letters[0];
        } else {
            target++;
        }

        int l = 0, r = n - 1;
        while (l < r) {
            int mid = l + (r - l) / 2;
            if (letters[mid] == target) {
                return letters[mid];
            }
            if (letters[mid] < target) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }
        return letters[r];
    }
}
