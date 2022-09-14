package com.infosys.relationships;
class Customer {//super, parent,base
	int customerId;
public Customer(int customerId) {
	System.out.println(" parent with parameterized constructor");
	this.customerId = customerId;
}
	public Customer() {
		// 3: Parent constructor will be executed
		System.out.println("Creating a customer...parent ");
		// 4: The flow will go back to the child constructor
	}
	
}
class RegularCustomer extends Customer {  //sub, child or derived 
	public RegularCustomer() {
		//super(10);
		// 2: This constructor will then call the parent constructor
		System.out.println("It is a regular customer! child");
		// 5: The flow will finally come here
	}
}
public class InheritanceTester {

	
		public static void main(String[] args) {
			RegularCustomer regularCustomer = new RegularCustomer();
			// 1: This line will be executed first and the flow will go to [2]
		}
	}