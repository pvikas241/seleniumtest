package testCases;

import java.awt.AWTException;

import org.testng.annotations.Test;

import base.TestBase;
import pages.Create_Enquiry;
import pages.OTP;

public class CreateEnquiryProcess extends TestBase {

	@Test
	public void LoginOtpCheck() throws InterruptedException, AWTException
	{
		OTP otp = new OTP(driver);
		otp.entersdata_In_MobileNumber();
		otp.clickSubmit();
		otp.entersdata_In_Pin();
		otp.JavaScript();
		otp.Login();
		Create_Enquiry create= new Create_Enquiry(driver);
		create.click_create_enquiry();
		String CName= "Akshay";
		create.Customer_Name(CName);
		String Mobile = "9876543210";
//		create.Mobile_Number(Mobile);
//		create.Sent_OTP();
//		create.Skip();
	}
	@Test
	public void WrongCr()
	{
		
	}
}
