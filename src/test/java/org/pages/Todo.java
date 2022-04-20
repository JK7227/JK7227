package org.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.test.BaseClass;

public class Todo extends BaseClass {
	public Todo() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@ng-model='newTodo']")
	private  WebElement listBox; 
	@FindBy(xpath="//label[@class='ng-binding']")
	private WebElement textAddedornot;
	@FindBy(xpath="(//input[@type='checkbox'])[2]")
	private WebElement completed1;
	@FindBy(xpath="//button[@class='destroy']")
	private WebElement deleted;
	@FindBy(xpath="(//input[@type='checkbox'])[2]")
	private WebElement completed2;
	@FindBy(xpath="//a[text()='Completed']")
	private WebElement completedbtn;
	@FindBy(xpath="//a[text()='Active']")
	private WebElement activebtn;
	@FindBy(xpath="//label[text()='whats up']")
	private WebElement activetext;
	public WebElement getListBox() {
		return listBox;
	}
	public WebElement getTextAddedornot() {
		return textAddedornot;
	}
	public WebElement getCompleted1() {
		return completed1;
	}
	public WebElement getDeleted() {
		return deleted;
	}
	public WebElement getCompleted2() {
		return completed2;
	}
	public WebElement getCompletedbtn() {
		return completedbtn;
	}
	public WebElement getActivebtn() {
		return activebtn;
	}
	public WebElement getActivetext() {
		return activetext;
	}

	}