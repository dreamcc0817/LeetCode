package com.dreamcc.demo.arrays;

import java.util.HashSet;
import java.util.Set;

/**
 * @Title: LeetCode
 * @Package: com.dreamcc.leetcode
 * @Description: 存在重复元素
 * @Author: dreamcc
 * @Date: 2019/12/18 22:08
 * @Version: V1.0
 */
public class ContainsDuplicate {
	/**
	 * 空间复杂度O(n)，时间复杂度O(n)
	 *
	 * @param nums
	 * @return
	 */
	public boolean containsDuplicate(int[] nums) {
		Set other = new HashSet(nums.length);
		for (int num : nums) {
			other.add(num);
		}
		if (other.size() != nums.length) {
			return true;
		}
		return false;
	}
}
