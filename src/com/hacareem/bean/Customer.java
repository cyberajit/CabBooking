package com.hacareem.bean;

import java.io.Serializable;

public class Customer implements Serializable{
	private static final long serialVersionUID = -8739223904491550895L;
	String name;
	String age;
	String address;
	long latitude;
	long longitude;
	
	public long getLatitude() {
		return latitude;
	}
	public void setLatitude(long latitude) {
		this.latitude = latitude;
	}
	public long getLongitude() {
		return longitude;
	}
	public void setLongitude(long longitude) {
		this.longitude = longitude;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", age=" + age + ", address="
				+ address + "]";
	}
}
