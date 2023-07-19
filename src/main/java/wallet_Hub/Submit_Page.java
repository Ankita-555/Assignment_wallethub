package wallet_Hub;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Submit_Page  {
	
	WebDriver driver;
	Actions act;
	JavascriptExecutor js;
	WebDriverWait wait;
	
	@FindBy(xpath="((//div[@class=\"flex-box-rv\"]//review-star//div//*[local-name()='svg'])[5]")
	private WebElement star5;
	
	@FindBy(xpath = "(//span[@class='dropdown-placeholder'])[2]")
	private WebElement listbox;
	
	@FindBy (xpath = "//li[text()='Health Insurance']")
	private WebElement health;
	
	@FindBy(xpath="//*[@class='textarea wrev-user-input validate']")
	private WebElement review;
	
	@FindBy(xpath="//div[text()=' Submit ']")
	private WebElement submit;
	
	
	public Submit_Page(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	    js = (JavascriptExecutor)driver;
		act = new Actions(driver);
		wait = new WebDriverWait(driver, 30);
	}
	
	public void fifthstar() {
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class=\"flex-box-rv\"]//review-star//div//*[local-name()='svg'])[5]"))).click();
	}
	
	public void handleDropDown() {
		
		listbox.click();
		act.sendKeys(health, Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	}
	public void writereview() {
		
		review.sendKeys("if you have a private health plan through your employer or that you buy on your own, you should get a standardized form called the Summary of Benefits and Coverage");
	     
		submit.click();
		
	}
	
	
	
	
	

}
