package com.hacareem.operations;

import java.util.List;

import com.hacareem.bean.Cab;
import com.hacareem.bean.Customer;

public class CabBooking {

	public static boolean bookACab(List<Cab> cabs, Customer customer, boolean sharing){
		Cab cab= Dispatcher.findClosestCab(customer.getLatitude(), customer.getLongitude(), cabs);
		System.out.println("Got the cab: "+cab);
		if (cab!=null){
			if (/*sharing && */cab.getCapacity()!= cab.getCustomers().size()){
				cab.getCustomers().add(customer);
				if (cab.getCapacity()== cab.getCustomers().size())
					cab.setAvailable(false);
				return true;
			}
			else return false;
		}
		//Cannot find a cab within the limited serach area. 
		else return false;
	}
}
