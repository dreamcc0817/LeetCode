package com.dreamcc.arithmetic;

/**
 * @Title: LeetCode
 * @Package: com.dreamcc.arithmetic
 * @Description:
 * @Author: dreamcc
 * @Date: 2019/5/17 14:34
 * @Version: V1.0
 */
public class QuickSort {

	private void quickSort(int s[], int l, int r) {
		if (l < r) {
			int i = l, j = r, x = s[l];
			while (i < j) {
				while (i < j && s[j] >= x) {
					j--;
				}

				if (i < j) {
					s[i++] = s[j];
				}

				while (i < j && s[i] < x) {
					i++;
				}

				if (i < j) {
					s[j--] = s[i];
				}
			}

			s[i] = x;
			quickSort(s,l,i-1);
			quickSort(s,i+1,r);
		}
	}
}
