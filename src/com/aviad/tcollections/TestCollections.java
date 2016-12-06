package com.aviad.tcollections;

import java.io.IOException;
import java.util.Scanner;

public class TestCollections {

	private static final int SIZE_OF_MAP = 10000000;
	private static final int ITERATIONS = 10;

	private TestCollections(){}
	
	public static void main(String[] args) throws InterruptedException, IOException {
		for(int i=0; i<2; i++) {
			testInserts();
			gc();
			testReads();		
		}
	}

	private static void testReads() {
		for (MyMapFactory.Types type : MyMapFactory.Types.values()) {
			iterateMapGet(type);
			gc();
		}
	}

	private static void testInserts() {
		for (MyMapFactory.Types type : MyMapFactory.Types.values()) {
			iterateMapInsert(type);
			gc();
		}
	}

	private static void iterateMapInsert(MyMapFactory.Types mapType) {
		Scanner scan = new Scanner(System.in);
		printMsg("press ENTER to insert test " + mapType.name());
		scan.nextLine();
		MyTestMap map = MyMapFactory.getMap(mapType, SIZE_OF_MAP);
		long sumDuration = 0;
		for(int i=0; i<ITERATIONS; i++) {
			sumDuration += testInsertMap(map);
		}
		printMsg("avg: " + sumDuration / ITERATIONS);
	}

	private static long testInsertMap(MyTestMap map) {
		long start = System.currentTimeMillis();
		for (long l =0; l<SIZE_OF_MAP; l++) {
			map.put(l, l + 10l);
		}
		long end = System.currentTimeMillis();
		printMsg(end - start);
		return end-start;
	}
	
	private static void iterateMapGet(MyMapFactory.Types mapType) {
		Scanner scan = new Scanner(System.in);
		printMsg("press ENTER to test reads " + mapType.name());
		scan.nextLine();
		MyTestMap map = MyMapFactory.getMap(mapType, SIZE_OF_MAP);
		testInsertMap(map);
		long sumDuration = 0;
		for(int i=0; i<ITERATIONS; i++) {
			sumDuration += testMapGet(map);
		}
		printMsg("avg: " + sumDuration / ITERATIONS);
	}

	private static long testMapGet(MyTestMap map) {
		long sum=0;
		long start = System.currentTimeMillis();
		for (long l =0; l<SIZE_OF_MAP; l++) {
			sum += map.get(l);
		}
		long end = System.currentTimeMillis();
		printMsg((end - start) + " = " + sum);
		return end-start;
	}
	
	private static void printMsg(Object msg) {
		System.out.println(String.valueOf(msg));
	}
	
	private static void gc() {
		System.gc();
	}
}
