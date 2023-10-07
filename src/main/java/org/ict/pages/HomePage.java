package org.ict.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	WebDriver driver;
	public HomePage(WebDriver driver) {
		this.driver=driver;
	}
public void Search(String value) {
	WebElement NewSearch=driver.findElement(By.id("twotabsearchtextbox"));
	NewSearch.sendKeys(value);
}
public void Button() {
	WebElement Btn=driver.findElement(By.id("nav-search-submit-button"));
	Btn.click();
}
public void Iphone() {
	WebElement phone=driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal'and text()='Apple iPhone 12 Mini, 64GB, Black - Unlocked (Renewed)']"));
	phone.click();
}
public void Verizon() {
	WebElement verizon=driver.findElement(By.xpath("//p[text()='Verizon'and @class='a-text-left a-size-base']"));
	verizon.click();
}
public void Seemore() {
	WebElement more=driver.findElement(By.xpath("//span[@class='a-expander-prompt'and text()='See more']"));
	more.click();
}
public void AddAnother() {
WebElement Add=driver.findElement(By.name("submit.addToCart"));
Add.click();

}
public void Gotocart() {
	WebElement Cart=driver.findElement(By.xpath("//a[@class='a-button-text']"));
	Cart.click();
}}