package com.aviad.tcollections;

public class MyMapFactory {

	private MyMapFactory() {}
	
	public static MyTestMap getMap(Types type, int size) {
		MyTestMap map = null;
		switch(type) {
		case ECLIPSE:
			map = new EclipseMap(size);
			break;
		case JAVA:
			map = new JavaMap(size);
			break;
		case TROVE:
			map = new TroveMap(size);
			break;
		case TROVE_OBJECT:
			map = new TroveObjectMap(size);
			break;
		case ECLIPSE_OBJECT:
			map = new EclipseObjectMap(size);
			break;
		default:
			break;
			
		}
		return map;
	}
	
	public enum Types {
		TROVE,
		TROVE_OBJECT,
		ECLIPSE,
		ECLIPSE_OBJECT,
		JAVA
	}
}
