package com.dreamcc.old.map;

import java.util.*;

/**
 * @Title: LeetCode
 * @Package: com.dreamcc.old.map
 * @Description: 简单实现HashMap
 * @Author: dreamcc
 * @Date: 2019/4/23 10:59
 * @Version: V1.0
 */
public class SimpleHashMap<K, V> extends AbstractMap<K, V> {

	private static final int SIZE = 997;

	private LinkedList<MapEntry<K, V>>[] buckets = new LinkedList[SIZE];

	@Override
	public V get(Object key) {
		int index = Math.abs(key.hashCode()) % SIZE;
		if (buckets[index] == null) {
			return null;
		}
		for (MapEntry<K, V> iPair : buckets[index]) {
			if (iPair.getKey().equals(key)) {
				return iPair.getValue();
			}
		}
		return null;
	}

	@Override
	public V put(K key, V value) {
		V oldValue = null;
		int index = Math.abs(key.hashCode()) % SIZE;
		if (buckets[index] == null) {
			buckets[index] = new LinkedList<>();
		}
		LinkedList<MapEntry<K,V>> bucket = buckets[index];
		MapEntry<K,V> pair = new MapEntry<>(key,value);
		boolean found = false;
		ListIterator<MapEntry<K,V>> iterator = bucket.listIterator();
		while (iterator.hasNext()){
			MapEntry<K,V> iPair = iterator.next();
			if(iPair.getKey().equals(key)){
				oldValue = iPair.getValue();
				iterator.set(pair);
				found = true;
				break;
			}
		}
		if(!found){
			buckets[index].add(pair);
		}
		return oldValue;
	}

	@Override
	public Set<Entry<K, V>> entrySet() {
		return null;
	}
}
