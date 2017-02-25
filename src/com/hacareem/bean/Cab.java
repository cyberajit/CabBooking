package com.hacareem.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Cab implements Serializable{
	private static final long serialVersionUID = -5446619320578585828L;
	private Driver driver;
	private String registration;
	private String make;
	private String model;
	private double longitude;
	private double latitude;
	private boolean available;
	private List<Customer> customers= new ArrayList<Customer>();
	private int capacity;
	
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public boolean isAvailable() {
		return available;
	}
	public void setAvailable(boolean available) {
		this.available = available;
	}
	public List<Customer> getCustomers() {
		return customers;
	}
	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}
	public Driver getDriver() {
		return driver;
	}
	public void setDriver(Driver driver) {
		this.driver = driver;
	}
	public String getRegistration() {
		return registration;
	}
	public void setRegistration(String registration) {
		this.registration = registration;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	@Override
	public String toString() {
		return "Cab [driver=" + driver + ", registration=" + registration
				+ ", make=" + make + ", model=" + model + ", longitude="
				+ longitude + ", latitude=" + latitude + "]";
	}
}
