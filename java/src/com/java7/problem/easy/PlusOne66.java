/**
 * Given a non-empty array of digits representing a non-negative integer, plus one to the integer.

   The digits are stored such that the most significant digit is at the head of the list, and each element in the array contain a single digit.

   You may assume the integer does not contain any leading zero, except the number 0 itself.
   
   Input: [1,2,3]
   Output: [1,2,4]
   Explanation: 123
               +  1
              ------
                124
   Input: [1,5,9,9]
   Output: [1,6,0,0]
   Explanation: 1599
               +   1
              -------
                1600
 */
package com.java7.problem.easy;

/**
 * @author Aniket Kulkarni
 *
 */
public class PlusOne66 {

    public int[] plusOne(int[] digits) {
	if (digits == null || digits.length == 0) {
	    return digits;
	}
	if ((digits.length == 1 && digits[0] == 9)
		|| (digits.length > 1 && digits[1] == 9 && digits[0] == 9 && digits[digits.length - 1] == 9)) {
	    int[] temp = new int[digits.length + 1];
	    for (int i = 1; i < temp.length; i++) {
		temp[i] = digits[i - 1];
	    }
	    digits = temp;
	}
	int carry = 0;
	for (int i = digits.length - 1; i >= 0; i--) {
	    if (i == digits.length - 1) {
		if (digits[i] == 9) {
		    digits[i] = 0;
		    carry = 1;
		    continue;
		} else {
		    digits[i] = digits[i] + 1;
		}
	    }
	    if (carry == 0) {
		break;
	    }
	    if (digits[i] + carry == 10) {
		digits[i] = 0;
		carry = 1;
		continue;
	    }
	    digits[i] = digits[i] + carry;
	    carry = 0;
	}
	return digits;
    }

    public static void main(String[] args) {

	int[] digits = { 9, 5, 9 };
	int[] result = new PlusOne66().plusOne(digits);
	for (int i : result) {
	    System.out.print(i + " ");
	}
    }

}
