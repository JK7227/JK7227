package test.ng;
import java.util.Date;
import org.openqa.selenium.WebDriver;
import org.pages.HotelPom;
import org.pages.HotelPom1;
import org.pages.HotelPom2;
import org.test.BaseClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class AdactinHotelBase extends BaseClass{
	static WebDriver driver;
	@BeforeClass
	public static void beforeClass() {
		browserLaunch("Chrome");
		launchUrl("http://adactinhotelapp.com/");
		maximize();
		implicityWait(10);
		System.out.println("Start");
	}
	@AfterClass
	public static void afterClass() {
		quit();
		System.out.println("End");
	}
	@BeforeMethod
	public void before() {
		Date d=new Date();
		System.out.println("Before Date "+d);
	}
	@AfterMethod
	public void after() {
		Date d=new Date();
		System.out.println("After Date "+d);
	}
//	@Parameters({"username","password"})
	@SuppressWarnings("static-access")
	@Test(dataProvider="login",dataProviderClass=AdactinDatas.class)
	public void test1(String name, String pass) throws InterruptedException {
		HotelPom h=new HotelPom();
		launchUrl("http://adactinhotelapp.com/");
		sendKeys(h.getUsername(), name);
		sendKeys(h.getPass(), pass);
		click(h.getLogin());
		Thread.sleep(3000);	
		System.out.println("Test1");
	}
//	@Parameters({"checkin","checkout"})
	@SuppressWarnings("static-access")
	@Test(dataProvider="selection page 1",dataProviderClass=AdactinDatas.class)
	public void test2(String datein, String dateout) throws InterruptedException {
		HotelPom1 h1=new HotelPom1();
		launchUrl("https://adactinhotelapp.com/SearchHotel.php");
		selectByIndex(h1.getLocation(), 3);
		selectByIndex(h1.getHotel(), 2);
		selectByIndex(h1.getRoom(), 2);
		selectByIndex(h1.getRoomcount(), 1);
		clear(h1.getCheckin());
		sendKeys(h1.getCheckin(), datein);
		clear(h1.getCheckout());
		sendKeys(h1.getCheckout(), dateout);
		selectByIndex(h1.getAdultsperroom(), 2);
		selectByIndex(h1.getChildperroom(), 0);
		Thread.sleep(300);
		click(h1.getSearch());
		Thread.sleep(3000);
		System.out.println("test2");
	}
	@SuppressWarnings("static-access")
	@Test
	public void test3() throws InterruptedException {
		HotelPom2 h2=new HotelPom2();
		click(h2.getRadiobtn());
		click(h2.getContinuebtn());
		System.out.println("test3");
		Thread.sleep(3000);
	}
//	@Parameters({"firstname","lastname","address","cardnumber","cvv"})
	@SuppressWarnings("static-access")
	@Test
	public void test4(String one,String two,String three,String four,String five ) {
		HotelPom2 h3=new HotelPom2();
		sendKeys(h3.getFirstname(), one);
		sendKeys(h3.getLastname(), two);
		sendKeys(h3.getAddress(), three);
		sendKeys(h3.getCardnumber(), four);
		selectByIndex(h3.getCardtype(), 3);
		selectByIndex(h3.getExpirymonth(), 2);
		selectByIndex(h3.getExpiryyear(), 5);
		sendKeys(h3.getCvvnumber(), five);
		click(h3.getBookbtn());
		System.out.println("Order no "+getAttribute(h3.getorderno()));
		System.out.println("test4");

}
}