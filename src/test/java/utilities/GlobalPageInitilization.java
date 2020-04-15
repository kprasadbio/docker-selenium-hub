package utilities;

import org.openqa.selenium.support.PageFactory;

import pages.RegistrationPage;
import pages.LandingPage;

public class GlobalPageInitilization {
	
	public static <T> T initializaePage(Class<T> pageobject){ 
		return PageFactory.initElements(ReusableActions.driver(), pageobject);
	}
	
	public static LandingPage landingPage()
	{
		return initializaePage(LandingPage.class);
	}
	
	public static RegistrationPage registrationPage()
	{
		return initializaePage(RegistrationPage.class);
	}

}
