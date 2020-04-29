package com.dreamcc.old.demo.datastructure;

import java.util.Scanner;

/**
 * @Title: LeetCode
 * @Package: com.dreamcc.old.leetcode.datastructure
 * @Description:
 * @Author: dreamcc
 * @Date: 2018-09-01 22:48
 * @Version: V1.0
 */
public class Demo2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int firstNum = sc.nextInt();
//		int firstNum = Integer.parseInt(sc.nextLine());
//		String secondStr = sc.nextLine();
//		String[] str = secondStr.split(" ");
//		int[] numArr = new int[firstNum];
//		for (int i = 0; i < str.length; i++) {
//			numArr[i] = Integer.parseInt(str[i]);
//		}
		int[] numArr = new int[firstNum];
		int maxNum = 0;
		int thisNum = 0;
		int startLocation = 0;
		int endLocation = 0;
		int temporary = 0;
		for (int i = 0; i < firstNum; i++) {
			thisNum += sc.nextInt();
			if (thisNum > maxNum) {
				maxNum = thisNum;
				startLocation = temporary;
				endLocation = i;
			} else if (thisNum < 0) {
				temporary = i + 1;
				thisNum = 0;
			}
		}
		int [] num = new int[endLocation-startLocation];
		if (maxNum <= 0) {
			for (int i = 0; i < (endLocation-startLocation); i++) {
				if(num[i] ==0){
					System.out.println(0 + " " + 0 + " " + 0);
					return;
				}
			}
			System.out.println(0 + " " + (num[0]) + " " + num[firstNum - 1]);
		} else {
			System.out.println(maxNum + " " + (num[startLocation]) + " " + num[endLocation]);
		}
	}
}
