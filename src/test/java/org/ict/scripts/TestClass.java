package org.ict.scripts;

import java.io.IOException;

import org.ict.automationconstants.Constants;
import org.ict.pages.HomePage;
import org.ictkerala.utilities.ExcelUtility;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass extends TestBase {
HomePage home;
@Test
public void Amazon() throws IOException {
	home=new HomePage(driver);
	String searchvalue=ExcelUtility.getData(0, 0);
	home.Search(searchvalue);
	home.Button();
	String Actual="https://www.amazon.com/s?k=Iphone&crid=3CUGOPHQ5CFMP&sprefix=iphone%2Caps%2C367&ref=nb_sb_noss_2";
	Assert.assertEquals(Actual, Constants.EXPECTED1);
}
@Test
public void IphoneSelect() {
	home.Iphone();
	String Actual="https://www.amazon.com/Apple-iPhone-12-Mini-Black/dp/B08PPDJWC8/ref=sr_1_1?crid=3CUGOPHQ5CFMP&keywords=Iphone&qid=1692423576&sprefix=iphone%2Caps%2C367&sr=8-1&th=1";
	Assert.assertEquals(Actual, Constants.EXPECTED2);
}
@Test
public void verizonclk() {
	home.Verizon();
}
@Test
public void See() {
	home.Seemore();
}
@Test
public void additems() {
	home.AddAnother();
	String Actual="https://www.amazon.com/cart/smart-wagon?newItems=e3922cad-44ae-4e8e-b4a9-01c9603b165b,1|e8ca466c-4714-403b-a6db-bdbe910c27f4,1|8fbfb294-f931-4f31-94f2-6d2553707cba,1&ref_=sw_refresh";
	Assert.assertEquals(Actual, Constants.EXPECTED3);
	
}
@Test
public void gocart() {
	home.Gotocart();
	String Actual="https://www.amazon.com/cart?ref_=sw_gtc";
	Assert.assertEquals(Actual, Constants.EXPECTED4);
}
}

