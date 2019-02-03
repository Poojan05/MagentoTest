

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
	WebDriver driver;
	
	By email=By.id("email");
	By password=By.id("pass");
	By login=By.id("send2");

	public Login(WebDriver driver) {
		this.driver = driver;
	}
	
	public void typeEmail(String data) {
		driver.findElement(email).sendKeys(data);
		
	}
	
	public void typePassword(String pwd) {
		driver.findElement(password).sendKeys(pwd);
		
	}
	
	
	public void clickOnLogin() {
		driver.findElement(login).click();
		
	}

}
