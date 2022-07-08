package com.infy;

import java.time.LocalDate;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

import com.infy.dto.CustomerDTO;
import com.infy.dto.LoanDTO;
import com.infy.service.CustomerLoanService;

@SpringBootApplication
public class DemoManyToOneApplication implements CommandLineRunner {
	
	public static final Log LOGGER = LogFactory.getLog(DemoManyToOneApplication.class);

	@Autowired
	CustomerLoanService customerLoanService;
	
	@Autowired
	Environment environment;

	public static void main(String[] args) {
		SpringApplication.run(DemoManyToOneApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
	//	addLoanAndCustomer();
      getLoanDetails();	
	//sanctionLoanToExistingCustomer();
   // closeLoan();
	//	deleteLoan();

	}

	public void getLoanDetails() {
		try {
			LoanDTO loanDTO=customerLoanService.getLoanDetails(2001);
			LOGGER.info(loanDTO);
		} catch (Exception e) {
			String message = environment.getProperty(e.getMessage(),"Some exception occured. Please check log file for more details!!");

			LOGGER.info(message);
		}
	}
	
	public void addLoanAndCustomer() {
		try{
			LoanDTO loanDTO=new LoanDTO();
			
			loanDTO.setAmount(233333.88);
			loanDTO.setLoanIssueDate(LocalDate.of(2022, 11, 1));
			loanDTO.setStatus("Pending");

           LoanDTO loanDTO1=new LoanDTO();
			
			loanDTO1.setAmount(500000.00);
			loanDTO1.setLoanIssueDate(LocalDate.of(2022, 11, 1));
			loanDTO1.setStatus("Applied");

			 LoanDTO loanDTO2=new LoanDTO();
				
				loanDTO2.setAmount(550000.00);
				loanDTO2.setLoanIssueDate(LocalDate.of(2022, 11, 1));
				loanDTO2.setStatus("Sanctioned");
			
			CustomerDTO customerDTO=new CustomerDTO();
			//customerDTO.setCustomerId(100);
			customerDTO.setDateOfBirth(LocalDate.of(1992, 1, 10));
			customerDTO.setEmailId("smith@infy.com");
			customerDTO.setName("Smith");
			
			//loanDTO.setCustomer(customerDTO);
		
			loanDTO1.setCustomer(customerDTO);
			Integer loanId=
					customerLoanService.addLoanAndCustomer(loanDTO1);
			
			LOGGER.info(environment.getProperty("UserInterface.NEW_LOAN_CUSTOMER_SUCCESS")+loanId);//+"  "+loanId1);


		}catch(Exception e){
			String message = environment.getProperty(e.getMessage(),"Some exception occured. Please check log file for more details!!");

			LOGGER.info(message);
		}

	}

	public void sanctionLoanToExistingCustomer() {
		try{
			
			LoanDTO loanDTO=new LoanDTO();
			loanDTO.setAmount(573279.0);
			loanDTO.setLoanIssueDate(LocalDate.of(2013, 11, 1));
			loanDTO.setStatus("Sanctioned");
			Integer customerId=1005;
			customerLoanService.sanctionLoanToExistingCustomer(customerId, loanDTO);
			LOGGER.info(environment.getProperty("UserInterface.LOAN_SANCTION_SUCCESS"));

		}catch(Exception e){
			String message = environment.getProperty(e.getMessage(),"Some exception occured. Please check log file for more details!!");

			LOGGER.info(message);
		}

	}
	
	public void closeLoan() {
		try {
			Integer loanId=5;
			customerLoanService.closeLoan(loanId);
			LOGGER.info(environment.getProperty("UserInterface.LOAN_CLOSE_SUCCESS"));
		} catch (Exception e) {
			String message = environment.getProperty(e.getMessage(),"Some exception occured. Please check log file for more details!!");
			LOGGER.info(message);
		}

	}
	
	public void deleteLoan() {
		try {
			Integer loanId=1;
			customerLoanService.deleteLoan(loanId);
			LOGGER.info(environment.getProperty("UserInterface.LOAN_DELETE_SUCCESS"));
		} catch (Exception e) {
			String message = environment.getProperty(e.getMessage(),"Some exception occured. Please check log file for more details!!");
			LOGGER.info(message);
		}

	}

}

