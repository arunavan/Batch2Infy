package com.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class VoterValidatorTest2 {
	VoterValidator v=null;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println(" beging of class...");
		//global , one time process , once in the life cycle of test case 
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println(" end of   test case...");
		//once but at the closing of test  case
	}

	@BeforeEach
	void setUp() throws Exception { //intitialize class under test
		System.out.println(" before each  test case...");
		 v=new VoterValidator();
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println(" after each  test case...");
		v=null;
	}

	@Test
	@Tag("a")
	void testGetAge() {  //+ve 
		
	
		assertEquals(20,v.getAge(5));
	}
	@Test
	@Tag("a")
	void testGetAge1() {   //-ve
		
	
		assertEquals(20,v.getAge(50));
	}

	@Test
	@Disabled
	
	void testValidateVoterAge() throws Exception {
		
		assertTrue(v.validateVoterAge(28));
	}

}
