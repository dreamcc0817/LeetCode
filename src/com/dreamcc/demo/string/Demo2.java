package com.dreamcc.demo.string;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @Title: LeetCode
 * @Package: com.dreamcc.leetcode.arrays
 * @Description:
 * @Author: dreamcc
 * @Date: 2018/11/16 16:22
 * @Version: V1.0
 */
public class Demo2 {
	public static void main(String[] args) {
		Demo2 demo3 = new Demo2();
		demo3.reverseString("abcde");
	}
		public String reverseString(String s) {
			String[] strs = s.split("");
			List<String> list = Arrays.asList(strs);
			Collections.reverse(list);
			StringBuilder stringBuilder = new StringBuilder();
			for (String s1 : list) {
				stringBuilder.append(s1);
			}
			//System.out.println("stringBuilder = " + stringBuilder);
			return stringBuilder.toString();
		}
}
