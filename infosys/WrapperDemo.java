package com.infosys;

class Emp{
	Integer empId; //int 
	String name;
	Long mobile; //  byte  Byte , long   Long, double Double, float Float
}

public class WrapperDemo {

	public static void main(String[] args) {
///primititve - byte,short,int,float,long,double,char,boolean
		//java.lang.
//Wrapper - Character,Boolean ,Integer,Byte,Short,Lomg,Double,Float  - java.lang 
		int a=10;   //Integer
		
		Integer aObj=new Integer(a); //primitive to object - boxing,
		Integer aObj1=a; //autoboxing
		
		int aval=aObj.intValue();//unboxing  Object to primitive
		int aval1=aObj;//autounboxing.
		
		
		float b=20f;  //Float
		long c=89l;  //Long
		byte bb=9;  //Byte
		char op='*'; //Character
		boolean reuslt=true; //Boolean
		
		
		Integer a1=new Integer(10);  //Wrapup values stor ein the form of object
		//boxing
		//implicit boxing
		Integer a2=10;   //10 conveted object  auto boxing  
		
		int x2=a2.intValue();//un boxing
		int xx2=a2;//implicit unboxing   //auto unboxing 
		
		int x3=a2; //autounboxed
		
		System.out.println(a2+5);
		
		String marks="98";
		
	//	Character c='D'; //char c='D';
		Boolean result=true;  //boolean result=true;
	//	Byte b=90;
		//Long l=90;
		Short s=89;  //short s=98;
		
		
		Integer marksi=Integer.parseInt(marks);
		
		Double marksd=Double.parseDouble(marks);
		
		
		//why String are immutable in java?
		
		
		String ss1="Sava";
		String ss2="sava";
		System.out.println(ss1.equalsIgnoreCase(ss2));
		System.out.println(ss1.equals(ss2));//content
		System.out.println(ss1==ss2);//address   true
		System.out.println(ss1.compareTo(ss2));  //integer
		
		Integer x1=10;
		String xxx2=x1.toString();
		System.out.println(xxx2);

	}
}
