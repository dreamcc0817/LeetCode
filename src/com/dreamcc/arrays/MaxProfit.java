package com.dreamcc.arrays;

/**
 * @Title: LeetCode
 * @Package: com.dreamcc.arrays
 * @Description: 买卖股票的最佳时机 II
 * @Author: dreamcc
 * @Date: 2020/5/20 9:03
 * @Version: V1.0
 */
public class MaxProfit {
	public int maxProfit(int[] prices) {
		int max = 0;
		for(int i = 0;i < prices.length -1;i++){
			if(prices[i] < prices[i+1]){
				max += prices[i+1]-prices[i];
			}
		}
		return max;
	}
}
