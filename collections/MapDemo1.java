package com.infosys.collections;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;
class Book{
	Integer id;
	String tilte;
	Double price;
	public Book(Integer id, String tilte, Double price) {
		super();
		this.id = id;
		this.tilte = tilte;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", tilte=" + tilte + ", price=" + price + "]";
	}
}
public class MapDemo1 {
	public static void main(String[] args) {
		//Map<Integer,String> map=new HashMap<>();
	//	Map<Integer,String> map=new LinkedHashMap<>();
		Map<Integer,String> map=new TreeMap<>();
		map.put(1, "Java");
		map.put(6, "ORacle");
		map.put(2, "Spring");
		map.put(4, "Spring");
		map.put(3, "Java");
		map.put(5, "J2EE");
	//	map.put(4, LocalDate.now());
		System.out.println(map);
		Set keyset=map.keySet();
		System.out.println(keyset);
		Collection  val=map.values();
		System.out.println(val);
		Set keyval=map.entrySet();
		Iterator it=keyval.iterator();
		while(it.hasNext()) {
			Entry entry=(Entry)it.next();
			System.out.println(entry.getKey()+"  "+entry.getValue());
		}
		System.out.println(map.get(3));
		System.out.println(map.remove(2));
		System.out.println(map.containsKey(2));
		System.out.println(map.containsValue("Java"));
		map.replace(3,"Java","JDK");
		System.out.println(map);
		
		Map<Integer,Book> booksMap=new HashMap<>();
		booksMap.put(101, new Book(101,"Java",999.99));
		booksMap.put(102, new Book(102,"Java",349.99));
		booksMap.put(103, new Book(103,"Java",569.99));
		booksMap.put(null, new Book(104,"Java",999.99));
		booksMap.put(null, new Book(120,"Java",999.99));
		booksMap.put(131,null);
		booksMap.put(132,null);
		booksMap.put(133,null);
		
		List<Integer> l1=Arrays.asList(10,20,30,40,50);
		//for(Integer i : l1)
		//	System.out.println(i);
		
		l1.forEach(n->System.out.println(n));
	}
}
