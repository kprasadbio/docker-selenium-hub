package utilities;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReusableActions {
	
	static WebDriver driver=null;
	
	public static WebDriver driver(){
		return driver;
	}
	
	
	public static void launch() throws MalformedURLException{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.newtours.demoaut.com/");
		
//		DesiredCapabilities cap= DesiredCapabilities.chrome(); 
//		cap.setCapability("version", ""); 
//		cap.setCapability("platform", "linux"); 
//		driver=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),cap); 
//		driver.get("http://www.newtours.demoaut.com/");
		
		
	}
	
	public static void teardown(){
		driver.quit();
	}
	
	public static void clickOnALink(WebElement element){
		isElementPresent(element);
		
		element.click();
	}
	
	public static void isElementPresent(WebElement element){
		
		try{
			element.getText();
		}
		catch(ElementNotVisibleException en){
			System.out.println(en.getMessage());
		}
	}
	
	public static void inputData(WebElement element, String data){
		isElementPresent(element);
		
		element.sendKeys(data);
	}

}
