package com.infosys;

import static com.infosys1.JointAccount.*;


public class Demo //extends Customer
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer customer=new Customer(); 
		System.out.println(customer.name);
		customer.show();
		Demo d=new Demo();
	//	System.out.println(d.name);
		
		Product pp=new Product();
		pp.show();
		System.out.println(pp.id+"  "+pp.name);
	//	JointAccount jt=new JointAccount("ram","324324324","ram@gmail.com");
		//System.out.println(JointAccount.balance);
		System.out.println(balance);
		//JointAccount.disp();
		disp();
	}

}
