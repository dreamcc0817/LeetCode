package com.dreamcc.start;

import java.util.HashMap;

/**
 * @Title: LeetCode
 * @Package: com.dreamcc.start
 * @Description: 罗马数字转整数
 * @Author: dreamcc
 * @Date: 2020/4/28 8:59
 * @Version: V1.0
 */
public class Solution13 {

	public int romanToInt(String s) {
		HashMap<Character, Integer> map = new HashMap<>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		int len = s.length(), ret = map.get(s.charAt(len - 1));
		for (int i = len - 2; i >= 0; i--) {
			if (map.get(s.charAt(i)) < map.get(s.charAt(i + 1))) {
				ret -= map.get(s.charAt(i));
			} else {
				ret += map.get(s.charAt(i));
			}
		}
		return ret;
	}
}
