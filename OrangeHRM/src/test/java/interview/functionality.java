package interview;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class functionality extends reusableComp {
//	reusableComp obj = new reusableComp();
	
	@BeforeMethod
	public void start() {
		driver.get("http://3.7.34.230/vanit/Login.aspx");
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	
	@Test
	public void login() {
		driver.findElement(By.id("txtUserName"));
		driver.findElement(By.id("txtPassword"));
	}
	
}
