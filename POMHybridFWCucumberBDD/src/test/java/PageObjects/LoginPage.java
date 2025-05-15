package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id="Email")
		WebElement email;
	
	@FindBy(id="Password")
		WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
		WebElement loginbtn;
	
	@FindBy(xpath="//*[@id=\"navbarText\"]/ul/li[3]/a")
		WebElement logoutbtn;
	
	
	public void setUsername(String username) {
		email.clear();
		email.sendKeys(username);
	}
	
	public void setPassword(String pass) {
		password.clear();
		password.sendKeys(pass);
	}
	
	public void clickloginbtn() {
		loginbtn.click();
	}
	
	
	public void clicklogoutbtn() {
		logoutbtn.click();
	}
	
	
}

