package com.automation.tests;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class JunitAssertionsDemo {
	
	@Test
	void VerifyCalculations()
	{
		int actual = 10+20 ; // actual = 30
		assertEquals(30, actual);
		assertNotEquals(20, actual);
		assertTrue(actual>0);
		assertFalse(actual<0);
		assertNotNull(actual);
		
		
		assertAll(() -> assertEquals(30,  actual),
				()-> assertNotEquals(20, actual),
				()-> assertTrue(actual>0),
				()->assertFalse(actual<0),
				()->assertNotNull(actual)
				);
				
		
	}

}
