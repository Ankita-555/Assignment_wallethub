package walletHub_Test;

import org.testng.annotations.Test;

public class Submit_Test extends Base_Test {
	
	@Test(priority = 3)
	public void clickOnStar5() {
		
		sb.fifthstar();
	}

	@Test(priority = 4)
	public void dropDown() {
		sb.handleDropDown();
	}
	
	@Test(priority =5)
	public void review() {
		sb.writereview();
		
	}
}

