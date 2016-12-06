package com.aviad.tcollections;

import org.eclipse.collections.impl.map.mutable.primitive.LongLongHashMap;

public class EclipseMap extends MyTestMap {
	private LongLongHashMap longLongHashMap;
	public EclipseMap(int sizeofmap) {
		super(sizeofmap);
		longLongHashMap = new LongLongHashMap(sizeofmap);
	}
	@Override
	public void put(long key, long value) {
		longLongHashMap.put(key, value);
	}
	@Override
	public void init(int size) {
		longLongHashMap = new LongLongHashMap(size);
	}
	@Override
	public String getName() {
		return "Eclipse - GS";
	}
	@Override
	public long get(long key) {
		return longLongHashMap.get(key);
	}

}
