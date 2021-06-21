package page1;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


@Test
public class PageLogin {
	WebDriver driver;///testcase

	public PageLogin(WebDriver driver) {
		this.driver = driver;
	}

	By name = By.id("ap_email");
	
	By sign = By.id("continue");
	By pass= By.xpath("//input[@id='ap_password']");
	By login =By.xpath("//input[@id='signInSubmit']");

	public void user() {
		 driver.findElement(name).sendKeys("9025351341");
	}


	public WebElement signin() {
		return driver.findElement(sign);
	}
	
	public WebElement password() {
		return driver.findElement(pass);
		
	}
	
	public WebElement login() {
		return driver.findElement(login);
	}
		
		
		
		
		
		

}