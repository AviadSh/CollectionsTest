package com.aviad.tcollections;

import org.eclipse.collections.impl.map.mutable.UnifiedMap;

public class EclipseObjectMap extends MyTestMap {
	private UnifiedMap<Long, Long> longLongHashMap;
	public EclipseObjectMap(int sizeofmap) {
		super(sizeofmap);
		longLongHashMap = new UnifiedMap<Long, Long>(sizeofmap);
	}
	@Override
	public void put(long key, long value) {
		longLongHashMap.put(key, value);
	}
	@Override
	public void init(int size) {
		longLongHashMap = new UnifiedMap<Long, Long>(size);
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
