package pages;

import java.awt.AWTException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class OTP extends TestBase 
{
	WebDriver driver;
	public OTP(WebDriver driver) 
	{
	this.driver= driver;
	PageFactory.initElements(driver, this);
	}
	@FindBy(xpath= "//input[@name='mobile']")
	private WebElement textboxMobileNumber;

	@FindBy(xpath ="//ion-button[@class=\'login-btn hydrated md button button-block button-solid ion-activatable ion-focusable\']")
	private WebElement buttonSubmit;
	
	@FindBy(xpath="//input[@name=\"otpInput1\"]") 
	private WebElement pin1;
	
	@FindBy(xpath="//input[@name=\"otpInput2\"]") 
	private WebElement pin2;
	
	@FindBy(xpath="//input[@name=\"otpInput3\"]") 
	private WebElement pin3;
	
	@FindBy(xpath="//input[@name=\"otpInput4\"]") 
	private WebElement pin4;
	
	@FindBy(xpath="//ion-button[text()=' Login ']")
	private WebElement login;

	public void entersdata_In_MobileNumber() throws InterruptedException 
	{
		Thread.sleep(2000);
		textboxMobileNumber.sendKeys("8888110829");
	}
	
	public void clickSubmit() throws InterruptedException 
	{
		Thread.sleep(2000);
		buttonSubmit.click();
	}
	public void entersdata_In_Pin() throws InterruptedException, AWTException 
	{
		Thread.sleep(2000);
		pin1.sendKeys("1");
		pin2.sendKeys("1");
		pin3.sendKeys("1");
		pin4.sendKeys("1");
	}
	public void JavaScript()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", pin4);
		//js.executeScript("window.scrollBy(0,document.body.scrollHeight)");

	}
	public void Login() throws InterruptedException
	{
		Thread.sleep(2000);
		login.click();
	}
	
}
