package com.dreamcc.old.leetcode;

import java.util.Map;
import java.util.TreeMap;

/**
 * @Title: LeetCode
 * @Package: com.dreamcc.old.leetcode
 * @Description: 多数元素
 * @Author: dreamcc
 * @Date: 2020/1/15 14:33
 * @Version: V1.0
 */
public class MajorityElement {
	public int majorityElement(int[] nums) {
		int mid = nums.length / 2;
		if (mid == 0){
			return nums[0];
		}
		Map<Integer,Integer> count = new TreeMap<>();
		for (int num : nums) {
			if(count.containsKey(num)){
				int value = count.get(num) + 1;
				if(value > mid){
					return num;
				}
				count.put(num,value);
			}else {
				count.put(num,0);
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		MajorityElement majorityElement = new MajorityElement();
		majorityElement.majorityElement(new int[]{3});
	}
}
