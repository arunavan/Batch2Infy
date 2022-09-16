package com.infosys.collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
class EmpSet{
	Integer id;
	String name;
	Double salary;
	
	public EmpSet(Integer id, String name, Double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	@Override
	public int hashCode() {
		return 1;
	}
	@Override
	public boolean equals(Object o) {
		boolean flag=false;
		EmpSet e1=(EmpSet)o;
		
			if(this.name.equals(e1.name) ) {
				 flag=true;
				
				}
			
		
			return flag;

	}
	
}
public class SetDemo2 {

	public static void main(String[] args) {
	//	Set<Integer> s=new HashSet<>();    //not sorted, not ordered
//		Set<Integer> s=new LinkedHashSet<>();  //ordered
	/*	Set<Integer> s=new TreeSet<>();  //sorted
		s.add(23);
		s.add(12);
		s.add(78);
		s.add(54);
		List a=Arrays.asList(4,5,8,9,5,8);
		s.addAll(a);
		System.out.println(s);
		for( Integer x: s)
			System.out.println(x);
		
	//	s.add(78);
	//	s.add(54);
	//	s.add(78);
	//	s.add(54);
	//	s.add(23);
	//	s.add(12);
		System.out.println(s);
		System.out.println(s.contains(54));
		System.out.println(s.size());
		//System.out.println(s.indexOf(54)); indexed based operations like get, set,indexOf
		//s.clear();
		s.isEmpty();
		Iterator<Integer> i =s.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		*/

		Set<EmpSet> eset=new HashSet<>();
		eset.add(new EmpSet(101,"Ram",99999.99));
		eset.add(new EmpSet(90,"Arav",59999.99));
		eset.add(new EmpSet(95,"Bhim",89999.99));
		eset.add(new EmpSet(80,"Raj",79999.99));
		eset.add(new EmpSet(101,"Ram",99999.99));
		eset.add(new EmpSet(102,"Ram",69999.99));
		System.out.println(eset);
		
	}

}
