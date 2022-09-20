package com.junit;
import org.junit.jupiter.api.RepeatedTest;

public class RepeatingTest {

	@RepeatedTest(5)
	void test() {
		System.out.println("First Test Case .....");
	}

}
