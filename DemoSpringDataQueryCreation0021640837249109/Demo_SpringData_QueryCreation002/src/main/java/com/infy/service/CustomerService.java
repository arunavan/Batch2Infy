package com.infy.service;

import java.time.LocalDate;
import java.util.List;

import com.infy.entity.Customer;
import com.infy.exception.InfyBankException;

public interface CustomerService {
	LocalDate findDateOfBirthByEmailId(String emailId);
//	public List<Customer> findAllByName(String name);
	void updateCustomerEmailId(String newEmailId, Integer customerId) throws InfyBankException;
	void deleteCustomerByEmailId(String emailId) throws InfyBankException;
	List<Customer> findAllNameByEmail(String email);
}
