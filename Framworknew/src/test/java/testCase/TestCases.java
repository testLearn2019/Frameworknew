package testCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import reuseables.CodeReusables;

public class TestCases {
	WebDriver driver;
	LoginPage login;
	CodeReusables Reusecode = new CodeReusables();
	
	@BeforeTest
	public void browser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Parameshwari\\Framworknew\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(Reusecode.readPropertise("url"));
		
		
	}
	@Test
	public void Login() {
		login = new LoginPage(driver);
		//login.loginPage();
		login.loginPage();
	}
	
}
