package com.aviad.tcollections;

public abstract class MyTestMap {
	public MyTestMap(int sizeofmap) {}
	private MyTestMap() {}
	public abstract void init(int size);
	public abstract void put(long key, long value);
	public abstract long get(long key);
	public abstract String getName();
}
