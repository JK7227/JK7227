package test.ng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AdactinDatas {
	
	@Test(dataProvider="login")
	private void test1(String name, String pass) {
		System.out.println("test1");
		System.out.println(name);
		System.out.println(pass);
	}
	@Test(dataProvider="selection page 1")
	private void test2(String datein, String dateout) {
		System.out.println("test2");
		System.out.println(datein);
		System.out.println(dateout);
	}
	@Test
	private void test3() {
		System.out.println("test3");
	}
	@DataProvider(name="login")
	private Object[][] login() {
		Object[][] obj=new Object[][] {
			{"jothikrishna","Life@heaven"},
		    {"krishna","Life#heaven"},
	//	    {"jothikrishna","Life@heaven"}
			{"jk","Life*heaven"}
		};
		return obj;
	}
	@DataProvider(name="selection page 1")
	private Object[][]selectionPage1() {
		Object[][] obj1=new Object[][] { 
			{"15/02/2022","16/02/2022"},
			{"19/02/2022","20/02/2022"}
		};
		return obj1;
	

	}

}
