package com.dreamcc.math;

import java.util.ArrayList;
import java.util.List;

/**
 * @Title: LeetCode
 * @Package: com.dreamcc.math
 * @Description: Fizz Buzz
 * @Author: dreamcc
 * @Date: 2020/5/15 8:57
 * @Version: V1.0
 */
public class FizzBuzz {
	public List<String> fizzBuzz(int n) {
		List<String> result = new ArrayList<>();

		for (int start = 1; start < n+1; start++) {
			if (start % 3 == 0 && start % 5 == 0) {
				result.add("FizzBuzz");
			} else if (start % 3 == 0) {
				result.add("Fizz");
			} else if (start % 5 == 0) {
				result.add("Buzz");
			} else {
				result.add(start + "");
			}
		}

		return result;
	}
}
