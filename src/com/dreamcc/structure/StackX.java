package com.dreamcc.structure;

/**
 * @Title: LeetCode
 * @Package: com.dreamcc.structure
 * @Description: 模拟栈实现
 * @Author: dreamcc
 * @Date: 2019/5/15 18:28
 * @Version: V1.0
 */
public class StackX {

	private int maxSize;
	private char[] stackArray;
	private int top;

	public StackX(int maxSize) {
		this.maxSize = maxSize;
		stackArray = new char[maxSize];
		top = -1;
	}

	public void push(char j) {
		stackArray[++top] = j;
	}

	public char pop() {
		return stackArray[top--];
	}

	public boolean isEmpty() {
		return (top == -1);
	}

	public boolean isFull() {
		return (top == maxSize - 1);
	}
}
class Reverser{
	private String input;
	private String output;
	public Reverser(String input){
		this.input = input;
		output = "";
	}
	public String doRev(){
		StackX stackX = new StackX(input.length());
		for (int i = 0; i < input.length(); i++) {
			stackX.push(input.charAt(i));
		}
		while(!stackX.isEmpty()){
			char c = stackX.pop();
			output += c;
		}
		return output;
	}
}