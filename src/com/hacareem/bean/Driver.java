package com.hacareem.bean;

import java.io.Serializable;
import java.util.List;

public class Driver implements Serializable{
	private static final long serialVersionUID = -5789951849627014214L;
	String name;
	String age;
	String address;
	List<Rating> ratings;
	
	public List<Rating> getRatings() {
		return ratings;
	}
	public void setRatings(List<Rating> ratings) {
		this.ratings = ratings;
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
		return "Driver [name=" + name + ", age=" + age + ", address=" + address
				+ ", ratings=" + ratings + "]";
	}
}
