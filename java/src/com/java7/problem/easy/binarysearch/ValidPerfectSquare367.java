package com.java7.problem.easy.binarysearch;

/**
 * Given a positive integer num, write a function which returns True if num is a
 * perfect square else False.
 * 
 * Follow up: Do not use any built-in library function such as sqrt.
 * 
 * Example 1:
 * 
 * Input: num = 16
 * Output: true
 * Example 2:
 * 
 * Input: num = 14
 * Output: false
 */

public class ValidPerfectSquare367 {

    public boolean isPerfectSquare(int num) {

        int left = 1, right = num;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (mid * mid == num) {
                return true;
            }
            if (mid > num / mid) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ValidPerfectSquare367 obj = new ValidPerfectSquare367();
        System.out.println(obj.isPerfectSquare(5));
    }
}
