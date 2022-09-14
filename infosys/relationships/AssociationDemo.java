package com.infosys.relationships;

class Allowance{
	
	String  type;
	double amount;
}



class Employee
{
	int id;
	String name;
	double basic;
	//Allowance all;
	double  calculatePay(Allowance all) {//association
		
		return basic+(basic*0.30)+(basic*0.05)+all.amount;
	}
	
		
	
	
	
}
public class AssociationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
