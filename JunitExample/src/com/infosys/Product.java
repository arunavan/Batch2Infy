package com.infosys;

public class Product {
	int qty;
	int price;
	int totalPrice;
	Product(){}
	
	public int getQty() {
		return qty;
	}


	public void setQty(int qty) {
		this.qty = qty;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public int getTotalPrice() {
		return totalPrice;
	}


	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}


	public Product(int qty, int price, int totalPrice) {
		super();
		this.qty = qty;
		this.price = price;
		this.totalPrice = totalPrice;
	}


	//unit testing
	public int calcTotalPrice( int qty,int price)
	{
		this.qty=qty;
		this.price=price;
		totalPrice=this.qty*this.price;
		return totalPrice;
	}
	

}
