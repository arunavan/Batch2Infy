package com.infy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class VoterValidatorTest2 {

	@Test
	void testSum() {
		VoterValidator vv=new VoterValidator();
		int actualValue=vv.sum(4, 5);
		int expectedValue=9;
		assertEquals(expectedValue,actualValue);
		
		//fail("Not yet implemented");
	}

}
