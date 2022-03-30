package com.java7.problem.easy.array;

/**
 * Given an array nums of integers, return how many of them contain an even number of digits.
 * Input: nums = [12,345,2,6,7896]
 * Output: 2
 * Explanation: 
 * 12 contains 2 digits (even number of digits). 
 * 345 contains 3 digits (odd number of digits). 
 * 2 contains 1 digit (odd number of digits). 
 * 6 contains 1 digit (odd number of digits). 
 * 7896 contains 4 digits (even number of digits). 
 * Therefore only 12 and 7896 contain an even number of digits.
 */

 public class NumbersWithEvenDigits {
     public int findNumbers(int[] nums) {
        if(nums == null)
            return 0;
        
        int countEvenNumDigits = 0;
        for(int num: nums) {
            int n = num;
            int countNumDigits = 0;
            while(num > 0) {
                countNumDigits++;
                num = num / 10;
            }
            if(countNumDigits % 2 == 0) {
                countEvenNumDigits++;
            }
        }
        return countEvenNumDigits;
    }
 }