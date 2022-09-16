package com.infosys.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
class Mobile{
	private Integer id;
	private Double price;
	public Mobile(Integer id, Double price) {
		super();
		this.id = id;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Mobile [id=" + id + ", price=" + price + "]";
	}
	
	
}
public class Demo1 {
	public static void main(String[] args) {
			//ArrayList a=new ArrayList();
		//List<Object> a=new ArrayList<>();
		LinkedList<Integer> a=new LinkedList<>();
		
		a.add(23);
		a.add(25);
		a.set(1, 99);
		a.add(67);
		a.addFirst(33);
		a.addLast(22);
		a.removeFirst();
		a.removeLast();
		a.add(65);
		a.add(23);
		a.add(25);
		a.add(67);
		a.add(65);
		//a.add(433.2321);
		//a.add("Java");
		//a.add(new Date());
		//a.add(new Mobile(10,9999.99));
		System.out.println(a);
		System.out.println(a.get(2));
		System.out.println(a.size());
		System.out.println(a.indexOf(67));
		System.out.println(a.lastIndexOf(67));
		System.out.println(a.contains(99));
		System.out.println(a.contains(25));
		System.out.println(a.isEmpty());
		//a.clear();
		System.out.println(a.isEmpty());
		System.out.println(a);
		List<Integer> a1=new ArrayList<>();
		a1.add(200);
		a1.add(201);
		a1.add(202);
		a.addAll(a1);
	//	System.out.println(a1);
	//	System.out.println(a);
	//	a.remove(6);
		System.out.println(a);
	//	a.removeAll(a1);
		System.out.println(a1);
		System.out.println(a);
		System.out.println(a.containsAll(a1));
	//	a.retainAll(a1);
		System.out.println(a);
		System.out.println("using for ......");
	for( Integer i :a)
		System.out.println(i);
	System.out.println("using iterator===");
	Iterator it=a.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	Collections.sort(a);
	System.out.println(a);
	
	
	
	}
}
