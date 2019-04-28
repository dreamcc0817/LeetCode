package com.dreamcc.arithmetic;

/**
 * @Title: LeetCode
 * @Package: com.dreamcc.arithmetic
 * @Description: 插入排序
 * @Author: dreamcc
 * @Date: 2019/4/23 15:47
 * @Version: V1.0
 */
public class InsertSort {

	public static int[] insertSort(int[] array) {
		if (array.length == 0) {
			return array;
		}
		int current;
		for (int i = 0; i < array.length - 1; i++) {
			current = array[i + 1];
			int preIndex = i;
			while (preIndex >= 0 && current < array[preIndex]) {
				array[preIndex + 1] = array[preIndex];
				preIndex--;
			}
			array[preIndex + 1] = current;
		}
		return array;
	}

	public static void main(String[] args) {
		float result = 1.0f / 2.0f;
		System.out.println("result = " + result);
	}
}
