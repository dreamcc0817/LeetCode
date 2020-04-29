package com.dreamcc.old.leetcode;

import java.util.Arrays;

/**
 * @Title: LeetCode
 * @Package: com.dreamcc.old.leetcode
 * @Description: 只出现一次的数字
 * @Author: dreamcc
 * @Date: 2020/1/15 14:32
 * @Version: V1.0
 */
public class SingleNumber {
	public int singleNumber(int[] nums) {
		Arrays.sort(nums);
		for(int i = 0;i < nums.length - 1; i += 2){
			if(nums[i]!=nums[i+1]){
				return nums[i];
			}
		}
		return nums[nums.length-1];
	}
}
