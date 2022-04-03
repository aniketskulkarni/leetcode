package com.java7.problem.easy.array;

/**
 * A sentence is a list of words that are separated by a single space with no
 * leading or trailing spaces.
 * 
 * You are given an array of strings sentences, where each sentences[i]
 * represents a single sentence.
 * 
 * Return the maximum number of words that appear in a single sentence.
 *  
 * Example 1:
 * 
 * Input: sentences = ["alice and bob love leetcode", "i think so too", "this is
 * great thanks very much"]
 * Output: 6
 * Explanation:
 * - The first sentence, "alice and bob love leetcode", has 5 words in total.
 * - The second sentence, "i think so too", has 4 words in total.
 * - The third sentence, "this is great thanks very much", has 6 words in total.
 * Thus, the maximum number of words in a single sentence comes from the third
 * sentence, which has 6 words.
 */

public class MaxWordsInSentence2114 {

    // Time: O(n) | Space: O(1)
    public int mostWordsFound(String[] sentences) {
        if(sentences == null || sentences.length == 0) {
            return -1;
        }
        
        int maxWords = 0;
        
        for(int index = 0; index < sentences.length; index++) {
            String[] words = sentences[index].split(" ");
            maxWords = words.length > maxWords ? words.length : maxWords;
        }
        
        return maxWords;
    }
}
