package com.java7.problem.easy.array;

/**
 * Given an array arr of integers, check if there exists two integers N and M
 * such that N is the double of M ( i.e. N = 2 * M).
 * 
 * Input: arr = [10,2,5,3]
 * Output: true
 * Explanation: N = 10 is the double of M = 5,that is, 10 = 2 * 5.
 * 
 * Input: arr = [3,1,7,11]
 * Output: false
 * Explanation: In this case does not exist N and M, such that N = 2 * M.
 */
public class ArraySearchCheckNM {

    public boolean checkIfExist(int[] arr) {
        if (arr == null || arr.length == 0) {
            return false;
        }
        for (int outerLoop = 0; outerLoop < arr.length; outerLoop++) {
            for (int innerLoop = 0; innerLoop < arr.length; innerLoop++)
                if (arr[outerLoop] == 2 * arr[innerLoop] && outerLoop != innerLoop)
                    return true;
        }
        return false;
    }

    public static void main(String[] args) {
        ArraySearchCheckNM obj = new ArraySearchCheckNM();
        System.out.println(obj.checkIfExist(new int[] { 10, 2, 5, 3 }));
        System.out.println(obj.checkIfExist(new int[] { 7, 1, 14, 11 }));
        System.out.println(obj.checkIfExist(new int[] { 3, 1, 7, 11 }));
    }
}
