package com.infosys1;

public class Tester {

	public static void main(String[] args) {
		JointAccount j1=new JointAccount("ravi","989898","ravi@gmail.com");
		System.out.println(j1.getName());
		System.out.println(JointAccount.balance);  //static variable using classname
		JointAccount.disp();  //from other class 

	}

}
