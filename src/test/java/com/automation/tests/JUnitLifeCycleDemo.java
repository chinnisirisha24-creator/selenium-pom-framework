package com.automation.tests;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.DisplayName;

public class JUnitLifeCycleDemo {
		
		@BeforeAll
		public static void beforeAll()
		{
			System.out.println("Before all tests");
		}
		
		@BeforeEach
		void beforeEach()
		{
			System.out.println("Before each test");
		}
		
		@Test
		@DisplayName("Verify login functionality")
		void loginTest()
		{
			System.out.println("Executing login test");
		}
		
		@Test
		@DisplayName("Verify search functionality")
		 void SearchTest()
		{
			System.out.println("Executing search test");
		}
		
		@AfterEach
		void afterEach()
		{
			System.out.println("After Each Test");
		}
		
		@AfterAll
		public static void afterAll()
		{
			System.out.println("After All Test");
		}


		
	}


