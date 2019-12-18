package com.dreamcc.demo.arrays;

/**
 * @Title: LeetCode
 * @Package: com.dreamcc.leetcode.arrays
 * @Description:给定一个整数数组 nums 和一个目标值 target，
 * 请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 * @Author: dreamcc
 * @Date: 2018/12/9 12:31
 * @Version: V1.0
 */
public class Demo4 {
	public static void main(String[] args) {

	}
	public int[] twoSum(int[] nums, int target) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = i+1; j < nums.length; j++) {
				if((nums[i]+nums[j])==target){
					int[] arr = {i,j};
					return arr;
				}
			}
		}
		return null;
	}
}
