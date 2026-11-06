package pagepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	@FindBy(xpath="//*[@id=\"user-name\"]")WebElement username;
	@FindBy(xpath="//*[@id=\"password\"]")WebElement password;
	@FindBy(xpath="//*[@id=\"login-button\"]")WebElement loginbtn;
	
	public LoginPage(WebDriver driver)  //constructor
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
 
	//method
	public String titlemethod() 
	{
		String title=driver.getTitle();
		return title;
	}
	public void Loginmethod(String un,String pwd)
	{
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginbtn.click();
	}
	public String url_method() {
		String actualurl=driver.getCurrentUrl();
		return actualurl;
	}
}
