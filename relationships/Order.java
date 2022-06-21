package com.infosys.relationships;
public class Order {  //main
	private int orderId;
	private Food[] orderedFoods; //has a - Order has Food , o to o , o to many
	private double totalPrice;
	private String status;
	
	
	public Order(int orderId, Food[] orderedFoods) {
		this.orderId = orderId;
		this.orderedFoods = orderedFoods;
		this.status = "Ordered";
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	
	public Food[] getOrderedFoods() {
		return orderedFoods;
	}
	public void setOrderedFoods(Food[] orderedFoods) {
		this.orderedFoods = orderedFoods;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	public double calculateTotalPrice(String paymentMode) {
		double foodPrice = 0;
		double finalPrice = 0;
		float serviceCharge = 0f;
		for (Food food : orderedFoods) {
			foodPrice+=food.getUnitPrice()*1;
		}
		if (paymentMode.equals("Credit Card") || paymentMode.equals("Debit Card")) {
			serviceCharge = 2.0f;
		}
		else if (paymentMode.equals("PayPal")) {
			serviceCharge = 2.9f;
		}
		finalPrice = foodPrice+foodPrice*(serviceCharge/100);
		this.setTotalPrice(finalPrice);
		return finalPrice;
	}
	
}