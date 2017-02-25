package com.hacareem.operations;

import java.util.List;

import com.hacareem.bean.Cab;


public class Dispatcher {
	
	private final static int max_distance = 10;
	
	public static Cab findClosestCab(long latitute, long longitude, List<Cab> cabs){
		for (int dist=0; dist<max_distance; dist++)
		for (Cab cab: cabs){
			if (cab.isAvailable() && Math.abs(longitude- cab.getLongitude())+Math.abs(latitute-cab.getLatitude())==dist)
				return cab;
		}
		return null;
	}
}
