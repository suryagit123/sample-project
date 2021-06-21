package page2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import page1.PageLogin;
import page1.PageHome;

public class Testcase {

	// public static void main(String[] args) {
	// TODO Auto-generated method stub
	@Test
	public void system() throws InterruptedException {
		System.out.println("success");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\surya k\\OneDrive\\Pictures\\Saved Pictures//chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(
				"https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");

		PageLogin sam = new PageLogin(driver);
		sam.user();
		sam.signin().click();
		Thread.sleep(3000);
		sam.password().sendKeys("qwerty123");
		sam.login().click();

		PageHome Two = new PageHome(driver);
		Two.input().sendKeys("Oneplus Nord");
		Two.check().click();

	}
}