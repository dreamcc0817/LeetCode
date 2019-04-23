package com.dreamcc.map;

import java.util.*;

/**
 * @Title: LeetCode
 * @Package: com.dreamcc.map
 * @Description:
 * @Author: dreamcc
 * @Date: 2019/4/23 10:01
 * @Version: V1.0
 */
public class SlowMap<K, V> extends AbstractMap<K, V> {

	private List<K> keys = new ArrayList<>();
	private List<V> values = new ArrayList<>();

	@Override
	public V put(K key, V value) {
		V oldValue = get(key);
		if (!keys.contains(key)) {
			keys.add(key);
			values.add(value);
		} else {
			values.set(keys.indexOf(key), value);
		}
		return oldValue;
	}

	@Override
	public V get(Object key) {
		if (!keys.contains(key)) {
			return null;
		}
		return values.get(keys.indexOf(key));
	}

	@Override
	public Set<Entry<K, V>> entrySet() {
		Set<Entry<K, V>> set = new HashSet<>();
		Iterator<K> kIterator = keys.iterator();
		Iterator<V> vIterator = values.iterator();
		while (kIterator.hasNext()) {
			set.add(new MapEntry<>(kIterator.next(), vIterator.next()));
		}
		return set;
	}
}

class MapEntry<K, V> implements Map.Entry<K, V> {

	private K key;
	private V value;

	public MapEntry(K key, V value) {
		this.key = key;
		this.value = value;
	}

	@Override
	public K getKey() {
		return key;
	}

	@Override
	public V getValue() {
		return value;
	}

	@Override
	public V setValue(V v) {
		V result = value;
		value = v;
		return result;
	}
}