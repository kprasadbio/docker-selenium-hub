package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilities.ReusableActions;

public class RegistrationPage {
	
	@FindBy(xpath="//input[@name='firstName']")
	WebElement txt_FirstName;
	
	@FindBy(xpath="//input[@name='lastName']")
	WebElement txt_LastName;
	
	@FindBy(xpath="//input[@name='phone']")
	WebElement txt_Phone;
	
	@FindBy(xpath="//input[@name='userName']")
	WebElement txt_eMail;
	
	@FindBy(xpath="//input[@type='image']")
	WebElement btn_Submit;
	
	
	public RegistrationPage inputName(String data){
		ReusableActions.inputData(txt_FirstName, data);
		return this;
	}
	
	public RegistrationPage inputLastName(String data){
		ReusableActions.inputData(txt_LastName, data);
		return this;
	}
	
	public RegistrationPage inputPhoneNumb(String data){
		ReusableActions.inputData(txt_Phone, data);
		return this;
	}
	
	public RegistrationPage inputeMail(String data){
		ReusableActions.inputData(txt_eMail, data);
		return this;
	}
	
	public RegistrationPage submit(){
		btn_Submit.click();
		return this;
	}

}
