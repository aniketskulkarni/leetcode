package com.java7.problem.easy;

/**
 * Given a non-negative integer x, compute and return the square root of x.
 * 
 * Since the return type is an integer, the decimal digits are truncated, and
 * only the integer part of the result is returned.
 * 
 * Note: You are not allowed to use any built-in exponent function or operator,
 * such as pow(x, 0.5) or x ** 0.5.
 * 
 * Example 1:
 * Input: x = 4
 * Output: 2
 * 
 * Example 2:
 * Input: x = 8
 * Output: 2
 * 
 * Explanation: The square root of 8 is 2.82842..., and since the decimal part
 * is truncated, 2 is returned.
 * 
 * https://leetcode.com/problems/sqrtx/
 * https://www.vedantu.com/formula/square-root-formula <- Repeated Subtraction method
 */
public class SqrtOfX69 {
    public int mySqrt(int x) {
        int oddNum = 1;
        int count = 0;
        while (x > 0) {
            x -= oddNum;
            oddNum += 2;
            count += 1;
        }
        return x < 0 ? count - 1 : count;
    }
}
