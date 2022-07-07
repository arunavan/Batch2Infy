package com.infy.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.infy.entity.Transaction;

//CRUDRepo - CRUD,Query  JpaRepo- CRUD,Query,Paging and Sorting 
public interface TransactionRepository extends JpaRepository<Transaction, Integer>{
	public List<Transaction> findByTransactionDateAfter(LocalDate transactionDate, Pageable pageable);
}
