package com.infosys;

public class ProductTester extends Product{
	public static void main(String[] args) {
		Product p=new Product();
		
		p.show();
		System.out.println(p.id+"  "+p.name);
		ProductTester pt=new ProductTester();
		pt.show();
		System.out.println(pt.id+"  "+pt.name);
		
		System.out.println(p.getId()+"  "+p.getName());
		//p.id=101;
		//p.name="bag";
		p.setId(101);
		p.setName("box");
		System.out.println(p.getId()+"  "+p.getName());
		p.
	}
}
