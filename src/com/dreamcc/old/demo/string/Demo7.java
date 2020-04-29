package com.dreamcc.old.demo.string;

/**
 * @Title: LeetCode
 * @Package: com.dreamcc.old.leetcode.string
 * @Description: 编写一个函数来查找字符串数组中的最长公共前缀。如果不存在公共前缀，返回空字符串 ""。
 * @Author: dreamcc
 * @Date: 2019/2/27 17:40
 * @Version: V1.0
 */
public class Demo7 {
	public String longestCommonPrefix(String[] strs) {

		if (strs.length == 0) return "";
		String prefix = strs[0];
		for (int i = 1; i < strs.length; i++) {
			// 找出S1与Si间的最长公共字符串
			// indexOf：当存在串时返回>0；不存串时返回-1
			// 只要不存在串，就缩减串的规模，再进行查找
			while (strs[i].indexOf(prefix) != 0) {
				prefix = prefix.substring(0, prefix.length() - 1);
				if (prefix.isEmpty()) return "";
			}
		}
		return prefix;
	}
}
