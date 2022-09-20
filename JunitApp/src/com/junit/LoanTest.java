package com.junit;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
class LoanTest {
	@Test  //testing 
	void testGetEmi() {
		//fail("Not yet implemented");
		Loan l=new Loan();
		int actualResult=l.getEmi(80000);
		int expectedResult=6666;
		assertEquals(expectedResult,actualResult);
	}
}
