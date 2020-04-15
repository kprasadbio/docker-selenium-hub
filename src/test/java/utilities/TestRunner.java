package utilities;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.vimalselvam.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions (
        features = "features" 
        		,glue = {"stepdefinitions","utilities"} 
        ,plugin = {"com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:target/docker_Seleniums_Hub_report.html"})
//		,plugin= { "pretty",
//                "html:target/cucumber-pretty",
//        "json:target/cucumber.json" })
				/*monochrome = true)*/
public class TestRunner 
{
	@AfterClass
	public static void setup()
	{
		Reporter.loadXMLConfig(new File("src/test/java/extent-config.xml"));
        Reporter.setSystemInfo("user", System.getProperty("user.name"));
        Reporter.setSystemInfo("os", "Windows OS");
        Reporter.setTestRunnerOutput("Sample test runner output message");
// 		ExtentCucumberFormatter.initiateExtentCucumberFormatter();
//
//		 ExtentCucumberFormatter.LoadConfig(new File("C:/Users/lvpkanch/Desktop/eLearning/POM/extent-config.xml"));
	}

}
