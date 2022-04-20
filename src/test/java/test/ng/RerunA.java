package test.ng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RerunA {
	@Test(retryAnalyzer=WithknownFailed.class)
	private void test1() {
		System.out.println("test1");
		Assert.assertTrue(false);
	}
	@Test(retryAnalyzer=WithknownFailed.class)
	private void test2() {
		System.out.println("test2");
		Assert.assertTrue(false);
		
	}
	@Test()
	private void test3() {
		System.out.println("test3");
	}
	@Test()
	private void test4() {
		System.out.println("test4");

	}
}