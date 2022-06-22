package com.infosys1;

public class JointAccount {
	private String name;
	private String mobile;
	private String email;
	public static double balance=50000.00;  // compile 
	public static void disp() {
		JointAccount j =new JointAccount("ram","243214","sadsad");
		System.out.println("Display method.."+j.email);
	}
	
	void show() {
		System.out.println(balance);
	}
	public JointAccount(String name, String mobile, String email) {
		super();
		this.name = name;   //while object created 
		this.mobile = mobile;
		this.email = email;
	}
	
	public static void main(String[] args) {
	
		JointAccount a1=new JointAccount("Ram","9878987898","ram@gmail.com");
		JointAccount a2=new JointAccount("Arav","98723987898","arav@gmail.com");
		JointAccount a3=new JointAccount("Sri","9238987898","sri@gmail.com");
		System.out.println(a1.name+"  "+a1.mobile +"  "+a1.email  +balance); //sttaic varable direct
		System.out.println(a2.name+"  "+a2.mobile +"  "+a2.email +balance);
		System.out.println(a3.name+"  "+a3.mobile +"  "+a3.email +balance);
		disp();  //static method

	}

}
