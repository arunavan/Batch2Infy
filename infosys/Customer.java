package com.infosys;


class OnlineCustomer extends Customer{   //inheritance is a
	
	
}

public class Customer {
	private int customerId;
	protected   String name;
	private long mobile;
	private String  email;
	//Order order; //composition  has -a 
	
	public Customer () {
		 name="Ram";
		 mobile=98987867l;
		 email="ram@gmail.com";
		 customerId=101;
	}
	
	public Customer(String email) {
		this.email = email;
	}
	
	
   //constructor overloading 
	public Customer(int customerId, String name) {
		this();
		//this("xyz@gmail.com"); //constructor chaining
		this.customerId = customerId;
		this.name = name;
		
	}
	public Customer(int customerId, String name, long mobile, String email) {
		this.customerId = customerId;
		this.name = name;
		this.mobile = mobile;
		this.email = email;
	}



  void show() {
	 System.out.println(customerId+"  "+name +"  "+mobile);
  }








	
	/*
	 * @Override public String toString() { return "Customer [customerId=" +
	 * customerId + ", name=" + name + ", mobile=" + mobile + ", email=" + email +
	 * "]"; }
	 */
	 

	public static void main(String[] args) {
		
		
		
		//String  city="Chennai";
		
	//	System.out.println(customerId);
		
		Customer customer=new Customer();  //JVM  //Object  //o1
		System.out.println(customer);
		//customer=null;
		System.out.println(customer);
		Customer c1=customer;
		Customer c2=customer;
		System.out.println(c1+"  "+c2);
	//	Customer cust=new Customer();  //o2
		
	//	customer=cust; //customer is gc
		System.gc();
		
		//customer =null; //gc- when cpu is idle, regular interval
	//	Customer customer=new Customer();
	/*	
		Customer c1=new Customer();  //ref
		Customer c2=new Customer();
		Customer c3=new Customer();
		
		
		customer.show();
		System.out.println(customer.email);
		System.out.println(customer.hashCode());
		System.out.println(customer);
		Customer customer1=new Customer(103,"ramesh");  //JVM
		System.out.println(customer1.hashCode());
		
		System.out.println(customer1);
		
		Customer customer2=new Customer(102,"ramkumar",98987867l,"ram@hotmail.com");  //JVM
		System.out.println(customer2);
		*/
	}











	
}
