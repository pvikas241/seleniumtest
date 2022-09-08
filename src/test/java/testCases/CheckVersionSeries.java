package testCases;

import java.awt.AWTException;

import org.testng.annotations.Test;

import base.TestBase;
import pages.CheckVersion;

public class CheckVersionSeries extends TestBase{

	@Test
	public void checkVersionName() throws InterruptedException, AWTException
	{
		LoginPageTest1 asd= new LoginPageTest1();
		asd.LoginOtpCheck();
		CheckVersion version = new CheckVersion(driver);
		version.HumbergerMenu();
		version.Version();
	}
}
