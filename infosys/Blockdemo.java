package com.infosys;
public class Blockdemo {
	Blockdemo () {
		System.out.println(" constructor...");
	}
	{ //for every object 
		System.out.println("instance block");
		show();
	}
	static  { //once in life cycle of class   class compiled
		show();
		System.out.println("static block");
	}
	static void show() {
	}
	public static void main(String[] args) {
		System.out.println(" main is started..");
		Blockdemo b=new Blockdemo();
		Blockdemo b1=new Blockdemo();
		Blockdemo b2=new Blockdemo();
	}
}
