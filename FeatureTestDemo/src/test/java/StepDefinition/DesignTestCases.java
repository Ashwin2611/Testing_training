package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.*;

public class DesignTestCases {
	WebDriver driver;
	WebDriverWait wait;
	@Given("User should launch Chome Browser")
	public void user_should_launch_chome_browser() {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\ashwin.murugan\\eclipse-workspace\\FeatureTestDemo\\Browser Drivers\\msedgedriver.exe");
		driver=new EdgeDriver();
		driver.manage().window().maximize();	
		wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	}

	@When("User should enter url in browser")
	public void user_should_enter_url_in_browser() {
		driver.get("https://www.hollandandbarrett.com/auth/signup");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id=\"onetrust-accept-btn-handler\"]"))).click();	
	}

	@Then("User should enter First name in Edit box")
	public void user_should_enter_first_name_in_edit_box() {
		driver.findElement(By.id("firstName")).sendKeys("Ashwin");
		
	}

	@Then("User should enter Last name in edit box")
	public void user_should_enter_last_name_in_edit_box() {
		driver.findElement(By.id("lastName")).sendKeys("M");
	}

	@Then("User should enter Email address")
	public void user_should_enter_email_address() {
		driver.findElement(By.id("email")).sendKeys("ashwin261100@gmail.com");
		
	}

	@Then("User should enter Confirm email address")
	public void user_should_enter_confirm_email_address() {
		driver.findElement(By.id("confirmEmail")).sendKeys("ashwin261100@gmail.com");
	}

	@Then("User Should enter Create a password in edit box")
	public void user_should_enter_create_a_password_in_edit_box() {
		driver.findElement(By.id("password")).sendKeys("Ashwin@123");
	}
	@Then("User Should select Menus")
	public void user_should_select_menus() {
//		driver.findElement(By.name("consentEmail")).click();
		driver.findElement(By.name("terms")).click();
	}

	@Then("Click on Create an Account button")
	public void click_on_create_an_account_button() {
		System.out.println(driver.getTitle()+"Driver");
		driver.findElement(By.xpath("//span[normalize-space()='Create an account']")).click();
		
	}

	@Then("System should display Account created sucessfully")
	public void system_should_display_account_created_sucessfully() {
		
	}

	@Then("Verify the title of the page")
	public void verify_the_title_of_the_page() {
		
	}

}
