package com.dreamcc.demo.linked;

/**
 * @Title: LeetCode
 * @Package: com.dreamcc.leetcode.linked
 * @Description:
 * @Author: dreamcc
 * @Date: 2019/2/28 11:47
 * @Version: V1.0
 */
public class Demo2 {
	 ListNode removeNthFromEnd(ListNode head, int n) {
		if (head == null) {
			return null;
		}
		ListNode fast = head;
		ListNode slow = head;
		for (int i = 0; i < n; i++) {
			fast = fast.next;
		}
		if (fast == null) {
			return fast.next;
		}
		if (fast == head) {
			return null;
		}
		while (fast.next != null) {
			fast = fast.next;
			slow = slow.next;
		}
		slow.next = slow.next.next;
		return head;
	}
	static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public static void main(String[] args) {
		Demo2 demo2 = new Demo2();
		ListNode head = new ListNode(2);
		demo2.removeNthFromEnd(head,1);
	}
}
