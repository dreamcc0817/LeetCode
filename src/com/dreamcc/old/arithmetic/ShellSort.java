package com.dreamcc.old.arithmetic;

/**
 * @Title: LeetCode
 * @Package: com.dreamcc.old.arithmetic
 * @Description: 希尔排序
 * @Author: dreamcc
 * @Date: 2019/4/23 16:58
 * @Version: V1.0
 */
public class ShellSort {
	public static int[] shellSort(int[] array) {
		int len = array.length;
		int temp, gap = len / 2;

		while (gap > 0) {
			for (int i = gap; i < len; i++) {
				temp = array[i];
				int preIndex = i - gap;
				while (preIndex >= 0 && array[preIndex] > temp) {
					array[preIndex + gap] = array[preIndex];
					preIndex -= gap;
				}
				array[preIndex + gap] = temp;
			}
			gap /= 2;
		}
		return array;
	}
}
