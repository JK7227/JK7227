package test.ng;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
public class AdactinHotel {
	static WebDriver driver;
	@BeforeClass
	public static void beforeClass() {
		WebDriverManager.edgedriver().setup();
		driver =new EdgeDriver();
		driver.get("http://adactinhotelapp.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("Start");
	}
	@AfterClass
	public static void afterClass() {
		driver.quit();
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
	@Test
	public void test1() throws InterruptedException {
		driver.get("http://adactinhotelapp.com/");
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("jothikrishna");
		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys("Life@heaven");
		WebElement login = driver.findElement(By.id("login"));
		login.click();
		Thread.sleep(3000);	
		System.out.println("Test1");
	}
	static Select s;
	@Test
	public void test2() {
		driver.get("http://adactinhotelapp.com/SearchHotel.php");
		WebElement location = driver.findElement(By.id("location"));
		s=new Select(location);
		s.selectByIndex(3);
		WebElement hotel = driver.findElement(By.id("hotels"));
		s=new Select(hotel);
		s.selectByIndex(2);
		WebElement room = driver.findElement(By.id("room_type"));
		s=new Select(room);
		s.selectByIndex(2);
		WebElement roomcount = driver.findElement(By.id("room_nos"));
		s=new Select(roomcount);
		s.selectByIndex(1);
		WebElement checkin = driver.findElement(By.id("datepick_in"));
		checkin.sendKeys("09/01/2022");
		WebElement checkout = driver.findElement(By.id("datepick_out"));
		checkout.sendKeys("10/01/2022");
		WebElement adultsperroom = driver.findElement(By.id("adult_room"));
		s=new Select(adultsperroom);
		s.selectByIndex(2);
		WebElement childperroom = driver.findElement(By.id("child_room"));
		s=new Select(childperroom);
		s.selectByIndex(0);
		WebElement searchbtn = driver.findElement(By.id("Submit"));
		searchbtn.click();
		System.out.println("Done");
	}
	@Test
	public void test3() throws InterruptedException {
	//	driver.get("http://adactinhotelapp.com/SearchHotel.php");
		WebElement btnradio = driver.findElement(By.id("radiobutton_0"));
		btnradio.click();
		WebElement btnclick = driver.findElement(By.id("continue"));
		btnclick.click();
		Thread.sleep(3000);
		System.out.println("test3");
	}
	static Select s1;
	@Test
	public void test4() throws InterruptedException {
		WebElement firstname = driver.findElement(By.id("first_name"));
		firstname.sendKeys("jothi");
		WebElement lastname = driver.findElement(By.id("last_name"));
		lastname.sendKeys("krishna");
		WebElement address = driver.findElement(By.id("address"));
		address.sendKeys("No.8,ttk nagar, bavani st, chennai-45");
		WebElement cardnumber = driver.findElement(By.id("cc_num"));
		cardnumber.sendKeys("1234567890123456");
		WebElement cardtype = driver.findElement(By.id("cc_type"));
		s1=new Select(cardtype);
		s1.selectByIndex(2);
		WebElement expirymonth = driver.findElement(By.id("cc_exp_month"));
		s1=new Select(expirymonth);
		s1.selectByIndex(3);
		WebElement expiryyear = driver.findElement(By.id("cc_exp_year"));
		s1=new Select(expiryyear);
		s1.selectByIndex(4);
		WebElement cvv = driver.findElement(By.id("cc_cvv"));
		cvv.sendKeys("123");
		WebElement btnbook = driver.findElement(By.id("book_now"));
		btnbook.click();
		Thread.sleep(3000);
		WebElement orderno = driver.findElement(By.id("order_no"));
		String text = orderno.getAttribute("value");
		System.out.println(text);
		System.out.println("test4");

	}

	
	
}
