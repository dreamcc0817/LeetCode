package com.dreamcc.demo.arrays;

/**
 * @Title: LeetCode
 * @Package: com.dreamcc.leetcode.arrays
 * @Description:
 * @Author: dreamcc
 * @Date: 2018/8/20 10:16
 * @Version: V1.0
 */
public class Demo1 {
	public static int removeDuplicates(int[] nums) {
		int number = 0;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] != nums[number]) {
				nums[++number] = nums[i];
			}
		}
		return number + 1;
	}

	public static void main(String[] args) {
		int[] nums = {1, 1, 2, 3, 3, 5, 6, 7, 8};
		int num = removeDuplicates(nums);
		System.out.println(num);
	}
}
