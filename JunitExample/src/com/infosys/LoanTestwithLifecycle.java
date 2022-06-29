package com.infosys;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LoanTestwithLifecycle {
	Loan l;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println(" Test life cyle starts");
		//db, file
		
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println(" Test case closed");
		//db.close();
	}

	@BeforeEach
	void setUp() throws Exception {
		 l=new Loan();
	}

	@AfterEach
	void tearDown() throws Exception {
		l=null;
	}

	@Test
	void testGetEmi() {
		assertEquals(5000.00,l.getEmi(60000.00));
	}

	@Test
	void testMsg() {
		assertEquals("welcome InfyUser",l.msg());
	}

	@Test
	void testGetObject() {
		assertNull(l.getObject());
	}

}
