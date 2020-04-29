package com.dreamcc.old.structure;

/**
 * @Title: LeetCode
 * @Package: com.dreamcc.old.structure
 * @Description:
 * @Author: dreamcc
 * @Date: 2019/5/16 17:18
 * @Version: V1.0
 */
public class ArrayPar {
	private long[] theArray;
	private int nElems;

	public ArrayPar(int maxSize){
		theArray = new long[maxSize];
		nElems = 0;
	}

	public void insert(long value){
		theArray[nElems] = value;
		nElems++;
	}

	public int size(){
		return nElems;
	}

	public void diplay(){
		for (int i = 0; i < nElems; i++) {
			System.out.print(" " + theArray[i]);
		}
		System.out.println();
	}

	public int partitonIt(int left,int right,long pivot){
		int leftPtr = left - 1;
		int rightPtr = right + 1;
		while(true){
			while (leftPtr < right && theArray[++leftPtr] < pivot){

			}
			while(rightPtr > left && theArray[--rightPtr] > pivot){

			}
			if(leftPtr >= rightPtr){
				break;
			}else {
				swap(leftPtr,rightPtr);
			}
		}
		return leftPtr;
	}

	private void swap(int leftPtr, int rightPtr) {
		long temp;
		temp = theArray[leftPtr];
		theArray[leftPtr] = theArray[rightPtr];
		theArray[rightPtr] = temp;
	}

	public void recQuickSort(int left,int right) {
		if(right <= left){
			return;
		}
		else {
			long pivot = theArray[right];
			int partition = partitonIt(left,right,pivot);
			recQuickSort(left, partition - 1);
			recQuickSort(partition + 1,right);
		}
	}
}
