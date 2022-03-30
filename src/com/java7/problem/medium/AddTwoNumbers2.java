/**
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
   Output: 7 -> 0 -> 8
   Explanation: 342 + 465 = 807.
 */
package com.java7.problem.medium;

/**
 * @author Aniket Kulkarni
 *
 */
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
	val = x;
    }
}

public class AddTwoNumbers2 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	if (l1 == null || l2 == null) {
	    return null;
	}
	ListNode ans = null;
	ListNode tmp = null;
	int carry = -1;
	while ((l1 != null || l2 != null) || carry != -1) {
	    int sum = 0;
	    int val1 = l1 != null ? l1.val : 0;
	    int val2 = l2 != null ? l2.val : 0;
	    sum = carry != -1 ? val1 + val2 + carry : val1 + val2;
	    carry = -1;
	    if (sum >= 10) {
		carry = 1;
	    }
	    if (tmp == null) {
		tmp = new ListNode(sum % 10);
	    } else {
		tmp.next = new ListNode(sum % 10);
		tmp = tmp.next;
	    }
	    if (ans == null) {
		ans = tmp;
	    }
	    l1 = l1 != null ? l1.next : null;
	    l2 = l2 != null ? l2.next : null;
	}
	return ans;
    }
}
