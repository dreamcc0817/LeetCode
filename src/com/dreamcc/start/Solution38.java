package com.dreamcc.start;

/**
 * @Title: LeetCode
 * @Package: com.dreamcc.start
 * @Description: 外观数列
 * @Author: dreamcc
 * @Date: 2020/5/9 9:18
 * @Version: V1.0
 */
public class Solution38 {
	public String countAndSay(int n) {
		String startStr = "1";
		for (int i = 2; i <= n ; i++) {
			StringBuilder stringBuilder = new StringBuilder();
			char pre = startStr.charAt(0);
			int count = 1;
			for (int j = 0; j < startStr.length(); j++) {
				char temp = startStr.charAt(j);
				if(temp == pre){
					count++;
				}else {
					stringBuilder.append(count).append(pre);
					pre = temp;
					count = 1;
				}
			}
			stringBuilder.append(count).append(pre);
			startStr = stringBuilder.toString();
		}
		return startStr;
	}
}
