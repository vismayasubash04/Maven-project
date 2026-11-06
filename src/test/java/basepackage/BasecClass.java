package basepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import pagepackage.HomePage;
import pagepackage.LoginPage;

public class BasecClass {
	public static WebDriver driver;
	
	public LoginPage loginobj;
	public HomePage homeobj;
	
	@BeforeTest
	public void setup() {
		ChromeOptions options =new ChromeOptions();
		options.addArguments("--incognito");
		driver=new ChromeDriver(options);
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
	}
	@BeforeMethod
	public void objectmethod() {
		loginobj=new LoginPage(driver);
		homeobj=new HomePage(driver);
	}

}
