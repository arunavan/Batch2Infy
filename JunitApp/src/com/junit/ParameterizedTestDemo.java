package com.junit;
import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ParameterizedTestDemo {
	@ParameterizedTest
	@ValueSource(strings = { "Hello", "JUnit" })
	void withValueSource(String word) {
		Assertions.assertNull(word);
		Assertions.
	}
}
