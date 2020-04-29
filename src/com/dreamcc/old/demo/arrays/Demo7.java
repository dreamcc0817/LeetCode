package com.dreamcc.old.demo.arrays;

import java.util.HashSet;

/**
 * @Title: LeetCode
 * @Package: com.dreamcc.old.leetcode.arrays
 * @Description: 给定一个整数数组，判断是否存在重复元素。
 * 如果任何值在数组中出现至少两次，函数返回 true。如果数组中每个元素都不相同，则返回 false。
 * @Author: dreamcc
 * @Date: 2019/1/23 17:43
 * @Version: V1.0
 */
public class Demo7 {
	public static boolean containsDuplicate(int[] nums) {
		HashSet set = new HashSet();
		for (int i = 0; i < nums.length; i++) {
			set.add(nums[i]);
		}
		return nums.length != set.size() ? true : false;
	}

	public static void main(String[] args) {
		boolean result = containsDuplicate(new int[]{1,2,11,22});
		System.out.println("result = " + result);
	}
}
