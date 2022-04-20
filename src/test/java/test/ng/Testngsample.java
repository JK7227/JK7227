package test.ng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testngsample {
	@BeforeClass
	private void beforeClass() {
	System.out.println("Before class");
	}
	@AfterClass
	private void afterClass() {
	System.out.println("After class");
	}
	@BeforeMethod
	private void beforeMethods() {
		System.out.println("Before Method");
	}
	@AfterMethod
	private void afterMethods() {
		System.out.println("After Method");
	}
	@Test
	private void test1() {
	System.out.println("test1");
	}
	@Test
	private void test2() {
	System.out.println("test2");

	}

	
}
