package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class CheckVersion extends TestBase {

	WebDriver driver;
	@FindBy(xpath="//*[@id=\"branch_manager\"]/app-branch-manager-dashboard/ion-header[1]/ion-toolbar/ion-buttons") private WebElement humbergermenu;
	@FindBy(xpath="//div[@class=\"app-version\"]") private WebElement version;
//	
//	@FindBy(xpath="") private WebElement
//	@FindBy(xpath="") private WebElement
	
	public CheckVersion(WebDriver driver) 
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	public void HumbergerMenu()
	{
		humbergermenu.click();
	}
	
	public void Version()
	{
		String Instance_Name= version.getText();
		System.out.println("Instance_Name: "+Instance_Name);
	}
}
