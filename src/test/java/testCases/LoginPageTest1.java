package testCases;

import java.awt.AWTException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import base.TestBase;
import pages.OTP;

public class LoginPageTest1 extends TestBase 
{
	@Test
	public void LoginOtpCheck() throws InterruptedException, AWTException
	{
		OTP otp = new OTP(driver);
		otp.entersdata_In_MobileNumber();
		otp.clickSubmit();
		otp.entersdata_In_Pin();
		otp.JavaScript();
		otp.Login();
	}

}
