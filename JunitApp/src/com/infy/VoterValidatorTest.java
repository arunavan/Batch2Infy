package com.infy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class VoterValidatorTest {
     @Tag("abc")
	@Test
	void testValidateVoterAge() throws Exception {
		
		VoterValidator vv=new VoterValidator();
		boolean result=vv.validateVoterAge(25);
	    assertTrue(result);
		
		//fail("Not yet implemented");
	}
	@Test
	void testProduct() {
		assertEquals(13,2*5);
	}
	
}
