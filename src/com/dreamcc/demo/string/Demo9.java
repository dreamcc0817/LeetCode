package com.dreamcc.demo.string;

import java.util.regex.Pattern;

/**
 * @Title: LeetCode
 * @Package: com.dreamcc.demo.string
 * @Description: 字符串转换整数 (atoi)
 * @Author: dreamcc
 * @Date: 2019/12/21 16:40
 * @Version: V1.0
 */
public class Demo9 {
	public int myAtoi(String str) {
		StringBuilder sb = new StringBuilder();
		str = str.replace(" ", "");
		String regex = "^\\D";
		if (str.charAt(0) != '+' && str.charAt(0) != '-' && Pattern.matches(regex,str.charAt(0)+"")) {
			return 0;
		}

		int a;
		// 首位为正负号
		if (str.charAt(0) == '+' || str.charAt(0) == '-') {
			a = 1;
			sb.append(str.charAt(0));
		} else {
			a = 0;
		}
		while (!Pattern.matches(regex, str.charAt(a++) + "")) {
			sb.append(str.charAt(--a));
			a++;
			if(a == str.length()){
				break;
			}
		}

		try {
			Integer result =  Integer.valueOf(sb.toString());
			return result;
		} catch (NumberFormatException e) {
			if(sb.toString().charAt(0) == '+'){
				return 2147483647;
			}else {
				return -2147483648;
			}
		}
	}

	public static void main(String[] args) {
		Demo9 demo9 = new Demo9();
		Integer integer = demo9.myAtoi("42");
		System.out.println("integer = " + integer);
	}
}
