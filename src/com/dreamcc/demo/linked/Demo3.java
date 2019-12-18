package com.dreamcc.demo.linked;

/**
 * @Title: LeetCode
 * @Package: com.dreamcc.leetcode.linked
 * @Description:
 * @Author: dreamcc
 * @Date: 2019/3/6 11:01
 * @Version: V1.0
 */
public class Demo3 {
	static class ListNode{
		int data;
		ListNode next;
		public ListNode(int data){
			this.data = data;
		}
	}
	//循环方式
	public static ListNode reverse(ListNode head){
		if (head == null){
			return null;
		}
		ListNode cur = head;
		ListNode oldHead = null;
		ListNode newHead = null;
		while(cur != null){
			oldHead = cur.next;
			cur.next = newHead;
			newHead = cur;
			cur = oldHead;
		}

		return newHead;
	}
	public static void main(String[] args) {
		// 测试
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(4);
		ListNode node5 = new ListNode(5);
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		ListNode head = new ListNode(0);
		head = reverse(node1);
		while(head!=null){
			System.out.println(head.data);
			head = head.next;
		}
	}

}
