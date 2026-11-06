package pagepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage {
	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"shopping_cart_container\"]/a")WebElement cart_icon;
	@FindBy(xpath="//*[@id=\"header_container\"]/div[2]/span")WebElement your_cart;

}
