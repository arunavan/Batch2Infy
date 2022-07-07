package com.infy;

import java.time.LocalDate;
import java.util.Optional;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.infy.entity.Customer;
import com.infy.entity.Product;
import com.infy.repository.CustomerRespository;
import com.infy.repository.ProductRepository;

@SpringBootApplication
public class DemoSpringDataApplication implements CommandLineRunner {

	private static final Log LOGGER = LogFactory.getLog(DemoSpringDataApplication.class);
	@Autowired
	CustomerRespository customerRepository;
	
	@Autowired
	ProductRepository productRepository;

	public static void main(String[] args) {
		SpringApplication.run(DemoSpringDataApplication.class, args);

	}

	public void run(String... args) throws Exception {
		
		Product p1=new Product();
	//	p1.setProductId(12);
		p1.setProductName("table");
		productRepository.save(p1);
		Product p2=new Product();
		p2.setProductName("bag");
		productRepository.save(p2);
		//Optional<Product> op=productRepository.findById(10); 
		//System.out.println(op.get());
		
		Iterable<Product> plist=productRepository.findAll();
		
		plist.forEach(p->System.out.println(p.getProductId()+"  "+p.getProductName()));
		
		
		
//1  new /transcinet
	//	Customer customer1 = new Customer(10, "raj@infy.com", "Monica", LocalDate.of(1987, 4, 2));
	//	Customer customer2 = new Customer(11, "ram@infy.com", "Allen", LocalDate.of(1980, 4, 2));

		// save customers   //2
	//	customerRepository.save(customer1); //insert 1 record
	//	customerRepository.save(customer2);

		//3
		//customerRepository.delete(entity);
		// fetch customer by id
		
	//	 LOGGER.info("Customer fetched by findById(1)");
	//	  LOGGER.info("-------------------------------"); 
	//	  Customer customer3 =  customerRepository.findById(3).get(); 
	//	  customerRepository.delete(customer3);
	//	  LOGGER.info(customer3);
		  
	//	customerRepository.deleteById(3);
		
		  // fetching all customers LOGGER.info("Customers fetched by findAll()");
	//	  LOGGER.info("-------------------------------"); 
	//	  Iterable<Customer> customers  = customerRepository.findAll();
	//	  customers.forEach(x->System.out.println(x));
		//  customers.forEach(LOGGER::info);
		  
		  
	//	  Optional<Customer> c1=customerRepository.findById(2);
	//	  System.out.println(c1.get());
		 
	}

}
