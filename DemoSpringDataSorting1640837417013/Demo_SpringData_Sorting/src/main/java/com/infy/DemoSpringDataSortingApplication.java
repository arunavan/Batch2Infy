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
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.infy.dto.TransactionDTO;
import com.infy.service.TransactionService;

@SpringBootApplication
public class DemoSpringDataSortingApplication implements CommandLineRunner {
	
	private static final Log LOGGER = LogFactory.getLog(DemoSpringDataSortingApplication.class);
	
	@Autowired
	TransactionService transactionService;

	@Autowired
	Environment environment;

	public static void main(String[] args) {
		SpringApplication.run(DemoSpringDataSortingApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		getAllTransactions();
		//getAllTransactionsAfterTransactionDate();
		
	}

	public void getAllTransactions() {
		try {
			Sort sort = Sort.by("transactionAmount").descending();
			
			Pageable pageable = PageRequest.of(0, 10,sort);
			
			List<TransactionDTO> transactionDTOs = transactionService.getAllTransaction(pageable);
			transactionDTOs.forEach(LOGGER::info);
		} catch (Exception e) {
			String message = environment.getProperty(e.getMessage(),
					"Some exception occured. Please check log file for more details!!");
			LOGGER.info(message);
		}

	}
	
	
	

	public void getAllTransactionsAfterTransactionDate() {
		try {
			LocalDate transactionDate = LocalDate.of(2000, 1, 29);
			Sort sort = Sort.by("transactionAmount");//.descending();
			Pageable pageable = PageRequest.of(0, 10,sort);
			
			List<TransactionDTO> transactionDTOs = transactionService.getAllTransactionByTransactionDateAfter(transactionDate, pageable);
			transactionDTOs.forEach(LOGGER::info);
			
		} catch (Exception e) {
			String message = environment.getProperty(e.getMessage(),
					"Some exception occured. Please check log file for more details!!");
			LOGGER.info(message);
		}

	}

}
