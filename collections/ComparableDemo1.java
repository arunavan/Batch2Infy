package collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
class  Laptop //implements Comparable<Laptop>
{	Integer id;
	Double price;
	Double qty;
	public Laptop(Integer id, Double price, Double qty) {
		super();
		this.id = id;
		this.price = price;
		this.qty = qty;
	}
  public int compareTo(Laptop l) {
	 if(this.qty>l.qty)
		 return 1;
	 else if(this.qty<l.qty)
		 return -1;
	 else
		 return 0;
	  
  }
	@Override
	public String toString() {
		return "Laptop [id=" + id + ", price=" + price + ", qty=" + qty + "]";
	}
	
	
}
public class ComparableDemo1 {
	public static void main(String[] args) {
	List<Laptop> l=new ArrayList<>();
	l.add(new Laptop(10,90000.00,20.00));
	l.add(new Laptop(20,80000.00,15.00));
	l.add(new Laptop(30,70000.00,18.00));
	l.add(new Laptop(40,70000.00,11.00));
	l.add(new Laptop(50,70000.00,12.00));
	System.out.println(l);
//	Collections.sort(l);
	System.out.println(l);
	}

}
