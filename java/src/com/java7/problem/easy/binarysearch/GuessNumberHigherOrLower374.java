package com.java7.problem.easy.binarysearch;

/**
 * We are playing the Guess Game. The game is as follows:
 * 
 * I pick a number from 1 to n. You have to guess which number I picked.
 * 
 * Every time you guess wrong, I will tell you whether the number I picked is
 * higher or lower than your guess.
 * 
 * You call a pre-defined API int guess(int num), which returns three possible
 * results:
 * -1: Your guess is higher than the number I picked (i.e. num > pick).
 * 1: Your guess is lower than the number I picked (i.e. num < pick).
 * 0: your guess is equal to the number I picked (i.e. num == pick).
 * Return the number that I picked.
 * 
 * Example 1:
 * 
 * Input: n = 10, pick = 6
 * Output: 6
 * Example 2:
 * 
 * Input: n = 1, pick = 1
 * Output: 1
 * Example 3:
 * 
 * Input: n = 2, pick = 1
 * Output: 1
 * 
 * https://leetcode.com/problems/guess-number-higher-or-lower/
 */

public class GuessNumberHigherOrLower374 extends GuessGame {

    // Time: O(log(n)) | Space: O(1)
    public int guessNumber(int n) {
        int low = 1;
        int high = n;
        while (low <= high) {
            int mid = low + (high - low) / 2; // to avoid overflow of int
            int res = guess(mid);
            if (res == 0) {
                return mid;
            } else if (res == -1) {
                high = mid - 1;
            } else if (res == 1) {
                low = mid + 1;
            }
        }
        return -1;
    }
}

class GuessGame {
    public int guess(int n) {
        // fake implementation - to make compiler happy :)
        return n;
    }
}
