package com.dreamcc.demo.linked;

/**
 * @Title: LeetCode
 * @Package: com.dreamcc.leetcode.linked
 * @Description:
 * @Author: dreamcc
 * @Date: 2019/2/28 11:20
 * @Version: V1.0
 */
public class Demo1 {
	public void deleteNode(ListNode node) {
		if (node == null || node.next == null) {
			return;
		}
		ListNode next = node.next;
		node.next = next.next;
		node.val = next.val;
	}

	class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}
}
