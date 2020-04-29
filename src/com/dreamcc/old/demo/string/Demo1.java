package com.dreamcc.old.demo.string;

import java.util.ArrayList;
import java.util.List;

/**
 * @Title: LeetCode
 * @Package: com.dreamcc.old.leetcode.string
 * @Description:
 * @Author: dreamcc
 * @Date: 2018/8/26 21:34
 * @Version: V1.0
 */
public class Demo1 {
	public synchronized static List<String> fizzBuzz(int n) {
		ArrayList<String> list = new ArrayList<>(n);
		final String str1 = "Fizz";
		final String str2 = "Buzz";
		final String str3 = "FizzBuzz";
		for (int i = 1; i <= n; i++) {
			if (i % 3 == 0) {
				if (i % 5 == 0) {
					list.add(str3);
					continue;
				}
				list.add(str1);
				continue;
			}
			if (i % 5 == 0) {
				list.add(str2);
				continue;
			}
			list.add(i + "");
		}
		return list;
	}

	public synchronized static List<String> fizzBuzz1(int n) {
		ArrayList<String> list = new ArrayList<>(n);
		final String str1 = "Fizz";
		final String str2 = "Buzz";
		final String str3 = "FizzBuzz";
		for (int i = 1; i <= n; i++) {

			if (i % 3 != 0 && i % 5 != 0) {
				list.add(i + "");
				continue;
			}
			if (i % 3 == 0 && i % 5 == 0) {
				list.add(str3);
				continue;
			}
			if (i % 3 == 0) {
				list.add(str1);
				continue;
			}
			list.add(str2);
		}
		return list;
	}

	public static void main(String[] args) {

		Long beginTime = System.currentTimeMillis();
		fizzBuzz(1762332);
		Long endTime = System.currentTimeMillis();

		System.out.println(endTime - beginTime);
	}
}
