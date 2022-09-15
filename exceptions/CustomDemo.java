package com.infy.exceptions;
//custom
class DepositException extends Exception{
	DepositException(String s){
		super(s);
	}
}
//throw - to raise
//throw is to catch
public class CustomDemo {
	public static void main(String[] args) //throws DepositException
	{   DepositException d=new DepositException("minimum deposit is 1000/-");
		int amt=999;
		try {
			if(amt<1000)
				throw d;
			else
				System.out.println("Thank for using services...");
		} catch (DepositException e) {
			//System.out.println(e);
			//System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
