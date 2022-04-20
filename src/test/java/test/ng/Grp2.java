package test.ng;

import org.testng.annotations.Test;

public class Grp2 {

	@Test(groups= {"regression"})
	private void test5() {
		System.out.println("test5");
		System.out.println(Thread.currentThread().getId());
	}
	@Test(groups= {"retest"})
	private void test6() {
		System.out.println("test6");
		System.out.println(Thread.currentThread().getId());
	}
	@Test(groups= {"smoke","regression"})
	private void test7() {
		System.out.println("test7");
		System.out.println(Thread.currentThread().getId());
	}
	@Test()
	private void test8() {
		System.out.println("test8");
		System.out.println(Thread.currentThread().getId());
	}
}
