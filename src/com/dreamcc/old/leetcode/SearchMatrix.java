package com.dreamcc.old.leetcode;

/**
 * @Title: LeetCode
 * @Package: com.dreamcc.old.leetcode
 * @Description: 搜索二维矩阵 II
 * @Author: dreamcc
 * @Date: 2020/1/16 11:38
 * @Version: V1.0
 */
public class SearchMatrix {

	public boolean searchMatrix(int[][] matrix, int target) {
		int i = matrix.length - 1;
		int j = 0;
		while (i >= 0 && j < matrix[0].length) {
			if (target < matrix[i][j]) {
				i--;
			} else if (target > matrix[i][j]) {
				j++;
			} else if (target == matrix[i][j]) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		SearchMatrix searchMatrix = new SearchMatrix();
		searchMatrix.searchMatrix(new int[][]{{-5}},-5);
	}

}
