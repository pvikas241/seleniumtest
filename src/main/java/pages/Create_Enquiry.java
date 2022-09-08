package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import base.TestBase;

public class Create_Enquiry extends TestBase 
{
	WebDriver driver;
	
	@FindBy(xpath="//ion-label[text()='Create Enquiry']") 
	   private WebElement createEnquiry;
	
	@FindBy(xpath="//ion-input[@type=\"text\"]") 
	   private WebElement customername;
	
	@FindBy(xpath="//ion-label[text()='Mobile Number ']") 
	   private WebElement mobilenumber;
	
	@FindBy(xpath="//ion-button[text()=' Send OTP ']") 
	   private WebElement sentotp;
	
	@FindBy(xpath="//span[text()='Change Number']") 
	   private WebElement changenumber;
	
	@FindBy(xpath="//ion-text[text()='Resend OTP']") 
	   private WebElement resentotp;
	
	@FindBy(xpath="//ion-button[text()=' Skip ']") 
	   private WebElement skip;
	
	@FindBy(xpath="//ion-button[text()=' Verify OTP ']") 
	   private WebElement verifyotp;
	
	@FindBy(xpath="(//ion-select[@aria-haspopup=\"dialog\"])[2]")
		private WebElement customertype;
	
	@FindBy(xpath="(//ion-select[@aria-haspopup=\"dialog\"])[3]")
	private WebElement enquirytype;
	
	@FindBy(xpath="(//ion-select[@aria-haspopup=\"dialog\"])[4]")
	private WebElement enquirystatus;
	
	@FindBy(xpath="//ion-button[text()='Add Interested Vehicles']")
	private WebElement addvehicles;
	
	@FindBy(xpath="//ion-text[text()='APACHE']")
	private WebElement Apache;
	
	@FindBy(xpath="//ion-text[text()='RADEON']")
	private WebElement Radeon;

	@FindBy(xpath="//ion-text[text()='RR Series']")
	private WebElement RR_series;
	
	@FindBy(xpath="//ion-text[text()='SPORT']")
	private WebElement Sport;
	
	@FindBy(xpath="//ion-text[text()='STAR']")
	private WebElement Star;

	@FindBy(xpath="//ion-text[text()='TVS Raider']")
	private WebElement Raider;
	
	@FindBy(xpath="//ion-text[text()='TVS Ronin']")
	private WebElement Ronin;
	
	@FindBy(xpath="//ion-text[text()='XL 100']")
	private WebElement xl100;
	
	//@FindBy(xpath= )
	
	
	public Create_Enquiry(WebDriver driver) 
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	public void click_create_enquiry() throws InterruptedException 
	{
		Thread.sleep(5000);
		createEnquiry.click();
	}
	
	public void Customer_Name(String Name) throws InterruptedException
	{
		customername.click();
		Thread.sleep(2000);
		customername.sendKeys("Akshay");
	}
	
	public void Mobile_Number(String mobile) throws InterruptedException
	{
		mobilenumber.click();
		Thread.sleep(2000);
		//mobilenumber.sendKeys(mobile);
	}
	
	public void Sent_OTP()
	{
		sentotp.click();
	}
	
	public void Change_Number()
	{
		changenumber.click();
	}
	
	public void Resend_OTP()
	{
		resentotp.click();
	}
	
	public void Skip()
	{
		skip.click();
	}
	
	public void Verify_OTP()
	{
		verifyotp.click();
	}
	
	public void CustomerType()
	{
		Select a = new Select(customername);
		a.selectByVisibleText(" INDIVIDUAL ");
//		a.selectByVisibleText(" AD - INDIRECT ");
//		a.selectByVisibleText(" INSTITUTION ");
//		a.selectByVisibleText(" CSD ");
//		a.selectByVisibleText(" M B O ");
	}
	
	public void EnquiryType()
	{
		Select b = new Select(enquirytype);
		b.selectByVisibleText(" Walk-in ");
//		b.selectByVisibleText(" Outdoor ");
//		b.selectByVisibleText(" Telephone ");
//		b.selectByVisibleText(" Kirana Store & MSME ");
	}
	
	public void EnquirtStatus()
	{
		Select c = new Select(enquirystatus);
		c.selectByVisibleText(" New Enquiry ");
		c.selectByVisibleText(" Enquiry Converted ");
	}

}
	
	
	
	

