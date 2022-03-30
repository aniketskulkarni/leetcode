/**
 * Given two binary strings, return their sum (also a binary string).

   The input strings are both non-empty and contains only characters 1 or 0.

   Example 1:
   Input: a = "11", b = "1"
   Output: "100"
   
   Example 2:
   Input: a = "1010", b = "1011"
   Output: "10101"
 */
package com.java7.problem.easy;

/**
 * @author Aniket Kulkarni
 *
 */
public class AddBinary67 {
    public String addBinary(String a, String b) {
	StringBuilder addition = new StringBuilder();
	int aLoop = a.length() - 1;
	int bLoop = b.length() - 1;
	int carry = 0;

	for (; aLoop >= 0 && bLoop >= 0; aLoop--) {
	    int aVal = a.charAt(aLoop) == 49 ? 1 : 0;
	    int bVal = b.charAt(bLoop) == 49 ? 1 : 0;
	    int sum = aVal + bVal + carry;
	    if (sum == 1 || sum == 0) {
		addition.append(sum);
		carry = 0;
	    } else if (sum == 2) {
		addition.append(0);
		carry = 1;
	    } else if (sum == 3) {
		addition.append(1);
		carry = 1;
	    }
	    bLoop -= 1;
	}
	while (aLoop >= 0) {
	    int aVal = a.charAt(aLoop) == 49 ? 1 : 0;
	    int sum = aVal + carry;
	    if (sum == 1 || sum == 0) {
		addition.append(sum);
		carry = 0;
	    } else if (sum == 2) {
		addition.append(0);
		carry = 1;
	    } else if (sum == 3) {
		addition.append(1);
		carry = 1;
	    }
	    aLoop -= 1;
	}
	while (bLoop >= 0) {
	    int bVal = b.charAt(bLoop) == 49 ? 1 : 0;
	    int sum = bVal + carry;
	    if (sum == 1 || sum == 0) {
		addition.append(sum);
		carry = 0;
	    } else if (sum == 2) {
		addition.append(0);
		carry = 1;
	    } else if (sum == 3) {
		addition.append(1);
		carry = 1;
	    }
	    bLoop -= 1;
	}
	if (carry > 0) {
	    addition.append(carry);
	}
	return addition.reverse().toString();
    }
}
