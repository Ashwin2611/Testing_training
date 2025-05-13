package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.*;
import junit.framework.Assert;

public class DesignTestCase {
	WebDriver driver;
	@Given("User should launch Chome Browser")
	public void user_should_launch_chome_browser() {
	    System.setProperty("webdriver.edge.driver", "C:\\Users\\ashwin.murugan\\eclipse-workspace\\FeatureTestDemo\\Browser Drivers\\msedgedriver.exe");
	    driver=new EdgeDriver();
	    driver.manage().window().maximize();
	}

	@When("User should enter url in browser")
	public void user_should_enter_url_in_browser() {
	   driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
	}

	@Then("User should enter {string} and {string}")
	public void user_should_enter_and(String string, String string2) {
		driver.findElement(By.id("Email")).clear();
		driver.findElement(By.id("Password")).clear();
	    driver.findElement(By.id("Email")).sendKeys("admin@yourstore.com");
	    driver.findElement(By.id("Password")).sendKeys("admin");

	    
	}

	@Then("User should Click on Login Button")
	public void user_should_click_on_login_button() {
	    driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	}

	@Then("User should see Dashboard page")
	public void user_should_see_dashboard_page() {
	    String dash=driver.findElement(By.xpath("//div[@class=\"content-header\"]/h1")).getText();
	    Assert.assertEquals("Not in Home Page","Dashboard", dash);
	}

	@Then("Logout of Application")
	public void logout_of_application() {
	   driver.findElement(By.xpath("//*[@id=\"navbarText\"]/ul/li[3]")).click();
	}

	@Then("User should Land to Home Page")
	public void user_should_land_to_home_page() {
		String title=driver.getTitle();
	    Assert.assertEquals("Not landed in login page","nopCommerce demo store. Login", title);
	}



}
