package testCases;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import base.TestBase;
import pages.DashBoardPage;

public class ViewEnquiry extends TestBase{

	@Test
	public void View() throws InterruptedException, AWTException
	{
		LoginPageTest1 asd= new LoginPageTest1();
		asd.LoginOtpCheck();
		driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
		DashBoardPage obj = new DashBoardPage(driver);
		obj.TotalEnquries();
		obj.Search();
		
		
	}
}
