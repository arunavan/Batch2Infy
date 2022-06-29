package com.infy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class VoterValidatorTest3 {
	VoterValidator v;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("begining of test case class");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("tetsing completed");
		
	}

	@BeforeEach
	void setUp() throws Exception {
		v=new VoterValidator();  //init
		
	}

	@AfterEach
	void tearDown() throws Exception {
		v=null;   //destruction
	}

	@Test
	void testValidateVoterAge() throws Exception{
		assertTrue(v.validateVoterAge(2));
		
		
	}

}
