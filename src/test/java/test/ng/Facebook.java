package test.ng;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.test.BaseClass;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
//@Listeners(FailedScreenshot.class)
public class Facebook extends BaseClass {
	@BeforeClass
	public static void berforeClass() {
		browserLaunch("Chrome");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@AfterClass
	public static void afterClass() {
		driver.quit();
	}
	@BeforeMethod
	public void before() {
		Date d=new Date();
		System.out.println("Before time "+d);
	}
	@AfterMethod
	public void after(ITestResult r) throws IOException {
		Date d=new Date();
		System.out.println("After time "+d);
		System.out.println(System.getProperty("user.dir"));
//		int status = r.getStatus();
//		if (status==2) {
			String name = r.getName();
			screenshot("Facebook"+name);
//		}
		
	}
	@Test
	public void test1() throws InterruptedException {
		driver.get("https://www.facebook.com");
		WebElement txtusername = driver.findElement(By.id("email"));
		txtusername.sendKeys("Jothikrishna");
		WebElement txtpass = driver.findElement(By.id("pass"));
		txtpass.sendKeys("********");
		WebElement btnlogin = driver.findElement(By.name("login"));
		btnlogin.click();
		System.out.println("test 1");
		Thread.sleep(3000);
	}
	@Test
	public void test2() {
		driver.get("https://www.facebook.com");
		WebElement createbtn = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		createbtn.click();
		WebElement txtfirst = driver.findElement(By.name("firstname"));
		txtfirst.sendKeys("Jothi");
		WebElement txtlast = driver.findElement(By.name("lastname"));
		txtlast.sendKeys("Krishna");
		WebElement btnsignup = driver.findElement(By.name("websubmit"));
		Assert.assertTrue(false);
		btnsignup.click();
			
		System.out.println("test 2");

	}

		
		
		
		
		
			
				
	
	
}
