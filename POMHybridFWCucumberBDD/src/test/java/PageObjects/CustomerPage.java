package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerPage {
	WebDriver driver;
	public CustomerPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//h1[@class=\"float-left\"]")
		public WebElement AddCustomertitle;
	
	@FindBy(id="Email")
		public WebElement email;
	
	@FindBy(id="Password")
		public WebElement password;
	
	@FindBy(id="FirstName")
		public WebElement firstname;
	
	@FindBy(id="LastName")
		public WebElement lastname;
	
	@FindBy(id="Gender_Male")
		public WebElement Gender;
	
	@FindBy(id="Company")
		public WebElement companyname;
	
	@FindBy(id="IsTaxExempt")
		public WebElement tax;
	
	@FindBy(id="VendorId")
		public WebElement vendor;
	
	@FindBy(id="AdminComment")
		public WebElement adminComment;
	
	@FindBy(name="save")
		public WebElement savebtn;
	
	@FindBy(xpath="(/html/body/div[3]/div[1]/div[1]/text())[2]")
		public String verifyText;
	
	@FindBy(xpath="//button[@type='submit']")
		public WebElement loginbtn;
	
	
	
	public void setValue(WebElement element,String value) {
		element.sendKeys(value);
	}
	
}
