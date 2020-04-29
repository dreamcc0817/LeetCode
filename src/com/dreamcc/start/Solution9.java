package com.dreamcc.start;

/**
 * @Title: LeetCode
 * @Package: com.dreamcc.start
 * @Description: 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 * @Author: dreamcc
 * @Date: 2020/4/27 11:58
 * @Version: V1.0
 */
public class Solution9 {
	public boolean isPalindrome(int x) {
		if (x < 0) {
			return false;
		}

		char[] chars = Integer.valueOf(x).toString().toCharArray();

		int i = 0;
		int j = chars.length - 1;
		while (true){
			if(chars.length == 1){
				return true;
			}
			if(chars[i] != chars[j]){
				return false;
			}
			if(i >= j){
				break;
			}
			i++;
			j--;
		}

		return true;
	}
}
