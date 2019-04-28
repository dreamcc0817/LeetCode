package com.dreamcc.arithmetic;

/**
 * @Title: LeetCode
 * @Package: com.dreamcc.arithmetic
 * @Description: 选择排序
 * @Author: dreamcc
 * @Date: 2019/4/23 15:36
 * @Version: V1.0
 */
public class SelecttionSort {
	public static int[] selectionSort(int[] array) {
		if (array.length == 0) {
			return array;
		}
		for (int i = 0; i < array.length; i++) {
			int minIndex = i;
			for (int j = i; j < array.length; j++) {
				if(array[j] < array[minIndex]){
					minIndex = j;
				}
			}
			int temp = array[minIndex];
			array[minIndex] = array[i];
			array[i] = temp;
		}
		return array;
	}
}
