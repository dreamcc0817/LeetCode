package com.dreamcc.old.leetcode;

import java.util.LinkedList;
import java.util.List;

/**
 * @Title: LeetCode
 * @Package: com.dreamcc.old.leetcode
 * @Description: 257:二叉树的所有路径
 * @Author: dreamcc
 * @Date: 2019/12/18 22:29
 * @Version: V1.0
 */

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	}
}

public class BinaryTreePaths {
	public List<String> binaryTreePaths(TreeNode root) {
		LinkedList<String> paths = new LinkedList<>();
		constractPath(root, "", paths);
		return paths;
	}

	private void constractPath(TreeNode root, String path, LinkedList<String> paths) {
		//如果根节点不为空
		if (root != null) {
			path += Integer.toString(root.val);
			if(root.left == null && root.right == null){
				paths.add(path);
			}else{
				path += "->";
				constractPath(root.left,path,paths);
				constractPath(root.right,path,paths);
			}
		}
	}
}
