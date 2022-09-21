package com.infosys.JdbcApp;

import java.util.Optional;

class Employee{
	Integer id;
	String name;
	public Employee(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
	
}

public class OptionalDemo {
		public static void main(String args[]) throws ProductNotAvailable{
			
			
			Employee employee = new Employee(101, "Jack");
			Optional<Employee> optional = Optional.ofNullable(employee);
			System.out.println(optional.isPresent());
			optional.ifPresent(e -> {
				  System.out.println(e.getId());
				  System.out.println(e.getName());
				});

		Integer value1 =35;
	//	System.out.println(value1*10);//
		
		Integer value2 =new Integer(10);
		
		
		//container , any type ,empty
		
		Optional<Integer> x=Optional.of(80); //10
		System.out.println(x.get()+20);
		
		
			System.out.println(x.get()+20);	
		//Optional.ofNullable - allows passed parameter to be null.
			
		Optional<Integer> a =Optional.ofNullable(89);
		System.out.println(a);
				
		//Optional.of - throws NullPointerException if passed parameter is null
		Optional<Integer> b =Optional.of(value2);
		System.out.println(sum(a,b));
		}
			
		static public Integer sum(Optional<Integer> a,Optional<Integer> b) throws ProductNotAvailable {
			
			
		//Optional.isPresent - checks the value is present or not
				
		System.out.println("First parameter is present: "+a.isPresent());
		System.out.println("Second parameter is present: "+b.isPresent());
				
		//Optional.orElse - returns the value if present otherwise returns
		//the default value passed.
		//Integer value1 =a.orElse(new Integer(20));
			
		Integer value1 =a.orElseThrow(ProductNotAvailable::new);
		
		//Optional.get - gets the value, value should be present
	//	Integer value2 =b.get();
		return value1+b.get();
		}
		}


class ProductNotAvailable extends Exception{
	ProductNotAvailable(){
		System.out.println("Not available...");
	}
	
	ProductNotAvailable(String s){
		super(s);
	}
	
}
