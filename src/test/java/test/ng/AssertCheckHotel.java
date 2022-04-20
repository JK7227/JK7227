package test.ng;
import java.util.Date;
import org.openqa.selenium.WebDriver;
import org.pages.HotelPom;
import org.pages.HotelPom1;
import org.pages.HotelPom2;
import org.test.BaseClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class AssertCheckHotel extends BaseClass{

	static WebDriver driver;
	@BeforeClass
	private static void beforeClass() {
		browserLaunch("Edge");
		launchUrl("http://adactinhotelapp.com/");
		maximize();
		implicityWait(10);
		System.out.println("Start");
	}
	@AfterClass
	private static void afterClass() {
		quit();
		System.out.println("End");
	}
	@BeforeMethod
	private void before() {
		Date d=new Date();
		System.out.println("Before Date "+d);
	}
	@AfterMethod
	private void after() {
		Date d=new Date();
		System.out.println("After Date "+d);
	}
	
	@Test
	private void test1() throws InterruptedException {
		HotelPom h=new HotelPom();
		launchUrl("http://adactinhotelapp.com/");
		Assert.assertTrue(getCurrentUrl().contains("adactin"));
		sendKeys(h.getUsername(), "jothikrishna");
		Assert.assertEquals(getAttribute(h.getUsername()),"jothikrishna","verify username");
		sendKeys(h.getPass(), "Life@heaven");
		Assert.assertEquals(getAttribute(h.getPass()),"Life@heaven","verify password");
		click(h.getLogin());
		Thread.sleep(3000);	
		System.out.println("Test1");
	}
	
	@Test
	private void test2() throws InterruptedException {
		HotelPom1 h1=new HotelPom1();
		selectByIndex(h1.getLocation(), 3);
		Assert.assertFalse(h1.getLocation().isSelected(),"selected or not");
		selectByIndex(h1.getHotel(), 2);
		selectByIndex(h1.getRoom(), 2);
		selectByIndex(h1.getRoomcount(), 1);
		clear(h1.getCheckin());
		sendKeys(h1.getCheckin(), "08/01/2022");
		Assert.assertEquals(getAttribute(h1.getCheckin()), "08/01/2022","verify checkin date" );
		clear(h1.getCheckout());
		sendKeys(h1.getCheckout(), "09/01/2022");
		Assert.assertEquals(getAttribute(h1.getCheckout()), "09/01/2022","verify checkout date" );
		selectByIndex(h1.getAdultsperroom(), 2);
		selectByIndex(h1.getChildperroom(), 0);
		click(h1.getSearch());
		Thread.sleep(3000);
		System.out.println("Done");
	}
	
	@Test
	private void test3() throws InterruptedException {
		HotelPom2 h2=new HotelPom2();
		click(h2.getRadiobtn());
		click(h2.getContinuebtn());
		Thread.sleep(3000);
	}
	
	@Test
	private void test4() {
		HotelPom2 h3=new HotelPom2();
		sendKeys(h3.getFirstname(), "Jothi");
		sendKeys(h3.getLastname(), "Krishna");
		sendKeys(h3.getAddress(), "No.8, TTK nagar");
		sendKeys(h3.getCardnumber(), "1234567890123456");
		selectByIndex(h3.getCardtype(), 3);
		selectByIndex(h3.getExpirymonth(), 2);
		selectByIndex(h3.getExpiryyear(), 5);
		sendKeys(h3.getCvvnumber(), "123");
		click(h3.getBookbtn());

}
}