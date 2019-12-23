package com.dreamcc.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * @Title: LeetCode
 * @Package: com.dreamcc.leetcode
 * @Description: 190. 颠倒二进制位
 * @Author: dreamcc
 * @Date: 2019/12/23 22:02
 * @Version: V1.0
 */
public class ReverseBits {
	public int reverseBits(int n) {
		String str = Integer.toBinaryString(n);
		StringBuilder sb = new StringBuilder();
		for (int i = str.length() - 1; i >= 0; i--) {
			sb.append(str.charAt(i));
		}
		for (int i = 0; i < 32 - str.length(); i++) {
			sb.append(0);
		}
		return Integer.parseUnsignedInt(sb.toString(), 2);
}

	public static void main(String[] args) {
		ReverseBits reverseBits = new ReverseBits();
		int a = reverseBits.reverseBits(43261596);
		System.out.println("a = " + a);
	}
}
