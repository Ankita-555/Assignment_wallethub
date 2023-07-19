package walletHub_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Login_Test extends Base_Test{
	
	@Test(priority =6)
	public void login()
	{
		lp.logintopage();
		WebElement reviewFeed = driver.findElement(By.xpath("//*[@class=\"rvtab-citem rvtab-item-user ng-enter-element\"]//div[5]"));
		String reviewtext = reviewFeed.getText();
		
		Assert.assertTrue(reviewtext.contains("private health plan"), "Review is not showing in review page, Failing Test!");
		System.out.println("Posted review is showing in review page, Test case pass!");
	}

}
