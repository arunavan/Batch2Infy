package collections;
class GenericMethod {
	public static <E> void displayDetails (E x) {
		
		System.out.println(x);
	}
}
public class GenericsDemo1 {

	public static void main(String[] args) {
		GenericMethod.displayDetails(20);
		GenericMethod.displayDetails(20.0);
		GenericMethod.displayDetails('C');
		GenericMethod.displayDetails("Java");
		
		
	}

}
