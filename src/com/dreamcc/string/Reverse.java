package com.dreamcc.string;

/**
 * @Title: LeetCode
 * @Package: com.dreamcc.string
 * @Description: 整数反转
 * @Author: dreamcc
 * @Date: 2020/5/21 8:59
 * @Version: V1.0
 */
public class Reverse {
	public int reverse(int x) {
		long result = 0;
		while (x != 0) {
			result = result * 10 + x % 10;
			x /= 10;
		}
		if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
			result = 0;
		}
		return (int) result;
	}

	public int reverse1(int x) {
		try {
			String tempX = Integer.valueOf(x).toString();
			char[] chars = tempX.toCharArray();
			StringBuilder stringBuilder = new StringBuilder();
			if (x >= 0) {
				for (int i = chars.length - 1; i >= 0 ; i--) {
					stringBuilder.append(chars[i]);
				}
				return Integer.valueOf(stringBuilder.toString());
			}else{
				for (int i = chars.length - 1; i > 0 ; i--) {
					stringBuilder.append(chars[i]);
				}
				return Integer.valueOf(stringBuilder.toString()) * -1;
			}
		} catch (NumberFormatException e) {
			return 0;
		}
	}
}
