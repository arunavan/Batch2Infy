package com.infy;



import java.io.IOException;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class VoterValidatorTest3 {
	@Test
	void testValidateVoterAge() {
		int age = -1;
		VoterValidator voterValidator = new VoterValidator();
		Exception exception = Assertions.assertThrows(IOException.class, () -> voterValidator.validateVoterAge(age));
	//	fail("Not yet implemented");
	}

}
