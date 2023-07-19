package wallet_Hub;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUp_Page extends Base_Class {
	
	WebDriver driver;
	
	
	@FindBy(xpath="//input[@name='em']")
	private WebElement email;
	
	@FindBy(xpath="//input[@name='pw1']")
	private WebElement password;
	
	@FindBy(xpath="//input[@name='pw2']")
	private WebElement confirm;
	
	@FindBy(xpath="//*[text()='Get my free credit score & report']")
	private WebElement checkbox;
	
	@FindBy(xpath="//button[@class='btn blue touch-element-cl']")
    private WebElement join;
	
	public SignUp_Page(WebDriver driver) throws IOException{
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
		
	public void signupintopage(){
		
		email.sendKeys(prop.getProperty("email"));
		password.sendKeys(prop.getProperty("password"));
		confirm.sendKeys(prop.getProperty("confirm"));
		checkbox.click();
		join.click();
			
	}
	

}
