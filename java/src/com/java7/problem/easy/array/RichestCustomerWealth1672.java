package com.java7.problem.easy.array;

/**
 * You are given an m x n integer grid accounts where accounts[i][j] is the
 * amount of money the i​​​​​​​​​​​th​​​​ customer has in the j​​​​​​​​​​​th​​​​
 * bank. Return the wealth that the richest customer has.
 * 
 * A customer's wealth is the amount of money they have in all their bank
 * accounts. The richest customer is the customer that has the maximum wealth.
 * 
 * Example 1:
 * 
 * Input: accounts = [[1,2,3],[3,2,1]]
 * Output: 6
 * Explanation:
 * 1st customer has wealth = 1 + 2 + 3 = 6
 * 2nd customer has wealth = 3 + 2 + 1 = 6
 * Both customers are considered the richest with a wealth of 6 each, so return
 * 6.
 */
public class RichestCustomerWealth1672 {

    // Time: O(m*n) | Space: O(1)
    public int maximumWealth(int[][] accounts) {
        if (accounts == null || accounts.length == 0) {
            return -1;
        }

        int richestWealth = 0;

        for (int mIdx = 0; mIdx < accounts.length; mIdx++) {
            int currentWealth = 0;
            for (int nIdx = 0; nIdx < accounts[mIdx].length; nIdx++) {
                currentWealth += accounts[mIdx][nIdx];
            }
            richestWealth = currentWealth > richestWealth ? currentWealth : richestWealth;
        }

        return richestWealth;
    }
}
