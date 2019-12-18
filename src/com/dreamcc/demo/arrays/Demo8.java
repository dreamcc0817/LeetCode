package com.dreamcc.demo.arrays;

/**
 * @Title: LeetCode
 * @Package: com.dreamcc.leetcode.arrays
 * @Description:给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。 最高位数字存放在数组的首位， 数组中每个元素只存储一个数字。你可以假设除了整数 0 之外，这个整数不会以零开头。
 * @Author: dreamcc
 * @Date: 2019/1/30 9:29
 * @Version: V1.0
 */
public class Demo8 {
	public int[] plusOne(int[] digits) {
		for (int i = digits.length - 1; i >=0; i--) {
			if (digits[i] < 9) {
				digits[i] += 1;
				break;
			}else {
				if (i == 0) {
					if (digits[0] > 9) {
						int[] arrts = new int[digits.length + 1];
						arrts[0] = 1;
						digits[0] = 0;
						for (int j = 0; j < digits.length - 1; j++) {
							arrts[j + 1] = digits[j];
						}
						return arrts;
					}
				}
				digits[i] = 0;
				if(i!=0) {
					digits[i - 1] = digits[i - 1] % 10 + 1;
					if(digits[i - 1] < 10){
						break;
					}
				}
			}
		}
		return digits;
	}

	public static void main(String[] args) {
		Demo8 demo8 = new Demo8();
		int[] aaa = demo8.plusOne(new int[]{8,9, 9});

		for (int i : aaa) {
			System.out.println("i = " + i);
		}
	}
}

