package com.infy.repository;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;


import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.infy.dto.CustomerDTO;
import com.infy.entity.Customer;

@Repository(value = "customerRepository")
public class CustomerRepositoryImpl implements CustomerRepository {
	
	//db connection
	@PersistenceContext
	private EntityManager entityManager; //entities  detached 

	@Override
	public CustomerDTO getCustomer(Integer customerId) {
		CustomerDTO customerDTO = null;   //select ,get
		Customer customer = entityManager.find(Customer.class, customerId);//select *
		if (customer != null) {
			customerDTO = new CustomerDTO();
			customerDTO.setCustomerId(customer.getCustomerId());
			customerDTO.setDateOfBirth(customer.getDateOfBirth());
			customerDTO.setEmailId(customer.getEmailId());
			customerDTO.setName(customer.getName());
			customerDTO.setCustomerType(customer.getCustomerType());
		}
		return customerDTO;
	}

	@Override
	public void addCustomer(CustomerDTO customerDTO) {
		Customer customer = new Customer();
		customer.setCustomerId(customerDTO.getCustomerId());
		customer.setDateOfBirth(customerDTO.getDateOfBirth());
		customer.setEmailId(customerDTO.getEmailId());
		customer.setName(customerDTO.getName());
		customer.setCustomerType(customerDTO.getCustomerType());//new 
	//1  new/trans
		//Transaction tx=entityManager.getTransaction();
		
		entityManager.persist(customer);//db  insert into table values....
		
		//2 persistence /managed state 
	}

	@Override
	public Integer updateCustomer(Integer customerId, String emailId) {
		Integer customerIdReturned = null;
		Customer customer = entityManager.find(Customer.class, customerId);
		// entityManager.getTransaction().begin();  
		customer.setEmailId(emailId); //update
		//entityManager.getTransaction().commit();
		//entityManager.getTransaction().rollback();      insert,update,delete
		customerIdReturned = customer.getCustomerId();
		return customerIdReturned;
	}

	@Override
	public Integer deleteCustomer(Integer customerId) {
		Customer customer = entityManager.find(Customer.class, customerId);
		//Transaction transaction = entityManager.getTransaction()  ;
		//transaction.begin();
	   // entityManager.getTransaction().begin();  
		entityManager.remove(customer);               //delete from db //3 removed
		//entityManager.getTransaction().commit();  //permannet changes into db
		//entityManager.getTransaction().rollback(); // inconsistent state values should be cancelled 
		Integer customerIdReturned = customer.getCustomerId();
		return customerIdReturned;
	}
	
	@Override
	public  List<CustomerDTO>  getAllCustomers(){
		
		List<CustomerDTO> customerDTOlist = new ArrayList<CustomerDTO>(); 
		 Query query= entityManager.createQuery("select c from Customer c");
		 List<Customer> customerlist=query.getResultList();
		for(Customer customer: customerlist) {
		CustomerDTO	customerDTO = new CustomerDTO();
			customerDTO.setCustomerId(customer.getCustomerId());
			customerDTO.setDateOfBirth(customer.getDateOfBirth());
			customerDTO.setEmailId(customer.getEmailId());
			customerDTO.setName(customer.getName());
			customerDTO.setCustomerType(customer.getCustomerType());
			customerDTOlist.add(customerDTO);
		}
		return customerDTOlist;
		
	}
}
