package com.infy;

import java.time.LocalDate;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

import com.infy.entity.Customer;
import com.infy.service.CustomerService;
import com.infy.service.CustomerServiceImpl;

@SpringBootApplication
public class DemoSpringBootQueryCreation002Application implements CommandLineRunner {
	
	private static final Log LOGGER = LogFactory.getLog(DemoSpringBootQueryCreation002Application.class);
	
	@Autowired
	CustomerService customerService;

	@Autowired
	Environment environment;

	public static void main(String[] args) {
		SpringApplication.run(DemoSpringBootQueryCreation002Application.class, args);

	}

	public void run(String... args) throws Exception {

		
	   updateCustomerByEmailId();
	//findDateOfBirthByEmailId();
		deleteCustomerByEmailId();
		
		//findAllByName("martin");
		findAllNameByEmail();
	}
	public  void  findAllNameByEmail() {
		
		List<Customer> list=customerService.findAllNameByEmail("martin@infy.com");
		list.forEach(s->System.out.println(s.getCustomerId() +"  "+s.getEmailId()+"  "+s.getDateOfBirth()+"   "+s.getName()));
	}
	
//	public void  findAllByName(String name){
		
//		List<Customer> list=customerService.findAllByName(name);
		
//		for( Customer c: list) {
	//		System.out.println(c.getEmailId()+"  "+c.getName());
	//	}
		
//	}
	public void findDateOfBirthByEmailId() {
		try {
			LocalDate date1 = customerService.findDateOfBirthByEmailId("abc2022@infy.com");

			LOGGER.info("Customer DOB : " + date1);

		} catch (Exception e) {

			if (e.getMessage() != null)
				LOGGER.info(environment.getProperty(e.getMessage(),
						"Something went wrong. Please check log file for more details."));
		}
	}

	public void updateCustomerByEmailId() {

		try {
			customerService.updateCustomerEmailId("martin2022@infy.com", 1);
			LOGGER.info(environment.getProperty("UserInterface.UPDATE_SUCCESS"));
		} catch (Exception e) {

			if (e.getMessage() != null)
				LOGGER.info(environment.getProperty(e.getMessage(),
						"Something went wrong. Please check log file for more details."));
		}
	}

	public void deleteCustomerByEmailId() {

		try {
			customerService.deleteCustomerByEmailId("martin01@infy.com");
			LOGGER.info(environment.getProperty("UserInterface.DELETE_SUCCESS"));

		} catch (Exception e) {

			if (e.getMessage() != null)
				LOGGER.info(environment.getProperty(e.getMessage(),
						"Something went wrong. Please check log file for more details."));
		}
	}
}
