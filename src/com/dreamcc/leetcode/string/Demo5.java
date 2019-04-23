package com.dreamcc.leetcode.string;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Title: LeetCode
 * @Package: com.dreamcc.leetcode.string
 * @Description:给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。
 * @Author: dreamcc
 * @Date: 2019/2/19 11:29
 * @Version: V1.0
 */
public class Demo5 {
	public synchronized int firstUniqChar(String s) {

		ExecutorService executor = Executors.newFixedThreadPool(2);
		String[] resultArr = s.split("");
		int result = -1;
		if("".equals(s)){
			return result;
		}
		Map<String, Integer> resultMap = new LinkedHashMap<>();
		for (int i = 0; i < resultArr.length; i++) {
			if (resultMap.containsKey(resultArr[i])) {
				int containsNums = resultMap.get(resultArr[i]) + 1;
				resultMap.put(resultArr[i],containsNums);
			}else{
				resultMap.put(resultArr[i],1);
			}
		}
		for (Map.Entry<String, Integer> stringIntegerEntry : resultMap.entrySet()) {
			if(stringIntegerEntry.getValue()==1){
				String key = stringIntegerEntry.getKey();
				return s.indexOf(key);
			}
		}
		return result;
	}
}
