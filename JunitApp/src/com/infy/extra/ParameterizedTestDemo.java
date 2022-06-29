package com.infy.extra;

import static org.junit.Assert.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ParameterizedTestDemo {
//	@ParameterizedTest
//	@ValueSource(strings = { "Hello", "JUnit" ,"java1","infos"})
	void withValueSource(String word) {
		assertEquals(5,"javas".length());
	}
}
