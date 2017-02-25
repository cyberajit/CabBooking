package com.hacareem.operations;

import com.hacareem.bean.Driver;
import com.hacareem.bean.Rating;

public class ReviewRating {

	public static void setReviews(Driver driver, Rating rating){
		driver.getRatings().add(rating);
	}
}
