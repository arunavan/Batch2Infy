package com.infy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class VoterValidatorTest2 {

//	@Test
	@ParameterizedTest
	@CsvSource(value = {"19, true","20,true","17,false","16,false"})
	@Tag("dev")
	void testValidateVoterAge(int age, boolean expected) throws Exception{
		
		
		VoterValidator voterValidator = new VoterValidator();
		boolean actual = voterValidator.validateVoterAge(age);
		Assertions.assertEquals(expected, actual);
		//fail("Not yet implemented");
		
		
	}

}
