package StepDefination;

import java.util.Properties;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.WebDriver;

import PageObjects.CustomerPage;
import PageObjects.LoginPage;


public class BaseClass {

	public WebDriver driver;
	public Properties prop;
	public LoginPage loginpage;
	public CustomerPage customerpage; 
	
	public static String randomestring() {
		String generatedString1 = RandomStringUtils.randomAlphabetic(5);
		return (generatedString1);
	}

}
