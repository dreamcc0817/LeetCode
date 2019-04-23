package com.dreamcc.map;

/**
 * @Title: LeetCode
 * @Package: com.dreamcc.map
 * @Description: 简单的map实现
 * @Author: dreamcc
 * @Date: 2019/4/22 17:23
 * @Version: V1.0
 */
public class SimpleMap<K, V> {
	private Object[][] pairs;
	private int index;

	public SimpleMap(int length) {
		pairs = new Object[length][2];
	}

	public void put(K key, V value) {
		if (index >= pairs.length) {
			throw new ArrayIndexOutOfBoundsException();
		}
		pairs[index++] = new Object[]{key, value};
	}

	public V get(K key) {
		for (int i = 0; i < index; i++) {
			if (key.equals(pairs[i][0])) {
				return (V) pairs[i][1];
			}
		}
		return null;
	}

	public static void main(String[] args) {
		Object[][] object = new Object[1][2];
		System.out.println(object.length);
	}
}
