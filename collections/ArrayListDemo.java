package collections;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;
class Course123{
	Integer id;
	String name;
	
	@Override
	public String toString() {
		return "Course123 [id=" + id + ", name=" + name + "]";
	}
	public Course123(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	Course123() {
		
	}
	
}

public class ArrayListDemo {

	public static void main(String[] args) {
		
		
		
		//Vector ll1= new Vector();
		ArrayList<Integer> ll1=new ArrayList();
		//Arrays.asList(90,78,67);
		ll1.add(20);
		ll1.add(78);
		ll1.add(12);
		System.out.println("using enumeration...");
		Enumeration e=ll1.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		
	//	ListIterator li=ll1.listIterator(); // fwd and backwd
	//	Iterator li=ll1.iterator();
	/*	System.out.println("List iterator...");
		
		  while(li.hasNext()) {
			  System.out.println(li.next()); }
		 
		while(li.hasPrevious()) {
			System.out.println(li.previous());
		}
		*/
		
		
		List<Course123> clist=Arrays.asList(new Course123(10,"java"),new Course123(20,"oracle"),new Course123(10,"java"));
		
		for( Course123 c:clist) {
			System.out.println(c.id+"   "+c.name);
		}
		
		Iterator<Course123> ci=clist.iterator();
		while(ci.hasNext()) {
			Course123 c=ci.next();
			System.out.println(c.name +"  "+c.id); 
		}
		
		
		               //faster, for modification
		//List<Integer> l1=new LinkedList<>();// delete 7   l1.clear()
		
		List<Integer> l1=new Vector<>();//sync, slow, mutithread
		l1.add(45);
		l1.add(7);
		l1.add(45);
		l1.add(7);
		l1.add(45);
		l1.add(7);
		l1.add(87);
		l1.add(23);
	//	l1.remove(3);
		l1.set(2, 9999);
		//clear, contains, size()....
		
		ArrayList<Integer> l2=new ArrayList<>();
		l2.add(56);
		l2.add(78);
		l1.addAll(l2);
		l2.addAll(l1);
		Iterator it=l1.iterator();
		System.out.println(l1);
		while(it.hasNext()) {
			
			System.out.println(it.next());
		}
		System.out.println(l1);
		
		
		
	//	List<Object> l=new ArrayList<>();
		//List l=new ArrayList();
		//ArrayList l=new ArrayList();
		//Collection l1=new ArrayList();
		/*
		l.add(100);  //autoboxed ,, can store object, primitive not allowed
		l.add(34.23); //Double  Object
		l.add("java");//String   Object
		l.add( LocalDate.now());
		l.add(new Course123());	
		l.add("java");
		l.add("java");
		System.out.println(l);
		System.out.println(l.get(2)); //auto un boxing
		System.out.println(l.contains("java"));
		System.out.println(l.size());
		//l.clear();
		System.out.println(l.indexOf("java"));
		System.out.println(l.lastIndexOf("java"));
		
		System.out.println(l);
		*/
		//List l1=new ArrayList();
		//l1.add(23);
		//l1.add(45);
		
		
		
		/*
		
		//bulck additon
		l.addAll(l1);  //union
		System.out.println(l);
		//l.removeAll(l1);  //minus
		l.retainAll(l1); //intersection
		System.out.println(l);
		System.out.println(l.containsAll(l1));
		
		Iterator i=l.iterator();
		
		System.out.println("using iterator...");
		while(i.hasNext()) { //check element is present
			
			//i.remove();
			System.out.println(i.next());//current element
		}
		System.out.println("for each...");
		for(Object o:l)
			System.out.println(o);
		
		List<Integer> list1=new ArrayList<>();
		list1.add(23);
		list1.add(67);
		System.out.println(list1);
		
		List<String> listString=new ArrayList<>();
		listString.add("java");
		listString.add("oracle");
		
		*/
	}

	@Override
	public String toString() {
		return "ArrayListDemo [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

}
