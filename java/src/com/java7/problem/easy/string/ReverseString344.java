package com.java7.problem.easy.string;

/**
 * Write a function that reverses a string. The input string is given as an
 * array of characters s.
 * You must do this by modifying the input array in-place with O(1) extra
 * memory.
 * Input: s = ["h","e","l","l","o"]
 * Output: ["o","l","l","e","h"]
 */
public class ReverseString344 {

    public void reverseString(char[] s) {
        if (s == null || s.length == 0) {
            return;
        }

        int left = 0;
        int right = s.length - 1;

        while (left < right) {
            char temp = s[right];
            s[right] = s[left];
            s[left] = temp;
            left += 1;
            right -= 1;
        }
    }
}
