package com.dreamcc.leetcode.string;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @Title: LeetCode
 * @Package: com.dreamcc.leetcode.string
 * @Description: 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 * @Author: dreamcc
 * @Date: 2019/1/21 16:25
 * @Version: V1.0
 */
public class Demo4 {
	public static void main(String[] args) throws ParseException {
		String restTimeStr = "2019-2-26";
		String timeFormat = "yyyy-MM-dd";
		SimpleDateFormat format = new SimpleDateFormat(timeFormat);
		Date restTime = format.parse(restTimeStr);
		Calendar calendar = new GregorianCalendar();
		calendar.setTime(restTime);
		int flag = 100;
		while(flag > 0){
			calendar.add(calendar.DATE,3);
			restTime = calendar.getTime();
			String jyRest = format.format(restTime);
			System.out.println("jyRest = " + jyRest);
			flag--;
		}
	}
	public static int reverse(int x) {
		ReadWriteLock lock = new ReentrantReadWriteLock();
		return 1;
	}
}
