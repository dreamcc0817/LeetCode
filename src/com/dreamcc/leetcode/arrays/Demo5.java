package com.dreamcc.leetcode.arrays;

/**
 * @Title: LeetCode
 * @Package: com.dreamcc.leetcode.arrays
 * @Description:给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 * @Author: dreamcc
 * @Date: 2018/12/14 22:20
 * @Version: V1.0
 */
public class Demo5 {
	public static void main(String[] args) {
		int[] nums = {0,0,1};
		nums = moveZeroes(nums);
		for (int num : nums) {
			System.out.println("num = " + num);
		}
	}
	public static int[] moveZeroes(int[] nums) {

		int len  = nums.length;
		for (int i = 0; i < len; i++) {
			if(nums[i]==0){
				for (int j = i; j < nums.length - 1; j++) {
					nums[j] = nums[j+1];
				}
				nums[nums.length - 1] = 0;
				i--;
				len--;
			}
		}
		return nums;
	}
}
