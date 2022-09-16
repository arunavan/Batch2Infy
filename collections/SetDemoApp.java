package collections;
import java.util.*;

class Project{
	String title;
	int duration;
	String location;
	/*
	 * @Override public int hashCode() { final int prime = 31; int result = 1;
	 * result = prime * result + duration; result = prime * result + ((location ==
	 * null) ? 0 : location.hashCode()); result = prime * result + ((title == null)
	 * ? 0 : title.hashCode()); return result; }
	 * 
	 * @Override public boolean equals(Object obj) { if (this == obj) return true;
	 * if (obj == null) return false; if (getClass() != obj.getClass()) return
	 * false; Project other = (Project) obj; if (duration != other.duration) return
	 * false; if (location == null) { if (other.location != null) return false; }
	 * else if (!location.equals(other.location)) return false; if (title == null) {
	 * if (other.title != null) return false; } else if (!title.equals(other.title))
	 * return false; return true; }
	 */
	
}

public class SetDemoApp {

	public static void main(String[] args) {
		Set<Object> s=new  LinkedHashSet<>(); //unique
		s.add(23);
		s.add(12);
		s.add(67);
		s.add(12);
		s.add(67);
		System.out.println(s);//23,12,67
		//s.clear();
		System.out.println(s.isEmpty());
		// indexing not possible
		s.remove(12);
		s.add(123);
		s.add("java");
		Iterator i=s.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println(" foreach method....");
		s.forEach(System.out::println);
		
		Set<Course123> courseSet=new	LinkedHashSet<>(); //ordered
		  // equals() n hashCode()
		courseSet.add(new Course123(9,"spring")); //this  //duplicate
		courseSet.add(new Course123(7,"microservices")); //this  //duplicate
		
		courseSet.add(new Course123(1,"rest"));
		courseSet.add(new Course123(9,"spring")); //obj //duplicate
		courseSet.add(new Course123(2,"spring"));
		
		System.out.println(courseSet);
		
		Set<String> ts=new TreeSet<>(); //auto sorted
		ts.add("oracle");
		ts.add("abc");
		ts.add("java");
		ts.add("bbc");
		System.out.println(ts);
		
		Set<Course123> cSet=new TreeSet<>();
		cSet.add(new Course123(1,"rest"));
		cSet.add(new Course123(9,"spring")); //obj //duplicate
		cSet.add(new Course123(2,"mysql"));
		System.out.println(cSet);
		
		Set<Product5> pSet=new TreeSet<>(new Namecomparator1());
		pSet.add(new Product5(9,89.90,"s123"));
		pSet.add(new Product5(2,29.90,"a123"));
		pSet.add(new Product5(7,69.90,"c123"));
		pSet.add(new Product5(4,49.90,"b123"));
		System.out.println(pSet);
		
		List<Product5> plist=new ArrayList<>();
		plist.add(new Product5(9,89.90,"s123"));
		plist.add(new Product5(2,29.90,"a123"));
		plist.add(new Product5(7,69.90,"c123"));
		plist.add(new Product5(4,49.90,"b123"));
		System.out.println(plist);
		Collections.sort(plist,new Namecomparator1());
		System.out.println(plist);
		
		
		

	}

}

class Pricecomparator1 implements Comparator{
	
	public int compare(Object o1,Object o2) {
		Product5 p1=(Product5)o1;
		Product5 p2=(Product5)o2;
		if( p1.price<p2.price)
			return -1;
		else if(p1.price>p2.price)
			return 1;
		else
			return 0;
			
		
		
	}
	
}
class IdComparator2 implements Comparator{
	public int compare(Object o1,Object o2) {
		Product5 p1=(Product5)o1;
		Product5 p2=(Product5)o2;
		if( p1.id<p2.id)
			return -1;
		else if(p1.id>p2.id)
			return 1;
		else
			return 0;
}
}
class Namecomparator1 implements Comparator{
	public int compare(Object o1,Object o2) {
		Product5 p1=(Product5)o1;
		Product5 p2=(Product5)o2;
		return ((p1.name).compareTo(p2.name));
}
}



