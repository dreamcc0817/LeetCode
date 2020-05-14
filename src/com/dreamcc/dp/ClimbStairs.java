package com.dreamcc.dp;

/**
 * @Title: LeetCode
 * @Package: com.dreamcc.dp
 * @Description: 爬楼梯
 * @Author: dreamcc
 * @Date: 2020/5/14 8:54
 * @Version: V1.0
 */
public class ClimbStairs {
	public int climbStairs(int n) {
		if (n == 1) {
			return n;
		}
		int[] dp = new int[n + 1];
		dp[1] = 1;
		dp[2] = 2;
		for (int i = 3; i <= n ; i++) {
			dp[i] = dp[i-1] + dp[i-2];
		}
		return dp[n];
	}
}
