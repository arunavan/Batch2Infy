package com.infy.exceptions;

import java.io.FileReader;

public class ExDemo1 {

	public static void main(String[] args) {
		int a,b,c;
		a=10;
		b=0;
		int x[]= {4,5,6};  //try-catch, try-multiple catch,nested try-catch
		
		
			 
			     
		   
		
		try {
			 try {
					System.out.println(x[4]);
				} catch (ArrayIndexOutOfBoundsException e1) {
					
					e1.printStackTrace();
				}
					c=a/b;
				System.out.println("reuslt:"+c);
			
		}
		catch(ArithmeticException e) {
			//e.printStackTrace();
			
			//System.out.println(e);
			System.out.println(e.getMessage());
			
		}
	
		System.out.println("thank you");

	}

}


//	String s=null;
//	System.out.println(s.length());//runtime unchecked

//   int a=10/0;  //unchecked runtime //arith, java.lang, exception handler     try-catch, throws, throw
//	FileReader f=new FileReader("e:\\abc.txt");//compiletime 
   
//	Thread.sleep(500);//checked ,compiletime
