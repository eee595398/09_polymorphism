package edu.kh.poly.ex1.model.vo;

public class Spark extends Car { //경차
	
	private double discountOffer; // 할인해택
	
	public Spark() {
		// TODO Auto-generated constructor stub
	}

	public Spark(String engine, String fuel, int wheel, double discountOffer) {
		super(engine, fuel, wheel);
		this.discountOffer = discountOffer;
	}

	public double getDiscountOffer() {
		return discountOffer;
	}

	public void setDiscountOffer(double discountOffer) {
		this.discountOffer = discountOffer;
	}
	
	
	@Override
	public String toString() {
		return super.toString()+"/"+discountOffer;
	}
	
	

}