package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import reuseables.CodeReusables;

public class LoginPage {
WebDriver driver;
CodeReusables reuse = new CodeReusables();

	public LoginPage(WebDriver ldriver) {
		this.driver = ldriver;
	}
	public void loginPage() {
		driver.findElement(By.id(reuse.readPropertise("user"))).sendKeys("admin");
		driver.findElement(By.id(reuse.readPropertise("pass"))).sendKeys("admin123");
		reuse.screenshot(driver, "screenshot");
	}
}
