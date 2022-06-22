package com.infosys;

public class WrapperDemo {

	public static void main(String[] args) {
///primititve - byte,short,int,float,long,double,char,boolean
		
//Wrapper - Character,Boolean ,Integer,Byte,Short,Lomg,Double,Float  - java.lang 
		int a=10;
		
		Integer a1=new Integer(10);  //Wrapup values stor ein the form of object
		//boxing
		
		Integer a2=10;   //10 conveted object  auto boxing  
		
		int x2=a2.intValue();//un boxing
		
		int x3=a2; //autounboxed
		
		System.out.println(a2+5);
		
		String marks="98";
		
		Character c='D'; //char c='D';
		Boolean result=true;  //boolean result=true;
		Byte b=90;
		//Long l=90;
		Short s=89;  //short s=98;
		
		
		Integer marksi=Integer.parseInt(marks);
		
		Double marksd=Double.parseDouble(marks);
		
		
		
		
		String ss1="tava";
		String ss2="sava";
		System.out.println(ss1.equalsIgnoreCase(ss2));
		System.out.println(ss1.equals(ss2));//content
		System.out.println(ss1==ss2);//address   true
		System.out.println(ss1.compareTo(ss2));  //integer
		
		Integer x1=10;
		String xx2=x1.toString();
		System.out.println(xx2);

	}

}
