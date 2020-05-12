package com.dreamcc.string;

/**
 * @Title: LeetCode
 * @Package: com.dreamcc.string
 * @Description: 反转字符串
 * @Author: dreamcc
 * @Date: 2020/5/12 9:12
 * @Version: V1.0
 */
public class ReverseString {
	public void reverseString(char[] s) {
		int i = 0;
		int j = s.length - 1;
		char temp;
		while (i < j) {
			temp = s[i];
			s[i++] = s[j];
			s[j--] = temp;
		}
	}
}
