package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class DashBoardPage 
{
	WebDriver driver;
	
	@FindBy(xpath="//ion-buttons[@slot=\"start\"]") 
	private WebElement humbergerMenu;
	
	@FindBy(xpath="//ion-label[text()='Total Enquiries']") 
	private WebElement totalenquiries;
	
	@FindBy(xpath="//ion-label[text()='Not Followed Up Enquiries']") 
	private WebElement notfollowedupenquiries;
	
	@FindBy(xpath="//ion-label[text()=' Followed Up Enquiries ']") 
	private WebElement followedupenquiries;
	
	@FindBy(xpath="//ion-label[text()='Converted Enquiries']") 
	private WebElement convertedenquiries;
	
	@FindBy(xpath="//ion-label[text()='Postponed Enquiries']") 
	private WebElement postponedenquiries;
	
	@FindBy(xpath="//ion-label[text()='Leaked & Lost Enquiries']") 
	private WebElement leakedlostenquiries;
	
	@FindBy(xpath="//ion-label[text()='Locate Enquiry']") 
	private WebElement locateenquiry;
	
	@FindBy(xpath="//ion-label[text()='Create Enquiry']") 
	private WebElement createenquiry;
	
	@FindBy(xpath="//div/ion-label/span[text()='Today’s Tasks']") 
	private WebElement todaystasks;
	
	@FindBy(xpath="//div/ion-label/span[text()='Missed Tasks']") 
	private WebElement missedtasks;
	
	@FindBy(xpath="//ion-icon[@src=\"assets/images/filter.svg\"]") 
	private WebElement filter;
	
	@FindBy(xpath="//ion-select[@role=\"combobox\"]") 
	private WebElement user;
	
	@FindBy(xpath="//div[@class=\"duration-filter\"]") 
	private WebElement durationfilter;
	
	@FindBy(xpath="//ion-button[text()=' Cancel ']") 
	private WebElement cancelbutton;
	
	@FindBy(xpath="//ion-button[text()=' Apply ']") 
	private WebElement applybutton;
	
	@FindBy(xpath="//input[@inputmode=\"search\"]")
	private WebElement searchnamenum;
	
	public DashBoardPage(WebDriver driver) 
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void HumbergerMenu()
	{
		humbergerMenu.click();
	}
	
	public void TotalEnquries()
	{
		totalenquiries.click();
	}
	
	public void NotFollowedUpEnquiries()
	{
		notfollowedupenquiries.click();
	}
	
	public void FollowedUpEnquiries()
	{
		followedupenquiries.click();
	}
	
	public void ConvertedEnquiries()
	{
		convertedenquiries.click();
	}
	
	public void PostponedEnquiries()
	{
		postponedenquiries.click();
	}
	
	public void LeakedLostEnquiries()
	{
		leakedlostenquiries.click();
	}
	
	public void LocateEnquiry()
	{
		locateenquiry.click();
	}
	
	public void CreateEnquiry()
	{
		createenquiry.click();
	}
	
	public void TodaysTasks()
	{
		todaystasks.click();
	}
	
	public void Missedtasks()
	{
		missedtasks.click();
	}
	
	public void Filter()
	{
		filter.click();
	}
	
	public void User()
	{
		user.click();
	}
	
	public void DurationFilter()
	{
		durationfilter.click();
	}
	
	public void CancelButton()
	{
		cancelbutton.click();
	}
	
	public void ApplyButton()
	{
		applybutton.click();
	}
	public void Search() 
	{
		searchnamenum.sendKeys("Akshay");
	}
}
