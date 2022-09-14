package com.infosys;

class College{
	Integer id;
	String name;
	final String chairman="VVRao";    //constant
	final double pi=3.142;  //constant cannot be modified
	
	void show() {
		System.out.println(chairman);
		System.out.println(chairman.toUpperCase());
		System.out.println(chairman);
		
		System.out.println(pi);
		//pi+=5;
	}
	
}

public class FinalDemo {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
