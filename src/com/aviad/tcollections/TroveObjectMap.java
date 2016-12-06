package com.aviad.tcollections;

import gnu.trove.map.hash.THashMap;

public class TroveObjectMap extends MyTestMap {
	private gnu.trove.map.TMap<Long, Long> tlongLongHash;
	public TroveObjectMap(int sizeofmap) {
		super(sizeofmap);
		tlongLongHash = new THashMap<Long, Long>(sizeofmap);
	}
	@Override
	public void put(long key, long value) {
		tlongLongHash.put(key, value);

	}
	@Override
	public void init(int size) {
		tlongLongHash = new THashMap<Long, Long>(size);
	}
	@Override
	public String getName() {
		return "Trove";
	}
	@Override
	public long get(long key) {
		return tlongLongHash.get(key);
	}

}
