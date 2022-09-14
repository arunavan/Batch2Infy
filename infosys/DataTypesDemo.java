package com.infosys;
class ScopeDemo{
	int y; //object , constructor, scope is within class all methods 
	 ScopeDemo() {
		 
	 }
	{  //auto before constructor , instance block
		int f=0;
		
		
	}
	void show(int z) {  // local 
		int x=0;  //within method , local
		System.out.println(x);
		System.out.println(z);
		System.out.println(y);
	}
	void disp123() {
		System.out.println(y);
	}
static	void disp() {
	ScopeDemo ss= new ScopeDemo();
		System.out.println(ss.y);
	}
	
	
}
class DataTypesDemo{
	
	void typeDisplay() {
		ScopeDemo s=new ScopeDemo();
		System.out.println(s.y);
		
	}
	

    public static void main(String[] args) {
    	
    	float marks=89.97F;
    	long discount1=70l;
        int price = 100; //primitive data type
        double discount = 25.5;
        String size = "Medium"; //non-primitive data type
        
        System.out.println("Prize after discount: "+price*(1-discount/100));
        
        //Variable declared using var keyword
        var customerName = "Rob Jones"; // infers String
        System.out.println( customerName +" ordered a "+size+" pizza");
        
    }
}
