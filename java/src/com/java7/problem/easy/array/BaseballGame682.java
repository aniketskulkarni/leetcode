package com.java7.problem.easy.array;

import java.util.ArrayList;
import java.util.List;

/**
 * You are keeping score for a baseball game with strange rules. The game
 * consists of several rounds, where the scores of past rounds may affect future
 * rounds' scores.
 * 
 * At the beginning of the game, you start with an empty record. You are given a
 * list of strings ops, where ops[i] is the ith operation you must apply to the
 * record and is one of the following:
 * 
 * An integer x - Record a new score of x.
 * "+" - Record a new score that is the sum of the previous two scores. It is
 * guaranteed there will always be two previous scores.
 * "D" - Record a new score that is double the previous score. It is guaranteed
 * there will always be a previous score.
 * "C" - Invalidate the previous score, removing it from the record. It is
 * guaranteed there will always be a previous score.
 * Return the sum of all the scores on the record.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: ops = ["5","2","C","D","+"]
 * Output: 30
 * Explanation:
 * "5" - Add 5 to the record, record is now [5].
 * "2" - Add 2 to the record, record is now [5, 2].
 * "C" - Invalidate and remove the previous score, record is now [5].
 * "D" - Add 2 * 5 = 10 to the record, record is now [5, 10].
 * "+" - Add 5 + 10 = 15 to the record, record is now [5, 10, 15].
 * The total sum is 5 + 10 + 15 = 30.
 * Example 2:
 * 
 * Input: ops = ["5","-2","4","C","D","9","+","+"]
 * Output: 27
 * Explanation:
 * "5" - Add 5 to the record, record is now [5].
 * "-2" - Add -2 to the record, record is now [5, -2].
 * "4" - Add 4 to the record, record is now [5, -2, 4].
 * "C" - Invalidate and remove the previous score, record is now [5, -2].
 * "D" - Add 2 * -2 = -4 to the record, record is now [5, -2, -4].
 * "9" - Add 9 to the record, record is now [5, -2, -4, 9].
 * "+" - Add -4 + 9 = 5 to the record, record is now [5, -2, -4, 9, 5].
 * "+" - Add 9 + 5 = 14 to the record, record is now [5, -2, -4, 9, 5, 14].
 * The total sum is 5 + -2 + -4 + 9 + 5 + 14 = 27.
 * Example 3:
 * 
 * Input: ops = ["1"]
 * Output: 1
 */

public class BaseballGame682 {

    // Time: O(n) | Space: O(1)
    public int calPoints(String[] ops) {
        if (ops == null || ops.length == 0) {
            return -1;
        }

        int sum = 0;
        List<Integer> scores = new ArrayList<>();
        int scoreIdx = 0;

        for (int index = 0; index < ops.length; index++) {
            switch (ops[index]) {
                case "+":
                    int addition = scores.get(scoreIdx - 1) + scores.get(scoreIdx - 2);
                    scores.add(addition);
                    scoreIdx += 1;
                    break;
                case "D":
                    int multiply = scores.get(scoreIdx - 1) * 2;
                    scores.add(multiply);
                    scoreIdx += 1;
                    break;
                case "C":
                    scores.remove(scoreIdx - 1);
                    scoreIdx -= 1;
                    break;
                default:
                    scores.add(Integer.parseInt(ops[index]));
                    scoreIdx += 1;
            }
        }

        for (int score : scores) {
            sum += score;
        }

        return sum;
    }

    public static void main(String[] args) {
        BaseballGame682 obj = new BaseballGame682();
        System.out.println(obj.calPoints(new String[] { "5", "2", "C", "D", "+" }));
    }
}
