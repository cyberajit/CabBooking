package com.hacareem.operations;

public class Payment {
	private final static int minDist= 3;
	private final static int minFare= 50;
	private final static int rate= 15;
	
	public static long calculateFare (int sourcelatitude, int sourcelongitude, int destlatitude, int destlongitude){
		int totalDist= Math.abs(destlatitude- sourcelatitude)+Math.abs(destlatitude- sourcelatitude);
		if (totalDist<minDist){
			return minFare;
		}
		else {
			return (totalDist-minDist)*rate + minFare;
		}
	}
}
