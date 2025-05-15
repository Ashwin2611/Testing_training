package StepDefination;

import java.io.FileInputStream;
import org.openqa.selenium.support.ui.Select;
import java.io.IOException;
import java.util.Properties;

import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import PageObjects.CustomerPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class CustomerDesignTestCase extends BaseClass{
	@Before
	public void setup() throws IOException {
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
	@Given("User launch Egde browsere")
	public void user_launch_egde_browsere() {
		customerpage=new CustomerPage(driver);
	}

	@When("User should enter the URL {string}")
	public void user_should_enter_the_url(String url) {
	    driver.get(url);
	}

	@Then("User can view Add new customer page")
	public void user_can_view_add_new_customer_page() {
	    if(driver.getPageSource().contains("Add a new customer")) {
	    	Assert.assertEquals("Add a new customer",customerpage.AddCustomertitle.getText());
	    }
	}

	@When("User enter customer info")
	public void user_enter_customer_info() throws InterruptedException {
		customerpage.loginbtn.click();
		Thread.sleep(3000);
		customerpage.setValue(customerpage.email, "ashwin@gmail.com");
		customerpage.setValue(customerpage.password, "Ashwin123");
		customerpage.setValue(customerpage.firstname, "Ashwin");
		customerpage.setValue(customerpage.lastname, "M");
		customerpage.Gender.click();
		customerpage.setValue(customerpage.companyname, "Ascendion");
		customerpage.tax.click();
		Select vendor=new Select(customerpage.vendor);
		vendor.selectByVisibleText("Vendor 1");
		customerpage.setValue(customerpage.adminComment, "Training");
	}

	@When("click on Save button")
	public void click_on_save_button() {
		customerpage.savebtn.click();
	}

	@Then("User can view confirmation message {string}")
	public void user_can_view_confirmation_message(String string) {
	    if(driver.getPageSource().contains("The new customer has been added successfully.")) {
	    	Assert.assertEquals("The new customer has been added successfully.",customerpage.verifyText);
	    }
	}
}
