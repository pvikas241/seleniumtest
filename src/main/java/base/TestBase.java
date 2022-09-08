package base;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import contants.AppConstant;
import utility.PropertiesReader;

public class TestBase {
public static WebDriver driver;


	@BeforeMethod
	public void initalizeDriver() throws InterruptedException, IOException {
	
		String browername = PropertiesReader.getValue("browser");
		System.out.println(browername);
		
		if(browername.equalsIgnoreCase("chrome")) {
			//System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\drivers\\chromedriver.exe");
			
		System.setProperty("webdriver.chrome.driver", AppConstant.getChromePath());
			driver = new ChromeDriver();
		}
		
		else if (browername.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		else if (browername.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", System.getProperty("user.dir") + "\\drivers\\msedgedriver.exe");
			driver = new EdgeDriver();
		}
		
	driver.manage().window().maximize();
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("start-maximized");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	//driver.manage().timeouts().pageLoadTimeout(5,TimeUnit.SECONDS);
	driver.manage().deleteAllCookies();
	driver.get(PropertiesReader.getValue("application.url"));

	}
	
//	@AfterMethod
//	public void teardown() throws InterruptedException {
//		Thread.sleep(8000);
//		driver.quit();
//	}
}
