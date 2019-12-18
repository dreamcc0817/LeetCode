package com.dreamcc.demo.datastructure;

import java.util.Scanner;

/**
 * @Title: LeetCode
 * @Package: com.dreamcc.leetcode.datastructure
 * @Description:
 * @Author: dreamcc
 * @Date: 2018-09-01 22:48
 * @Version: V1.0
 */
public class Demo1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int firstNum = Integer.parseInt(sc.nextLine());
		String secondStr = sc.nextLine();
		String[] str = secondStr.split(" ");
		int[] numArr = new int[firstNum];

		for (int i = 0; i < str.length; i++) {
			numArr[i] = Integer.parseInt(str[i]);
		}

		int maxNum = 0;
		int thisNum = 0;
		for (int i = 0; i < firstNum; i++) {
			thisNum += numArr[i];
			if (thisNum > maxNum) {
				maxNum = thisNum;
			} else if (thisNum < 0) {
				thisNum = 0;
			}
		}
		System.out.println(maxNum);
	}
}
