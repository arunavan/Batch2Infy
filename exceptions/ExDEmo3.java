package com.infy.exceptions;

import java.io.FileReader;
import java.io.IOException;

public class ExDEmo3 {

	public static void main(String[] args) {
		FileReader f=null;
		try {
			 f=new FileReader("e:\\abc.txt");//compiletime 
			   
		}
		catch(Exception e) {
			try {}
			catch(Exception e2) {
			}
			
			System.out.println(e);   // sucess , unsuccess
		}
		finally{  // release of resource on both 
			try {
			 f.close();
			}
			catch(IOException e) {
				
			}
			//db.close();
		}
	}

}
