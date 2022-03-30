/**
 * Input: "abcabcbb"
   Output: 3 
   Explanation: The answer is "abc", with the length of 3.
   
   Input: "bbbbb"
   Output: 1
   Explanation: The answer is "b", with the length of 1.
   
   Input: "pwwkew"
   Output: 3
   Explanation: The answer is "wke", with the length of 3. 
   Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */
package com.java7.problem.medium;

/**
 * @author Aniket Kulkarni
 *
 */
public class LongestSubStrWithoutRepeatingChar3 {
    public int lengthOfLongestSubstring(String s) {
	String subStr = "";
	if (s == null || s.length() == 0)
	    return s.length();
	char lastCh = '\0';
	String tempSubStr = "";
	for (int i = 0; i < s.length(); i++) {
	    char ch = s.charAt(i);
	    if (ch == lastCh) {
		if (tempSubStr.length() == 0) {
		    tempSubStr = subStr;
		}
		subStr = "";
	    }
	    lastCh = ch;
	    if (subStr.indexOf(ch) != -1) {
		int index = subStr.indexOf(ch);
		if (tempSubStr.length() == 0)
		    tempSubStr = subStr;
		subStr = subStr.substring(index + 1);
	    }
	    subStr += String.valueOf(ch);
	    if (tempSubStr.length() <= subStr.length() && tempSubStr.length() != 0) {
		tempSubStr = "";
	    }
	}
	return tempSubStr.length() >= subStr.length() ? tempSubStr.length() : subStr.length();
    }

}
