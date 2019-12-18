package com.dreamcc.demo.string;

/**
 * @Title: LeetCode
 * @Package: com.dreamcc.leetcode.string
 * @Description: 给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的一个字母异位词。
 * @Author: dreamcc
 * @Date: 2019/2/27 17:23
 * @Version: V1.0
 */
public class Demo6 {
	public boolean isAnagram(String s, String t) {
		int[] alphabet = new int[26];
		for (int i = 0; i < s.length(); i++) alphabet[s.charAt(i) - 'a']++;
		for (int i = 0; i < t.length(); i++) alphabet[t.charAt(i) - 'a']--;
		for (int i : alphabet) if (i != 0) return false;
		return true;
	}
}
