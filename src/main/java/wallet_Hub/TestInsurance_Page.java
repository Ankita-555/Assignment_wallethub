package wallet_Hub;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestInsurance_Page {
	
	WebDriver driver;
	Actions act;
	
	@FindBy(xpath="(//*[@class='rvs-svg']//div//*[local-name()='svg'])[4]")
	private WebElement star4;
	
	
	public TestInsurance_Page(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		act = new Actions(driver);
	}
	
	public void reviewpage() {
		act.moveToElement(star4).click().build().perform();

	}
	
	
	

}