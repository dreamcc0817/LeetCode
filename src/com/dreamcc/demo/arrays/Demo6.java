package com.dreamcc.demo.arrays;

/**
 * @Title: LeetCode
 * @Package: com.dreamcc.leetcode.arrays
 * @Description:
 *
 * 买入股票的最佳时机①
 * 给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。
 *
 * 设计一个算法来计算你所能获取的最大利润。你可以尽可能地完成更多的交易（多次买卖一支股票）。
 *
 * 注意：你不能同时参与多笔交易（你必须在再次购买前出售掉之前的股票）。
 * @Author: dreamcc
 * @Date: 2018/12/17 10:46
 * @Version: V1.0
 */
public class Demo6 {
	public static void main(String[] args) {

	}
	public int maxProfit(int[] prices) {

		int maxProfit = 0;

		for (int i = 0; i < prices.length - 1; i++) {
			for (int j = 1; j < prices.length; j++) {
				int profit = prices[j] - prices[i];//利润
				if(profit > maxProfit){
					maxProfit = profit;
				}
			}
		}
		if(maxProfit <=0 ){
			return 0;
		}


		return maxProfit;
	}
}
