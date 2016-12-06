package com.aviad.tcollections;

import gnu.trove.map.hash.TLongLongHashMap;

public class TroveMap extends MyTestMap {
	private gnu.trove.map.TLongLongMap tlongLongHash;
	public TroveMap(int sizeofmap) {
		super(sizeofmap);
		tlongLongHash = new TLongLongHashMap(sizeofmap);
	}
	@Override
	public void put(long key, long value) {
		tlongLongHash.put(key, value);

	}
	@Override
	public void init(int size) {
		tlongLongHash = new TLongLongHashMap(size);
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
