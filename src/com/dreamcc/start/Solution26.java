package com.dreamcc.start;

/**
 * @Title: LeetCode
 * @Package: com.dreamcc.start
 * @Description: 删除排序数组中的重复项
 * 给定一个排序数组，你需要在 原地 删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
 *
 * 不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
 *
 * @Author: dreamcc
 * @Date: 2020/5/6 9:03
 * @Version: V1.0
 */
public class Solution26 {
	public int removeDuplicates(int[] nums) {
		if(nums.length == 0 || nums.length == 1){
			return nums.length;
		}
		int result = 1;
		int temp = nums[0];
		for (int i = 1; i < nums.length; i++) {
			if(temp == nums[i]){
				continue;
			}else {
				nums[result] = nums[i];
				temp = nums[i];
				result++;
			}
		}
		return result;
	}
}
