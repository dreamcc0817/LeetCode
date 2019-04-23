package com.dreamcc.leetcode.arrays;

/**
 * @Title: LeetCode
 * @Package: com.dreamcc.leetcode.arrays
 * @Description:
 * @Author: dreamcc
 * @Date: 2018/8/20 11:10
 * @Version: V1.0
 */
public class Demo2 {
	public static int singleNumber(int[] nums) {
		int value = 0;
		for (int i = 0; i < nums.length; i++) {
			value ^= nums[i];
		}
		return value;
	}

	public static void main(String[] args) {
		int[] nums = {4, 1, 2, 1, 2};
		int value = singleNumber(nums);
		System.out.println("value = " + value);
	}
}
