package com.infy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class VoterValidatorTest5 {
	VoterValidator vv;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Before test cases");
	}
	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("After all test cases");
	}
	@BeforeEach
	void setUp() throws Exception {
		 vv=new VoterValidator();  //init
		 //...
	}
	@AfterEach
	void tearDown() throws Exception {
		vv=null;         //destruction
	}
	@Test
	void testValidateVoterAge() throws Exception{
		assertTrue(vv.validateVoterAge(20));
		//fail("Not yet implemented");
	}
	@Test
	void testSum() {
		assertNotEquals(12,vv.sum(6, 4));
		//fail("Not yet implemented");
	}
	@Test
	void testGteEmi() {
		assertEquals(500,vv.gteEmi(5000));
		//fail("Not yet implemented");
	}
	

}
