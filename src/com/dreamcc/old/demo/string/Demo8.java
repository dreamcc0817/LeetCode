package com.dreamcc.old.demo.string;

/**
 * @Title: LeetCode
 * @Package: com.dreamcc.old.demo.string
 * @Description: 实现 strStr()
 * @Author: dreamcc
 * @Date: 2019/12/19 21:22
 * @Version: V1.0
 */
public class Demo8 {
	public int strStr(String haystack, String needle) {
		int needle1 = haystack.indexOf(needle);
		System.out.println("needle1 = " + needle1);
		return needle1;
	}
	public static void main(String[] args) {
		Demo8 demo8 = new Demo8();
		int a = demo8.strStr("aaaaa","");
		int b = demo8.strStr("hello","ll");
	}
}
