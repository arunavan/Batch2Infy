package com.infosys;

import com.infosys.relationships.Bill;
import com.infosys.relationships.Food;

public class AccountImpl extends Account{
	int balance=10000;
	int withdraw(int amt) {
		this.balance=this.balance-amt;
		return this.balance;
	}

	int  deposit(int amt) {
		this.balance=this.balance+amt;
		return this.balance;
	}
	public static void main(String[] args) {
		Bill b=new Bill();
		//Food f=new Food();
		AccountImpl a=new AccountImpl();
		System.out.println(a.withdraw(2000));
		System.out.println(a.deposit(4000));
		
		System.out.println(a instanceof AccountImpl);
		System.out.println(a.getClass());
		
		//1.  new
		//2. clone()
		//3. Class.forName()
		//4. factory()
		//5. serilazation
		//6. newInstance()
		
		
	}
}
