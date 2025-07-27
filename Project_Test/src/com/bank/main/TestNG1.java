package com.bank.main;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG1 {
	
	//To skip Test Case
	@Test(enabled = true)
	public void a1() {
		System.out.println("Welcome to TestNG");
	}
	
	//To run n no of times
		@Test(invocationCount = 2,priority=-10)
		public void a6() {
			System.out.println("Welcome to TestNG1");
		}
	
	/*@BeforeClass
	//public void a2() {
		System.out.println("Hello A2");
	}
	
	@AfterClass
	public void a4() {
		System.out.println(" Hello A4");
	}

	@BeforeMethod
	public void a3() {
		System.out.println("Hello A3");
	}*/
	
	
}
