package testpackage;

import org.testng.Assert;
import org.testng.annotations.Test;

import basepackage.BasecClass;

public class HomeTest extends BasecClass{
	
	@Test(priority=1)
	public void textverification() {
		//loginobj.Loginmethod("standard_user","secret_sauce");//calls the login method before executing homepage mthd
		
		String producttext=homeobj.textmthd();
		Assert.assertEquals(producttext, "Products");
	}
	@Test(priority=2)
	public void linkverify() {
		int linkcount=homeobj.linkmthd();
		System.out.println("Number of links---"+linkcount);
	}
	@Test(priority=3)
	public void cartverify() {
		homeobj.cartmthd();
	}
	
	

}
