package com.dreamcc.start;

/**
 * @Title: LeetCode
 * @Package: com.dreamcc.start
 * @Description: 合并两个有序链表, 将两个升序链表合并为一个新的升序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 * @Author: dreamcc
 * @Date: 2020/4/30 11:23
 * @Version: V1.0
 */
public class Solution21 {

	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode result = null;
		if (l1 == null && l2 == null) {
			return null;
		}
		if(l1 == null){
			return l2;
		}
		if(l2 == null){
			return l1;
		}
		if(l1.val < l2.val){
			result = l1;
			result.next = mergeTwoLists(l1.next,l2);
		}else {
			result = l2;
			result.next = mergeTwoLists(l1,l2.next);
		}


		return result;
	}
}
