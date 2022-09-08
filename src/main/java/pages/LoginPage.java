package pages;

import java.awt.Robot;
import java.awt.AWTException;

import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.TestBase;

public class LoginPage extends TestBase {
	
			WebDriver driver;
		public LoginPage(WebDriver driver) {
	
			this.driver= driver;
			PageFactory.initElements(driver, this);
		}
		@FindBy(xpath= "//input[@name='mobile']")
		private WebElement textboxMobileNumber;
		
		@FindBy(xpath ="//ion-button[@class=\'login-btn hydrated md button button-block button-solid ion-activatable ion-focusable\']")
		private WebElement buttonSubmit;
		
//		@FindBy(xpath ="//input[@name=\"otpInput1\"]")
//		private WebElement textboxPin1;
//		
//		@FindBy(xpath ="//input[@name=\"otpInput2\"]")
//		private WebElement textboxPin2;
//		
//		@FindBy(xpath ="//input[@name=\"otpInput3\"]")
//		private WebElement textboxPin3;
//		
//		@FindBy(xpath ="//input[@name=\"otpInput4\"]")
//		private WebElement textboxPin4;
		
////		
//		@FindBy(id="lnk_submitaccesspin")
//		private WebElement buttonSubmitPin;
		
//		Robot r = new Robot();
//		  
//		  r.keyPress(KeyEvent.VK_5);
//		  r.keyRelease(KeyEvent.VK_5);
//		  
//		  Thread.sleep(1000);
//		  
//		  r.keyPress(KeyEvent.VK_9);
//		  r.keyRelease(KeyEvent.VK_9);
//		  
//		  Thread.sleep(1000);
//		  
//		  r.keyPress(KeyEvent.VK_4);
//		  r.keyRelease(KeyEvent.VK_4);
//
//		  Thread.sleep(1000);
//		  
//		  r.keyPress(KeyEvent.VK_6);
//		  r.keyRelease(KeyEvent.VK_6);
//		  
//		  r.keyPress(KeyEvent.VK_CONTROL);
//		  r.keyPress(KeyEvent.VK_SUBTRACT);
//		  
//		  r.keyRelease(KeyEvent.VK_SUBTRACT);
//		  r.keyPress(KeyEvent.VK_SUBTRACT);
//		  
//		  r.keyRelease(KeyEvent.VK_SUBTRACT);
//		  r.keyRelease(KeyEvent.VK_CONTROL);
//		  
//		  Thread.sleep(2000);
//		  
//		  r.keyPress(KeyEvent.VK_TAB);
//		  r.keyRelease(KeyEvent.VK_TAB);
//		  
//		  r.keyPress(KeyEvent.VK_TAB);
//		  r.keyRelease(KeyEvent.VK_TAB);
//		  
//		  r.keyPress(KeyEvent.VK_ENTER);
//		  r.keyRelease(KeyEvent.VK_ENTER);
//		  
		public void entersdata_In_MobileNumber() throws InterruptedException {
			Thread.sleep(2000);
			textboxMobileNumber.sendKeys("8111111111");
		}
		
		public void clickSubmit() throws InterruptedException {
			Thread.sleep(2000);
			buttonSubmit.click();
		}
		
		public void entersdata_In_Pin() throws InterruptedException, AWTException {
			Thread.sleep(2000);
//			textboxPin1.click();
//			Thread.sleep(2000);
//			textboxPin1.sendKeys("5");
//			textboxPin2.click();
//			Thread.sleep(2000);
//			textboxPin2.sendKeys("9");
//			textboxPin3.click();
//			Thread.sleep(2000);
//			textboxPin3.sendKeys("4");
//			textboxPin4.click();
//			Thread.sleep(2000);
//			textboxPin4.sendKeys("6");
			Robot r = new Robot();
			Thread.sleep(5000);
			  r.keyPress(KeyEvent.VK_5);
			  r.keyRelease(KeyEvent.VK_5);
			  
			  Thread.sleep(1000);
			  
			  r.keyPress(KeyEvent.VK_9);
			  r.keyRelease(KeyEvent.VK_9);
			  
			  Thread.sleep(1000);
			  
			  r.keyPress(KeyEvent.VK_4);
			  r.keyRelease(KeyEvent.VK_4);

			  Thread.sleep(1000);
			  
			  r.keyPress(KeyEvent.VK_6);
			  r.keyRelease(KeyEvent.VK_6);
			  
			  r.keyPress(KeyEvent.VK_CONTROL);
			  r.keyPress(KeyEvent.VK_SUBTRACT);
			  
			  r.keyRelease(KeyEvent.VK_SUBTRACT);
			  r.keyPress(KeyEvent.VK_SUBTRACT);
			  
			  r.keyRelease(KeyEvent.VK_SUBTRACT);
			  r.keyRelease(KeyEvent.VK_CONTROL);
			  
			  Thread.sleep(2000);
			  
			  r.keyPress(KeyEvent.VK_TAB);
			  r.keyRelease(KeyEvent.VK_TAB);
			  
			  r.keyPress(KeyEvent.VK_TAB);
			  r.keyRelease(KeyEvent.VK_TAB);
			  
			  r.keyPress(KeyEvent.VK_ENTER);
			  r.keyRelease(KeyEvent.VK_ENTER);
		}
//		public void clickSubmitPin() {
//			buttonSubmitPin.click();
		}
		

