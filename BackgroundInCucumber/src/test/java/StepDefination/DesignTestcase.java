package StepDefination;

import static org.junit.Assert.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.*;
import junit.framework.*;

public class DesignTestcase {
	WebDriver driver;
	@Given("user is on login page")
	public void user_is_on_login_page() {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\ashwin.murugan\\eclipse-workspace\\BackgroundInCucumber\\Browser Driver jars\\msedgedriver.exe");
		driver=new EdgeDriver();
		driver.manage().window().maximize();
	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
	    driver.findElement(By.name("username")).sendKeys("Admin");
	    driver.findElement(By.name("password")).sendKeys("admin123");
	}

	@When("clicks on login button")
	public void clicks_on_login_button() {
	    driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	}

	@Then("user is navigated to the homepage")
	public void user_is_navigated_to_the_homepage() {
	    if(driver.getPageSource().contains("Dashboard")) {
//	    	assert.assertTrue(true);
	    	Assert.assertEquals("Dashboard",driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6")).getText());
	    }else {
	    	Assert.assertTrue(false);
	    	driver.close();
	    	
	    }
	}

	@When("user clicks on welcome link")
	public void user_clicks_on_welcome_link() {
	    driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[3]/ul/li")).click();
	}

	@Then("logout link is displayed")
	public void logout_link_is_displayed() {
	    if(driver.getPageSource().contains("Logout")) {
	    	Assert.assertEquals("Logout", driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[3]/ul/li/ul/li[4]/a")).getText());
	    }else {
	    	driver.close();
	    }
	}

	@When("user clicks on dashboard link")
	public void user_clicks_on_dashboard_link() {
	    driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[8]/a")).click();
	}

	@Then("quick launch toolbar is displayed")
	public void quick_launch_toolbar_is_displayed() {
		WebElement toolbar = driver.findElement(By.xpath("//nav[@aria-label='Sidepanel']"));
		Assert.assertTrue("Toolbar is not displayed", toolbar.isDisplayed());
	}
}
