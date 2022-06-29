package com.infy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class VoterValidatorTest {

	/*
	 * @BeforeAll static void setUpBeforeClass() throws Exception { }
	 * 
	 * @AfterAll static void tearDownAfterClass() throws Exception { }
	 * 
	 * @BeforeEach void setUp() throws Exception { }
	 * 
	 * @AfterEach void tearDown() throws Exception { }
	 */

	@Test
	void testValidateVoterAge() throws Exception{
		
		VoterValidator v=new VoterValidator();
		int age=22;
		boolean actualresult=v.validateVoterAge(age);
		//assertEquals(actualresult,true);
		assertTrue(actualresult);
	//	assertFalse();
		
		
		//fail("Not yet implemented");
	}
	
	
	@Test
	void testValidateVoterIvalidAge() throws Exception{
		
		VoterValidator v=new VoterValidator();
		int age=12;
		boolean actualresult=v.validateVoterAge(age);
		
		assertFalse(actualresult);
	
	}
	@Test
	public void validateVoterAgeInvalidTest2() throws Exception {
		int age = 14;
		VoterValidator voterValidator = new VoterValidator();
		Exception exception = Assertions.assertThrows(Exception.class, () -> voterValidator.validateVoterAge(age));
	}
}
