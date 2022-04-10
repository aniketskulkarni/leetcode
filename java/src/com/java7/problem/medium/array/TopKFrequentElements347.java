package com.java7.problem.medium.array;

/**
 * Given an integer array nums and an integer k, return the k most frequent elements.
 * You may return the answer in any order.
 * 
 * Example 1:
 * Input: nums = [1,1,1,2,2,3], k = 2
 * Output: [1,2]
 * 
 * Example 2:
 * Input: nums = [1], k = 1
 * Output: [1]
 */

import java.util.HashMap;
import java.util.Map;

public class TopKFrequentElements347 {

    public int[] topKFrequent(int[] nums, int k) {
        if (nums == null || nums.length == 0) {
            return new int[0];
        }

        int[] ans = new int[k];
        Map<Integer, Integer> counts = new HashMap<>();

        for (int index = 0; index < nums.length; index++) {
            int n = nums[index];
            if (counts.containsKey(n)) {
                int cnt = counts.get(n);
                counts.put(n, cnt + 1);
                continue;
            }
            counts.put(n, 1);
        }

        int ansIdx = 0;

        while (k > 0) {
            int max = 0;
            int n = -1;

            for (Map.Entry<Integer, Integer> entry : counts.entrySet()) {
                if (entry.getValue() > max) {
                    max = entry.getValue();
                    n = entry.getKey();
                }
            }
            ans[ansIdx] = n;
            ansIdx += 1;
            k -= 1;
            counts.remove(n);
        }
        return ans;
    }

    public static void main(String[] args) {
        TopKFrequentElements347 obj = new TopKFrequentElements347();
        int[] ans = obj.topKFrequent(new int[] { 1, 9, 8, 4, 6, 4, 6, 2, 7, 8, 9, 9, 9, 8, 7, 2 }, 3);
        for (int a : ans) {
            System.out.println(a);
        }
    }
}
