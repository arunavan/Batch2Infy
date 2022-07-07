package com.infy.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infy.entity.Customer;
import com.infy.exception.InfyBankException;
import com.infy.repository.CustomerRepository;

@Service(value = "customerService")
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public LocalDate findDateOfBirthByEmailId(String emailId) {
		return customerRepository.findDateOfBirthByEmailId(emailId);
	}

	
	/*  @Override public List<Customer> findAllByName(String name) 
	  { return
	  customerRepository.findAllByName(name); 
	  }
	  */
	
	  @Override 
	  public List<Customer> findAllNameByEmail(String email){
		  return	 customerRepository.findAllNameByEmailId(email); 
		  }
	 
	  @Override public void updateCustomerEmailId(String newEmailId, Integer
	  customerId) throws InfyBankException { Optional<Customer> optional =
	  customerRepository.findById(customerId);
	  
	  optional.orElseThrow(() -> new
	  InfyBankException("Service.CUSTOMER_UNAVAILABLE"));
	  
	  customerRepository.updateCustomerEmailId(newEmailId, customerId);
	  
	  
	  }
	  
	  @Override public void deleteCustomerByEmailId(String emailId) throws
	  InfyBankException { 
		 
	   customerRepository.deleteCustomerByEmailId(emailId); 
	 }
	 

}
