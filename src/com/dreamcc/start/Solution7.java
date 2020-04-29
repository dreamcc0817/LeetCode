package com.dreamcc.start;

/**
 * @Title: LeetCode
 * @Package: com.dreamcc.start
 * @Description: 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 * @Author: dreamcc
 * @Date: 2020/4/27 10:11
 * @Version: V1.0
 */
public class Solution7 {
	public int reverse(int x) {

		try {
			if (x >= 0) {
				String tempX = Integer.valueOf(x).toString();
				char[] chars = tempX.toCharArray();
				StringBuilder stringBuilder = new StringBuilder();
				for (int i = chars.length - 1; i >= 0 ; i--) {
					stringBuilder.append(chars[i]);
				}
				return Integer.valueOf(stringBuilder.toString());
			}else{
				String tempX = Integer.valueOf(x).toString();
				char[] chars = tempX.toCharArray();
				StringBuilder stringBuilder = new StringBuilder();
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
