package pagepackage;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"header_container\"]/div[2]/span")WebElement product;
	@FindBy(tagName="a")List <WebElement>links;
	@FindBy(xpath="//*[@id=\"add-to-cart-sauce-labs-backpack\"]")WebElement add_to_cart;
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public String textmthd() {
		String actualtext=product.getText();
		return actualtext;
	}
	public int linkmthd() {
		int count=links.size();
		return count;
	}
	public void cartmthd() {
		add_to_cart.click();
	}

}
