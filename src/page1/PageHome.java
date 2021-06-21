package page1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


@Test
public class PageHome {
	
		WebDriver driver;
	
		public PageHome(WebDriver driver) {
			this.driver = driver;
		

	
	PageFactory.initElements(driver, this);
		}
		
	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	WebElement search;
	
	@FindBy(xpath="//input[@id='nav-search-submit-button']")
	WebElement click;
	
	
	public WebElement input() {
		return search;
	}
	

	public WebElement check() {
		return click;
	
	}
}
