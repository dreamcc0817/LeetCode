
package com.dreamcc.structure;

/**
 * @Title: LeetCode
 * @Package: com.dreamcc.structure
 * @Description:
 * @Author: dreamcc
 * @Date: 2019/5/20 11:17
 * @Version: V1.0
 */
class Node {
	int iData;
	double dData;
	Node left;
	Node right;
}


public class TreeX {

	private Node root;

	public Node find(int key) {
		Node current = root;
		while (current.iData != key) {
			if (key < current.iData) {
				current = current.left;
			} else {
				current = current.right;
			}
			if (current == null) {
				return null;
			}
		}
		return current;
	}

	public void insert(int id, double dd) {
		Node newNode = new Node();
		newNode.iData = id;
		newNode.dData = dd;
		if (root == null) {
			root = newNode;
		} else {
			Node current = root;
			Node parent;
			while (true) {
				parent = current;
				if (id < current.iData) {
					current = current.left;
					if (current == null) {
						parent.left = newNode;
						return;
					}
				} else {
					current = current.right;
					if (current == null) {
						parent.right = newNode;
						return;
					}
				}//end else
			}//end while
		}//end else not root
	}//end insert

	public void inOrder(Node localRoot) {
		if (localRoot != null) {
			inOrder(localRoot.left);
			System.out.println(localRoot.iData);
			inOrder(localRoot.right);
		}
	}


	public boolean delete(int key) {
		Node current = root;
		Node parent = root;
		boolean isLeftChild = true;
		while (current.iData != key) {
			parent = current;
			if (key < current.iData) {
				isLeftChild = true;
				current = current.left;
			} else {
				isLeftChild = false;
				current = current.right;
			}
			if (current == null) {
				return false;
			}
		}//end while

		if (current.left == null && current.right == null) {
			if (current == root) {
				root = null;
			} else if (isLeftChild) {
				parent.left = null;
			} else {
				parent.right = null;
			}
		}else if(current.right == null){
			if(current == root){
				root = current.left;
			}else if(isLeftChild){
				parent.left = current.left;
			}else {
				parent.right = current.right;
			}
		}else{
			Node successor = getSuccessor(current);
			if(current == root){
				root = successor;
			}else if(isLeftChild){
				parent.right = successor;
			}else {
				parent.left = successor;
				successor.left = current.left;
			}
		}
		return true;
	}


	public Node getSuccessor(Node delNode){
		Node successorParent = delNode;
		Node successor =  delNode;
		Node current = delNode.right;
		while(current != null){
			successorParent = successor;
			successor = current;
			current = current.left;
		}//end while
		if(successor != delNode.right){
			successorParent.left = successor.right;
			successor.right = delNode.right;
		}
		return successor;
	}
}
