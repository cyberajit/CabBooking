package com.hacareem.bean;

import java.util.ArrayList;
import java.util.List;

import com.hacareem.operations.CabBooking;

public class Bootstrap {

	public static void main(String[] args) {
		List<Cab> cabs= new ArrayList<Cab>();
		
		for (int i=0; i<5; i++){
			Cab cab= new Cab();
			cab.setCapacity(4);
			cab.setLatitude(i);
			cab.setLongitude(i);
			cab.setAvailable(true);
			cabs.add(cab);
		}
		
		Customer customer= new Customer();
		customer.setLatitude(1);
		customer.setLongitude(1);
		System.out.println(CabBooking.bookACab(cabs, customer, false));

	}

}
