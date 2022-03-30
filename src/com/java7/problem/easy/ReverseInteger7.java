/**
 * Given a 32-bit signed integer, reverse digits of an integer.
 * Input: 123
   Output: 321
   
   Input: -123
   Output: -321
   
   Input: 120
   Output: 21
   
   For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.
 */
package com.java7.problem.easy;

/**
 * @author Aniket Kulkarni
 *
 */
public class ReverseInteger7 {

    public int reverse(int x) {
	if (x == 0) {
	    return 0;
	}
	if (x / 10 == 0) {
	    return x;
	}
	int s = 0;
	while (x != 0) {
	    int mod = x % 10;
	    int tmp = s * 10 + mod;
	    if ((tmp - mod) / 10 != s) {
		return 0;
	    }
	    s = tmp;
	    x = x / 10;
	}
	return s;
    }
}
