package wallet_Hub;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page extends Base_Class {
	
	WebDriver driver;
	Actions act;
	
	@FindBy(xpath = "//*[@id=\"join-light\"]/form/div/nav/ul/li[2]/a")
	private WebElement login;
	
	@FindBy(xpath = "//input[@name='em']")
	private WebElement email_id;
	
	@FindBy(xpath = "//input[@name='pw1']")
	private WebElement password;
	
	@FindBy(xpath = "//span[text()='Login']")
	private WebElement loginbtn;
	
	
	
	public Login_Page(WebDriver driver) throws IOException {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		act = new Actions(driver);
		
	}
	
	
	public void logintopage() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		act.moveToElement(login).click().build().perform();
		email_id.sendKeys(prop.getProperty("email"));
		password.sendKeys(prop.getProperty("password"));
		loginbtn.click();
		
	}

}
