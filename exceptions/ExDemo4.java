package com.infy.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
class A{
	void show()  throws InterruptedException,IOException
	{
		
	}
}

public class ExDemo4 extends A
{
	
	void show() throws InterruptedException,FileNotFoundException
	{
		//Thread.sleep(200);
		//FileReader f=new FileReader("e:\\abc.txt");//compiletime 
		
	}

	public static void main(String[] args) throws InterruptedException,IOException  
	{
		
		ExDemo4 d=new ExDemo4();
		d.show();
	}

}
