/**
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

   An input string is valid if:

   Open brackets must be closed by the same type of brackets.
   Open brackets must be closed in the correct order.
   Note that an empty string is also considered valid.

   Example 1:
     Input: "()"
     Output: true

   Example 2:
     Input: "()[]{}"
     Output: true

   Example 3:
     Input: "(]"
     Output: false
   
   Example 4:
     Input: "([)]"
     Output: false

   Example 5:
     Input: "{[]}"
     Output: true
 */
package com.java7.problem.easy;

import java.util.Stack;

/**
 * @author Aniket Kulkarni
 *
 */
public class ValidParentheses20 {

    public boolean isValid(String s) {
	if (s == null)
	    return false;
	if (s.isEmpty())
	    return true;
	Stack<Character> myCharStack = new Stack<>();
	for (int i = 0; i < s.length(); i++) {
	    char ch = s.charAt(i);
	    if (ch == '(' || ch == '[' || ch == '{') {
		myCharStack.push(ch);
		continue;
	    }
	    if (myCharStack.empty()) {
		return false;
	    }
	    char popedChar = myCharStack.pop();
	    if (ch == ')') {
		if (popedChar == '(')
		    continue;
		return false;
	    } else if (ch == '}') {
		if (popedChar == '{')
		    continue;
		return false;
	    } else if (ch == ']') {
		if (popedChar == '[')
		    continue;
		return false;
	    }
	}
	if (!myCharStack.empty())
	    return false;
	return true;
    }
}
