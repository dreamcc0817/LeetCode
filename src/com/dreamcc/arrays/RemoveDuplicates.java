package com.dreamcc.arrays;

/**
 * @Title: LeetCode
 * @Package: com.dreamcc.arrays
 * @Description: 删除排序数组中的重复项
 * @Author: dreamcc
 * @Date: 2020/5/11 9:37
 * @Version: V1.0
 */
public class RemoveDuplicates {
	public int removeDuplicates(int[] nums) {
		int pre = 0;

		for (int i = 0; i < nums.length; i++) {
			if(i == 0){
				nums[pre] = nums[i];
				continue;
			}
			if(nums[pre] != nums[i]){
				nums[++pre] = nums[i];
			}
		}
		return ++pre;
	}

	public static void main(String[] args) {
		RemoveDuplicates r = new RemoveDuplicates();
		r.removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4});
	}
}
