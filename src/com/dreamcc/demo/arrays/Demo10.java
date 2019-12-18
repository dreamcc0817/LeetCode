package com.dreamcc.demo.arrays;

/**
 * @Title: LeetCode
 * @Package: com.dreamcc.leetcode.arrays
 * @Description:给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那两个整数，并返回他们的数组下标。
 * <p>
 * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 * @Author: dreamcc
 * @Date: 2019/2/18 10:21
 * @Version: V1.0
 */
public class Demo10 {
	public int[] twoSum(int[] nums, int target) {
		int[] resultArr = new int[2];
		int result = 0;
		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				result = nums[i] + nums[j];
				if (target == result) {
					resultArr[0] = i;
					resultArr[1] = j;
					break;
				}
			}
		}
		return resultArr;
	}
}
