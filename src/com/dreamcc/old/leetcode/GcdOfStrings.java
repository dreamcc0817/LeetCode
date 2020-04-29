package com.dreamcc.old.leetcode;

/**
 * @Title: LeetCode
 * @Package: com.dreamcc.old.leetcode
 * @Description: 1071. 字符串的最大公因子
 * @Author: dreamcc
 * @Date: 2019/12/19 21:50
 * @Version: V1.0
 */
public class GcdOfStrings {
	public String gcdOfStrings(String str1, String str2) {



//		if(str1.length()%str2.length() != 0 || str2.length()%str1.length() != 0 ){
//			return "";
//		}
//		if(str1.indexOf(str2) != 0 ){
//			return "";
//		}
//		if(!str1.endsWith(str2) || !str2.endsWith(str1)) {
//			return "";
//		}
		StringBuilder stringBuilder = new StringBuilder();

		if(str1.length() > str2.length()){
			for(int i = 0 ; i < str1.length() / str2.length();i++){
				stringBuilder.append(str2);
			}
			if (!str1.equalsIgnoreCase(stringBuilder.toString())){
				return "";
			}else {
				return innerGcdOfStrings(str2);
			}
		}else {
			for(int i = 0 ; i < str2.length() / str1.length();i++){
				stringBuilder.append(str1);
			}
			if (!str1.equalsIgnoreCase(stringBuilder.toString())){
				return "";
			}else {
				return innerGcdOfStrings(str1);
			}
		}

	}
	public String innerGcdOfStrings(String parent) {
		char start = parent.charAt(0);
		for (int i = 1; i < parent.length(); i++) {
			char compare = parent.charAt(i);
			if (compare == start) {
				if (2 * i > parent.length()) {
					return parent;
				}
				boolean flag = true;
				for (int j = 1; j < i; j++) {
					if (parent.charAt(j) != parent.charAt(i + j)) {
						flag = false;
						break;
					}
				}
				if (flag) {
					String sub = parent.substring(0, i);
					if (parent.split(sub).length == 0) {
						return sub;
					}
				}
			}
		}

		return parent;
	}

	private String isMin(String str){
		String a = str.substring(0,str.length()/2);
		String b = str.substring(str.length()/2,str.length());
		if(a.equals(b)){
			str = a;
			isMin(str);
		}
		return str;
	}

	public static void main(String[] args) {
		GcdOfStrings demo = new GcdOfStrings();
		String result = demo.gcdOfStrings("AVAVbbAVAVbb","AVAVbbAVAVbbAVAVbbAVAVbbAVAVbb");
		System.out.println("result = " + result);
	}
}
