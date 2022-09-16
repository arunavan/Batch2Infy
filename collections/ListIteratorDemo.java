package com.infosys.collections;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {
		
		
		List<Integer> a1=Arrays.asList(4,2,5,6,1,8,9);
		/*
		 * Iterator<Integer> i=a1.iterator(); while(i.hasNext()) {
		 * System.out.println(i.next()); }
		 */
		ListIterator<Integer> i=a1.listIterator();
		while(i.hasNext()) {
			  System.out.println(i.next()); 
			  }
		while(i.hasPrevious()) {
			System.out.println(i.previous());
		}
		
	}

}
