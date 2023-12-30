package Project_Test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Project_Main.ReusableComponents;
import Project_Main.pageObject;

public class ValidatingApplyModuleTab {

	WebDriver driver;
	ReusableComponents components = new ReusableComponents();
	pageObject obj;
	SoftAssert assertion = new SoftAssert();
	
	@BeforeMethod
	public void setup() {
		components.setUp();
		obj = new pageObject(components.driver);
		components.LogIn();
	}
	
	@AfterMethod
	public void teardown() {
		components.quit();
	}
	
	@Test
	public void applyModuleTab() {
		obj.leaveModuleTab().click();
		boolean displayed = obj.applyModuleTab().isDisplayed();
		assertion.assertEquals(displayed, true);
		boolean enabled = obj.applyModuleTab().isEnabled();
		assertion.assertEquals(enabled, true);
	}
}
