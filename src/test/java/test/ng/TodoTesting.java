package test.ng;
import java.awt.AWTException;
import java.awt.List;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.pages.Todo;
import org.test.BaseClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TodoTesting extends BaseClass{
	
	@BeforeClass
	private void beforeClass() {
		browserLaunch("Chrome");
		launchUrl("http://todomvc.com/examples/angularjs/#/");
		implicityWait(10);
		maximize();
	}
	@AfterClass
	private void afterClass() {
		quit();
		System.out.println("Done");
	}
	@BeforeMethod
	private void beforeMethod() {
		java.util.Date d=new java.util.Date();
		System.out.println("Before Date "+d);
	}
	@AfterMethod
	private void afterMethod() {
		java.util.Date d=new java.util.Date();
		System.out.println("After Date "+d);
	}
	@Test
	private void test1() throws AWTException, InterruptedException {
		SoftAssert s=new SoftAssert();
		Robot r=new Robot();
		Todo t=new Todo();
		launchUrl("http://todomvc.com/examples/angularjs/#/");
		sendKeys(t.getListBox(), "Hi");
		s.assertTrue(t.getListBox().isEnabled(),"Textbox enable");
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		sendKeys(t.getListBox(), "Hello");
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		sendKeys(t.getListBox(), "Whats up");
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		s.assertNotEquals(t.getTextAddedornot(), "Hi","Text added or not");
		click(t.getCompleted1());
		s.assertNotEquals(getText(t.getCompleted1()), "completed or not");
		click(t.getDeleted());
		s.assertNotEquals(getText(t.getDeleted()), "Null","deleted or not");
		
		click(t.getCompleted2());
		Thread.sleep(2000);
		click(t.getCompletedbtn());
//		s.assert
		click(t.getActivebtn());
		Thread.sleep(3000);
//		getText(t.getActivetext());
//		Thread.sleep(3000);
		s.assertAll();
		
	}

}
