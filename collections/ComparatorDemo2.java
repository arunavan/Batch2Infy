package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class  PriceComparator implements Comparator {
	
	public int compare(Object o1,Object o2) {
		Laptop l1=(Laptop)o1;
		Laptop l2=(Laptop)o2;
		if(l1.price>l2.price)
			return 1;
					
			else if (l1.price<l2.price)
				return -1;
			else
				return 0;
		
		
	}
}
class  QtyComparator implements Comparator {
	
	public int compare(Object o1,Object o2) {
		Laptop l1=(Laptop)o1;
		Laptop l2=(Laptop)o2;
		if(l1.qty>l2.qty)
			return 1;
					
			else if (l1.qty<l2.qty)
				return -1;
			else
				return 0;
		
		
	}
}

public class ComparatorDemo2 {

	public static void main(String[] args) {
		List<Laptop> l=new ArrayList<>();
		l.add(new Laptop(10,30000.00,20.00));
		l.add(new Laptop(20,80000.00,15.00));
		l.add(new Laptop(30,40000.00,18.00));
		l.add(new Laptop(40,850000.00,11.00));
		l.add(new Laptop(50,50000.00,12.00));
		System.out.println(l);
		Collections.sort(l,new QtyComparator());
		System.out.println(l);
		Collections.sort(l,new PriceComparator());
		System.out.println(l);
		

	}

}
