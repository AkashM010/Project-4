package interview;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class reusableComp {
public WebDriver driver;
	
	public void setUp() {
		driver = new ChromeDriver();
		launchApp();
		driver.manage().window().maximize();
	}
	
	public void launchApp() {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	public void quit() {
		driver.quit();
	}
}
