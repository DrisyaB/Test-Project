package org.ict.scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestBase {
WebDriver driver;
@BeforeTest
public void SetUp() {
	driver=new ChromeDriver();
	driver.get("https://www.amazon.com/");
	driver.manage().window().maximize();
}
@AfterTest
public void TearDown() {
	driver.quit();
}
}
