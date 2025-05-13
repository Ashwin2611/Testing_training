package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.*;

public class DesignTestCaseHB {
	WebDriver driver;
	@Given("User should launch Browser")
	public void user_should_launch_browser() {
	     System.setProperty("webdriver.edge.driver","C:\\Users\\ashwin.murugan\\eclipse-workspace\\DemoMaven\\Browser Drivers\\msedgedriver.exe");
	     driver=new EdgeDriver();
	     driver.manage().window().maximize();
	      
	}
	@When("User should enter url in Edge browser")
	public void user_should_enter_url_in_edge_browser() {
		driver.get("https://www.hollandandbarrett.com/auth/login");
	}

	@Then("User should enter email address in text box")
	public void user_should_enter_email_address_in_text_box() {
	      driver.findElement(By.id("username")).sendKeys("ashwinmurugan1@gmail.com");
	      
	}

	@Then("User should enter password in text box")
	public void user_should_enter_password_in_text_box() {
		driver.findElement(By.id("password")).sendKeys("Ashwin@1100");
	      
	}

	@Then("User should click signin button")
	public void user_should_click_signin_button() {
		  System.out.println(driver.getTitle());
	      driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	}

	@Then("Verify you successfully login in")
	public void verify_you_successfully_login_in() {
	      String title=driver.getTitle();
	      System.out.println(title);
	}

	@Then("User should click on Hamburger icon")
	public void user_should_click_on_hamburger_icon() {
	      
	      
	}

	@Then("User should click on Shop")
	public void user_should_click_on_shop() {
	      
	      
	}

	@Then("User should click Vitamins & Supplements in menu")
	public void user_should_click_vitamins_supplements_in_menu() {
	      
	      
	}

	@Then("User should click on the vitamins in menu")
	public void user_should_click_on_the_vitamins_in_menu() {
	      
	      
	}

	@Then("User should click on the vitamin C product")
	public void user_should_click_on_the_vitamin_c_product() {
	      
	      
	}

	@Then("User should choose a product and click on add to basket button")
	public void user_should_choose_a_product_and_click_on_add_to_basket_button() {
	      
	      
	}

	@Then("User should click on Vegan")
	public void user_should_click_on_vegan() {
	      
	      
	}

	@Then("User should click the Vegan chocolate in menu")
	public void user_should_click_the_vegan_chocolate_in_menu() {
	      
	      
	}

	@Then("User should choose a product and click on the add to basket button")
	public void user_should_choose_a_product_and_click_on_the_add_to_basket_button() {
	      
	      
	}

	@Then("User should click your basket icon button")
	public void user_should_click_your_basket_icon_button() {
	      
	      
	}

	@Then("Verify the products present in the basket")
	public void verify_the_products_present_in_the_basket() {
	      
	      
	}



}
