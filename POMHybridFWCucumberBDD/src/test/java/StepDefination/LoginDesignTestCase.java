package StepDefination;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import PageObjects.LoginPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class LoginDesignTestCase extends BaseClass{
	@Before
	public void setup() throws IOException{
		prop=new Properties();
		FileInputStream configfile=new FileInputStream("config.properties");
		prop.load(configfile);
		String browser=prop.getProperty("browser");
		if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", prop.getProperty("chromepath"));
			driver = new ChromeDriver();
		} else if (browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", prop.getProperty("firefoxpath"));
			driver = new FirefoxDriver();
		} else if (browser.equals("edge")) {
			System.setProperty("webdriver.edge.driver", prop.getProperty("edgepath"));
			driver = new EdgeDriver();
		}
		
	}
	@Given("User Launch Chrome browser")
	public void user_launch_chrome_browser() {
	     loginpage=new LoginPage(driver);
	}

	@When("User opens URL {string}")
	public void user_opens_url(String url) {
	    driver.get(url);
	}

	@When("User enters Email as {string} and Password as {string}")
	public void user_enters_email_as_and_password_as(String email, String password) {
	    loginpage.setUsername(email);
	    loginpage.setPassword(password);
	}

	@When("Click on Login")
	public void click_on_login() throws InterruptedException {
	    loginpage.clickloginbtn();
	    Thread.sleep(1000);
	}

	@When("user can enter url as {string}")
	public void user_can_enter_url_as(String url) {
		driver.get(url);
		driver.manage().window().maximize();
	    
	}

	@Then("Page Title should be {string}")
	public void page_title_should_be(String title) throws InterruptedException {
	    if(driver.getPageSource().contains("Login was unsuccessful")) {
	    	driver.close();
	    	Assert.assertTrue(false);
	    }else {
	    	Assert.assertEquals(title,driver.getTitle());
	    }
	    Thread.sleep(10000);
	}

	@When("User click on Log out link")
	public void user_click_on_log_out_link() {
	    loginpage.clicklogoutbtn();
	}

	@Then("close browser")
	public void close_browser() {
	    driver.quit();
	}



}
