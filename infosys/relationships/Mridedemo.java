package com.infosys.relationships;
class Account {
	
}
class Loan{
	int id;
	Loan() {
		
	}
	Loan int id) {
		this.id=id;
	}
	public  double getEmi(double principle){   // public protected default private 
		return principle/12;
	}
	/*
	 * void show() {
	 * 
	 * }
	 */
}
class HousingLoan extends Loan {
	HousingLoan(){
		super();
	}
	void show() {
   }
	@Override
	public double getEmi(double principle){
		//super.show();
		//this.show();
		show();
		return (principle/12)+50.00;
	}
}
class CommercialBuildingLoan extends HousingLoan {
	void show123() {
	}
	@Override
	public double getEmi(double principle){
		return (principle/12)+500.00;
	}
}
public class Mridedemo {

	public static void main(String[] args) {
		Loan l=new Loan();
		
		System.out.println(l.getEmi(50000));
		//HousingLoan l1=new HousingLoan();
		l=new HousingLoan();
		
		System.out.println(l.getEmi(50000));
		
		//CommercialBuildingLoan l2=new CommercialBuildingLoan();
		l=new CommercialBuildingLoan();
		System.out.println(l.getEmi(50000));

	}

}
