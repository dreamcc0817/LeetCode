package com.dreamcc.demo.arrays;

/**
 * @Title: LeetCode
 * @Package: com.dreamcc.leetcode.arrays
 * @Description:给定一个非空整数数组，除了某个元素只出现一次以外，
 * 其余每个元素均出现两次。找出那个只出现了一次的元素。
 * @Author: dreamcc
 * @Date: 2018/12/1 22:26
 * @Version: V1.0
 */
public class Demo3 {
	public static void main(String[] args) {
		int[] aa = {2,2,1};
		int a = singleNumber(aa);
		System.out.println(a);
	}
	public static int singleNumber(int[] nums) {
		int i;
		lableB:
		for (i = 0; i < nums.length; i++) {
			for (int j = 0; j<nums.length;j++){
				if(i == j){
					break lableB;
				}
				if(i != j && nums[i]==nums[j]){
					continue;
				}
				if(j==nums.length-1){
					return nums[i];
				}
			}
		}
		return nums[nums.length-1];
	}
}
