package com.automation.tests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;

public class ParameterizedTestJUnit {
	
	@ParameterizedTest
	@ValueSource(ints = {10, 20, 30, 40})
	void verifyPositiveNumbers(int number)
	{
		assertTrue(number > 0);
		System.out.println("Testing number :" + number);
	}

}
