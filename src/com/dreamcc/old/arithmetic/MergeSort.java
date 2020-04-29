package com.dreamcc.old.arithmetic;

import java.util.Arrays;

/**
 * @Title: LeetCode
 * @Package: com.dreamcc.old.arithmetic
 * @Description: 归并排序
 * @Author: dreamcc
 * @Date: 2019/5/10 15:28
 * @Version: V1.0
 */
public class MergeSort {

	public static int[] mergeSort(int[] array) {
		if (array.length < 2) {
			return array;
		}
		int mid = array.length / 2;
		int[] left = Arrays.copyOfRange(array, 0, mid);
		int[] right = Arrays.copyOfRange(array, mid, array.length);
		return merge(mergeSort(left), mergeSort(right));
	}

	public static int[] merge(int[] left, int[] right) {
		int[] result = new int[left.length + right.length];
		for (int index = 0, i = 0, j = 0; index < result.length; index++) {

		}
		return result;
	}
}
