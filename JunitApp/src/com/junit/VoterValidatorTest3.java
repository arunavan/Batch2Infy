package com.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class VoterValidatorTest3 {

	@Test
	void testValidateVoterAge()  throws Exception{
	
		
		VoterValidator v=new VoterValidator();
		
		VoterValidator voterValidator = new VoterValidator();
		Exception exception = Assertions.assertThrows(
				Exception.class, () -> voterValidator.validateVoterAge(-89));
		assertEquals(exception.getMessage(),"Invalid age");
	}
		
	@ParameterizedTest //testing with multiple values 
	@CsvSource(value = {"19, true","20,true","17,false","16,false","15,true"})
	public void validateVoterAgeTestParameter(int age, boolean expected) throws Exception {
		VoterValidator voterValidator = new VoterValidator();
		boolean actual = voterValidator.validateVoterAge(age);
		Assertions.assertEquals(expected, actual);
	}
	
	
	}


