package testCases;

import java.awt.AWTException;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.TestBase;
import pages.LoginPage;

public class LoginPageTest extends TestBase {
	
	
	@Test
	public void LoginPageNavigationTest() throws InterruptedException, AWTException {
		LoginPage loginpage = new LoginPage(driver);
		loginpage.entersdata_In_MobileNumber();
		loginpage.clickSubmit();
		loginpage.entersdata_In_Pin();
		//loginpage.clickSubmitPin();	
	}

	
//	@Test
//	public void Logout() {
//				}
	
//	@Test
//	public void testcas1() {
//		
//		Assert.fail();
//	}

	
}
