package com.dreamcc.sort;

/**
 * @Title: LeetCode
 * @Package: com.dreamcc.sort
 * @Description: 合并两个有序数组
 * @Author: dreamcc
 * @Date: 2020/5/13 8:49
 * @Version: V1.0
 */
public class Merge {
	public void merge(int[] nums1, int m, int[] nums2, int n) {
		while (m + n > 0) {
			if (m <= 0) {
				while (n > 0) {
					nums1[m + n - 1] = nums2[n - 1];
					n--;
				}
				break;
			}
			if (n <= 0) {
				while (m > 0) {
					nums1[m + n - 1] = nums1[m - 1];
					m--;
				}
				break;
			}
			if (nums1[m - 1] <= nums2[n - 1]) {
				nums1[m + n - 1] = nums2[n - 1];
				n--;
			} else {
				nums1[m + n - 1] = nums1[m - 1];
				m--;
			}
		}
	}

	public static void main(String[] args) {
		Merge merge = new Merge();
		merge.merge(new int[]{1, 2, 3, 0, 0, 0}, 3, new int[]{2, 5, 6}, 3);
	}
}
