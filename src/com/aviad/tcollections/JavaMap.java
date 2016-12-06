package com.aviad.tcollections;

import java.util.HashMap;
import java.util.Map;

public class JavaMap extends MyTestMap {
	private Map longLongHash;
	public JavaMap(int sizeofmap) {
		super(sizeofmap);
		longLongHash = new HashMap(sizeofmap);
	}
	@Override
	public void put(long key, long value) {
		longLongHash.put(key, value);

	}
	@Override
	public void init(int size) {
		longLongHash = new HashMap(size);
		
	}
	@Override
	public String getName() {
		return "Java Map";
	}
	@Override
	public long get(long key) {
		return (Long) longLongHash.get(key);
	}
	
	

}
