package com.dreamcc.old.demo.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Title: LeetCode
 * @Package: com.dreamcc.old.leetcode.arrays
 * @Description: 给定两个数组，编写一个函数来计算它们的交集。
 * @Author: dreamcc
 * @Date: 2019/1/30 15:05
 * @Version: V1.0
 */
public class Demo9 {
	public int[] intersect(int[] nums1, int[] nums2) {
		List<Integer> tmp = new ArrayList<>();

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < nums1.length; i++) {
			Integer value = map.get(nums1[i]);
			map.put(nums1[i], (value == null ? 0 : value) + 1);
		}

		for (int i = 0; i < nums2.length; i++) {
			if (map.containsKey(nums2[i]) && map.get(nums2[i]) != 0) {
				tmp.add(nums2[i]);
				map.put(nums2[i], map.get(nums2[i]) - 1);
			}
		}

		int[] result = new int[tmp.size()];
		int i = 0;
		for (Integer e : tmp)
			result[i++] = e;
		return result;
	}

	public static void main(String[] args) {

	}
}
