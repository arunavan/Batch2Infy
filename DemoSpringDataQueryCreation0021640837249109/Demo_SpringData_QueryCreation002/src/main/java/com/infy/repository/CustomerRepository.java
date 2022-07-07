package com.infy.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.infy.entity.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {
//	@Query("SELECT c.dateOfBirth FROM Customer c WHERE c.emailId = ?1")
//	LocalDate findDateOfBirthByEmailId(String emailId); //1 param
	
	@Query("SELECT c.dateOfBirth FROM Customer c WHERE c.emailId = :email")
		//update , delete 
		LocalDate findDateOfBirthByEmailId(@Param("email") String emailId);
	 
	@Query("SELECT c from Customer c where c.emailId= ?1")
    List<Customer> findAllNameByEmailId( String email);
	
	
	/*
	 * @Query("SELECT c FROM Customer c where c.name=?1 order by c.name")
	 * List<Customer> findAllByName(String name);
	 * 
	 */ 
	  @Query("UPDATE Customer c SET c.emailId = :emailId WHERE c.customerId = :customerId ")
	  @Modifying
	  @Transactional //delete or update 
	  Integer updateCustomerEmailId(@Param("emailId") String
	  updateCustomerByEmailId, @Param("customerId") Integer customerId);
	  
	 @Query("DELETE FROM Customer c WHERE c.emailId = :emailId")
	  
	  @Modifying
	 
	  @Transactional Integer deleteCustomerByEmailId(@Param("emailId") String
	  emailId);
	 
}