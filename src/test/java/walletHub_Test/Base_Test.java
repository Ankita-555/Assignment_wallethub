package walletHub_Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;
import wallet_Hub.Login_Page;
import wallet_Hub.SignUp_Page;
import wallet_Hub.Submit_Page;
import wallet_Hub.TestInsurance_Page;



public class Base_Test {
	
	public static WebDriver driver;
	String path;
	FileInputStream fis;
	Properties prop;
	SignUp_Page sp;
	TestInsurance_Page tp;
	Submit_Page sb;
	Login_Page lp;

	
	@BeforeSuite
	public void initBrowser() throws IOException {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--disabled-notification");
		options.addArguments("--start-maximized");
		options.addArguments("--incognito");
		
		driver = new ChromeDriver(options);
		
		path = System.getProperty("user.dir")+"//config.properties";
		fis = new FileInputStream(path);
		prop = new Properties();
		prop.load(fis);
		driver.get(prop.getProperty("testsiteurl"));
		driver.get(prop.getProperty("testurl"));
	}
	
	@BeforeClass
	public void createobject() throws IOException {
		
		sp = new SignUp_Page(driver);
		tp = new TestInsurance_Page(driver);
		sb = new Submit_Page(driver);
		lp = new Login_Page(driver);
	 
		
	}
	
	@AfterSuite
	public void tearDown() {
		
		driver.quit();
	}

}
