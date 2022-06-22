package com.infosys.relationships;

public class Bill {
	private int  billId;
	
	public Bill() {}
	public Bill(String paymentMode) {
		
		this.paymentMode = paymentMode;
	}
	public Bill(int billId, String paymentMode) {
		super();
		this.billId = billId;
		this.paymentMode = paymentMode;
	}
	public int getBillId() {
		return billId;
	}
	public void setBillId(int billId) {
		this.billId = billId;
	}
	public String getPaymentMode() {
		return paymentMode;
	}
	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}
	String paymentMode;
	
	boolean generateBill(Order order) {  //uses-a - association
		System.out.println("Bill details \n***********");
		System.out.println("Bill Id : " + this.getBillId());
		System.out.println("Items ordered : ");
		for (Food food : order.getOrderedFoods()) {
			System.out.println(food.getFoodName());
		}
		double payableAmount = order.calculateTotalPrice(this.getPaymentMode());
		System.out.println("Payable Amount : $" + (int) (payableAmount * 100)
				/ 100.0);
		return true;
	}

}
