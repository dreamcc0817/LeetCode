package com.dreamcc.old.structure;

/**
 * @Title: LeetCode
 * @Package: com.dreamcc.old.structure
 * @Description:
 * @Author: dreamcc
 * @Date: 2019/5/16 10:03
 * @Version: V1.0
 */
public class QueueX {

	private int maxSize;
	private long[] queArray;
	private int front;
	private int rear;
	private int nItem;

	public QueueX(int maxSize) {
		this.maxSize = maxSize;
		queArray = new long[maxSize];
		front = 0;
		rear = -1;
		nItem = 0;
	}

	public void insert(long i) {
		if (rear == maxSize - 1) {
			rear = -1;
		}
		queArray[++rear] = i;
		nItem++;
	}

	public long remove(){
		long temp = queArray[front++];
		if(front == maxSize){
			front = 0;
		}
		nItem--;
		return temp;
	}

	public long peekFront(){
		return queArray[front];
	}

	public boolean isEmpty(){
		return (nItem == 0);
	}

	public boolean isFull(){
		return (nItem == maxSize);
	}

	public int size(){
		return nItem;
	}
}
