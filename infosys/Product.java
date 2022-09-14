package com.infosys;
public class Product{ // public , protected, default, private 
	protected Integer id;
	protected  String name;

	protected Product(){  // no arg constructor
		id=101;
		name="bag";
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	protected void show() {
		System.out.println("This is show");
	}
	
	public void  calculateTotalPrice() {
		
	}
public static void main(String[] args) {
	Product p=new Product();
	p.show();
	System.out.println(p.id+"  "+p.name);
}
}
