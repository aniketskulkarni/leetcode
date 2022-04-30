package com.java7.problem.easy.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindTargetIndicesAfterSortingArray2089 {

    // Time: O(log(n)) | Space: O(n)
    public List<Integer> targetIndices(int[] nums, int target) {
        if(nums ==null || nums.length == 0) {
            return new ArrayList();
        }
        
        List<Integer> result = new ArrayList<>();
        
        Arrays.sort(nums);
        
        for(int index = 0; index < nums.length; index++) {
            if(nums[index] == target) {
                result.add(index);
            }
        }
        return result;
    }
}
