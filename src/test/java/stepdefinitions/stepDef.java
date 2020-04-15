package stepdefinitions;


import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilities.GlobalPageInitilization;
import utilities.ReusableActions;

public class stepDef 
{
	
	
	@Given("^I am in (.*)$")
	public void i_am_in_automation_page(String pagetitle){ 
	 
		String msg=ReusableActions.driver().getTitle();
			 
		Assert.assertTrue(msg.equalsIgnoreCase(pagetitle));
	
	}

	@When("^I will enter (.*) and (.*) (.*) (.*)$")
	public void i_will_enter_name_and_description(String name,String lastname, String phone, String email){
		GlobalPageInitilization.landingPage().clickOnRegisterLink();
		
		GlobalPageInitilization.registrationPage().inputName(name)
		.inputLastName(lastname)
		.inputPhoneNumb(phone)
		.inputeMail(email);
		
	}

	@Then("^I will click on submit button$")
	public void i_will_click_on_submit_button() throws Throwable { 
	}
}
