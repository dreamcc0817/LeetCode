package com.dreamcc.start;

/**
 * @Title: LeetCode
 * @Package: com.dreamcc.start
 * @Description:
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 *
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
 * @Author: dreamcc
 * @Date: 2020/4/27 9:48
 * @Version: V1.0
 */
public class Solution1 {

	public int[] twoSum(int[] nums, int target) {

		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length; j++) {
				if(i == j){
					continue;
				}
				if(nums[i] + nums[j] == target){
					return new int[]{i,j};
				}
			}
		}
		return new int[]{0,0};
	}
}
