package com.dreamcc.demo.linked;

/**
 * @Title: LeetCode
 * @Package: com.dreamcc.leetcode.linked
 * @Description:
 * @Author: dreamcc
 * @Date: 2019/3/7 17:13
 * @Version: V1.0
 */
public class Demo4 {

	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode head = null;
		if(l1 == null){
			return l2;
		}
		if(l2 == null){
			return l1;
		}
		if(l1.val <= l2.val){
			head = l1;
			l1 = l1.next;
		}else{
			head = l2;
			l2 = l2.next;
		}
		ListNode temp = head;
		while(l1 != null && l2 != null){
			if(l1.val <= l2.val){
				temp.next = l1;
				l1 = l1.next;
			}else{
				temp.next = l2;
				l2 = l2.next;
			}
			temp = temp.next;
		}
		if (l1 == null) {
			temp.next = l2;
		}
		if (l2 == null) {
			temp.next = l1;
		}
		return head;
	}
}
