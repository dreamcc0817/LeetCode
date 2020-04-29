package com.dreamcc.start;

import java.util.ArrayList;
import java.util.List;

/**
 * @Title: LeetCode
 * @Package: com.dreamcc.start
 * @Description: 编写一个函数来查找字符串数组中的最长公共前缀。
 * <p>
 * 如果不存在公共前缀，返回空字符串 ""。
 * @Author: dreamcc
 * @Date: 2020/4/29 10:21
 * @Version: V1.0
 */
public class Solution14 {
	public String longestCommonPrefix(String[] strs) {

		if (strs == null || strs.length == 0) {
			return "";
		}
		if (strs.length == 1) {
			return strs[0];
		}

		List<char[]> tempList = new ArrayList<>();

		int max = 0;
		int min = Integer.MAX_VALUE;

		for (String str : strs) {
			if(max < str.toCharArray().length){
				max = str.toCharArray().length;
			}
			if(min > str.toCharArray().length){
				min = str.toCharArray().length;
			}
			tempList.add(str.toCharArray());
		}

		if(max == 0 ){
			return "";
		}

		int c = 0;

		String result = "";

		while(c < min){
			char temp = 0;
			for (int i = 1; i < tempList.size(); i++) {
				if (tempList.get(i).length <= c) {
					break;
				}
				char current = tempList.get(i)[c];
				char pre = tempList.get(i - 1)[c];
				if (current != pre) {
					return result;
				}
				temp = tempList.get(i - 1)[c];
			}
			c++;
			result += temp;
		}

		return result;
	}

	public static void main(String[] args) {
		String[] str = new String[]{"flower","flow","flight"};
		Solution14 aa = new Solution14();
		String s = aa.longestCommonPrefix(str);
		System.out.println("s = " + s);
	}
}
