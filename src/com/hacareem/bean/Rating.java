package com.hacareem.bean;

public class Rating {
	private int satisfaction;
	private int safety;
	private int promptness;
	private int overall;
	private String review;
	public int getSatisfaction() {
		return satisfaction;
	}
	public void setSatisfaction(int satisfaction) {
		this.satisfaction = satisfaction;
	}
	public int getSafety() {
		return safety;
	}
	public void setSafety(int safety) {
		this.safety = safety;
	}
	public int getPromptness() {
		return promptness;
	}
	public void setPromptness(int promptness) {
		this.promptness = promptness;
	}
	public int getOverall() {
		return overall;
	}
	public void setOverall(int overall) {
		this.overall = overall;
	}
	public String getReview() {
		return review;
	}
	public void setReview(String review) {
		this.review = review;
	}
	@Override
	public String toString() {
		return "Rating [satisfaction=" + satisfaction + ", safety=" + safety
				+ ", promptness=" + promptness + ", overall=" + overall
				+ ", review=" + review + "]";
	}
}
