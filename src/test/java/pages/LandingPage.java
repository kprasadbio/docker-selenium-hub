package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilities.ReusableActions;

public class LandingPage {
	
	@FindBy(linkText="REGISTER")
	WebElement lnk_register;
	
	
	public void clickOnRegisterLink(){
		ReusableActions.clickOnALink(lnk_register);
	}

}
