package collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ColllectionsDemo {

	public static void main(String[] args) {//testing function
		//Collection
		//Collections
		int x[]= {3,2,5,6,1,8,9,2,3};
		Arrays.sort(x);
		//Arrays.
		
		List a=Arrays.asList(4,2,6,7,8,1,9,2);
		System.out.println(a);
		
		
		Collections.sort(a);
		System.out.println(a);
		int index=Collections.binarySearch(a, 9);
		System.out.println(index);
		Collections.reverse(a);
		System.out.println(a);
		//Collections.fill(a,10);
		System.out.println(Collections.max(a));
		Collections.swap(a,2, 6);
		System.out.println(a);
		Collections.shuffle(a);
		System.out.println(a);
		
		LinkedList<Object> list = new LinkedList<Object>();     //line 1	
		list.add("Java");
		list.add(20);
		list.add(3.5);
		list.add(100);
		Object o=list.set(0, "Data Structures");
		if(o!=null)     //line 2
			System.out.println("Successfully replaced!");
		else
			System.out.println("Not replaced!");	
	}
		
		

	}


