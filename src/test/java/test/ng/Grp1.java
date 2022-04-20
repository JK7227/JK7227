package test.ng;

import org.testng.annotations.Test;

public class Grp1 {
	@Test(groups= {"smoke","regression"})
	private void test1() {
		System.out.println("test1");
		System.out.println(Thread.currentThread().getId());
	}
	@Test(groups= {"regression"})
	private void test2() {
		System.out.println("test2");
		System.out.println(Thread.currentThread().getId());
	}
	@Test(groups= {"sanity"})
	private void test3() {
		System.out.println("test3");
		System.out.println(Thread.currentThread().getId());
	}
	@Test(groups= {"retest","regression"})
	private void test4() {
		System.out.println("test4");
		System.out.println(Thread.currentThread().getId());
	}
}
