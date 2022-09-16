package com.infosys.collections;
public class EqualityTester<T> {
	T value1;  //declaring instance variable of T type
	T value2;	
	public EqualityTester(T value1, T value2) {
		this.value1=value1;
		this.value2=value2;
	}	
	public boolean checkEquals() {
		return value1.equals(value2);
	}
	public static void main(String[] args) {
		EqualityTester<Integer> tester1 = new EqualityTester<Integer>(10, 10);
		System.out.println(tester1.checkEquals()); //prints false
		
		EqualityTester<String> tester2 = new EqualityTester<String>("Ten", "Ten");
		System.out.println(tester2.checkEquals()); //prints false
	}
	
}