package testpackage;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import basepackage.BasecClass;

public class LoginTest extends BasecClass {
	
	@Test(priority=1)
	public void titleverification() {
		
		String actualtitle=loginobj.titlemethod();
		Assert.assertEquals(actualtitle, "Swag Labs");
	}
	@Test(priority=2)
	public void loginvalidationmethod() {
		loginobj.Loginmethod("standard_user","secret_sauce" );
		
	}
	@Test(priority=3)
	public void urlvalidation() {
		String Homeurl=loginobj.url_method();
		System.out.println(Homeurl);
		//Assert.assertEquals(Homeurl, "https://www.saucedemo.com/inventory.html");
		WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.urlToBe("https://www.saucedemo.com/inventory.html"));
		}
}
