package com.testNG.sel;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationsInTNG {    
	@Test                            ///***Totel Annotations in TestNG
	public void testCase1() {
		System.out.println("Test case 1");	}
	@Test	
	public void testCase2() {
		System.out.println("Test case 1");	}	
	@Test
	public void testCase3() {
		System.out.println("Test case 1");	}
	
	@BeforeMethod
	public void beforeMtd() {
		System.out.println("before method");	}
	
	@AfterMethod
	public void aftereMtd() {
		System.out.println("after method");	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("before Class");	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("after class");	}
	
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("before test");	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("after Test");	}
	
	@BeforeSuite
	public void beforesuite() {
		System.out.println("Before Suite");	}
	@AfterSuite
	public void afterSuite() {
		System.out.println("after Suite");	}

}
