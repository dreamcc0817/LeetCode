package com.dreamcc.start;

import java.util.Stack;

/**
 * @Title: LeetCode
 * @Package: com.dreamcc.start
 * @Description:
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 *
 * 有效字符串需满足：
 *
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 注意空字符串可被认为是有效字符串。

 * @Author: dreamcc
 * @Date: 2020/4/30 10:10
 * @Version: V1.0
 */
public class Solution20 {
	public boolean isValid(String s) {
		char[] chars = s.toCharArray();
		int i = 0;
		int j = chars.length;
		if(j % 2 != 0){
			return false;
		}
		Stack<Character> stack = new Stack<>();
		while (i < j) {
			if (chars[i] == '(' || chars[i] == '{' || chars[i] == '[') {
				stack.push(chars[i]);
			}else {
				if (stack.empty()){
					return false;
				}
				Character pop = stack.pop();
				if(chars[i] == ')'){
					if('(' != pop){
						return false;
					}
				}
				if(chars[i] == '}'){
					if('{' != pop){
						return false;
					}
				}
				if(chars[i] == ']'){
					if('[' != pop){
						return false;
					}
				}
			}
			i++;
		}
		if(stack.empty()){
			return true;
		}
		return false;
	}
}
