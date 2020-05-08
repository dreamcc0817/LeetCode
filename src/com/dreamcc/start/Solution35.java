package com.dreamcc.start;

/**
 * @Title: LeetCode
 * @Package: com.dreamcc.start
 * @Description: 搜索插入位置
 * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 *
 * 你可以假设数组中无重复元素。
 * @Author: dreamcc
 * @Date: 2020/5/8 9:24
 * @Version: V1.0
 */
public class Solution35 {
	public int searchInsert(int[] nums, int target) {
		for(int i = 0; i < nums.length;i++){
			if(nums[i] >= target){
				return i;
			}
		}
		return nums.length;
	}
}