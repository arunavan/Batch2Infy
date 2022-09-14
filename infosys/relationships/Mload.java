package com.infosys.relationships;

public class Mload {
	//within a class, static , compiletime 
	void area(int s) {
		System.out.println("Square:"+(s*s));
	}
	
	int area(int l ,double b) {
		System.out.println("Rectangle:"+(l*b));
		return 1;
	}

	void area(double s) {
		System.out.println("Circle:"+(3.142*s*s));
	}
	void area(double h,int b) {
		System.out.println("traingle:"+(1/2*b*h));
	}
	public static void main(String[] args) {
		Mload m =new Mload();
		m.area(4);
		m.area(4,8);
		m.area(5.0);

	}

}
