package Project_Test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Project_Main.ReusableComponents;
import Project_Main.pageObject;

public class ValidatingEntitlementsTab {

	WebDriver driver;
	ReusableComponents components = new ReusableComponents();
	pageObject obj;
	SoftAssert assertion = new SoftAssert();
	
	@BeforeTest
	public void setup() {
		components.setUp();
		obj = new pageObject(components.driver);
		components.LogIn();
		obj.leaveModuleTab().click();
	}
	
	@AfterTest
	public void teardown() {
		components.quit();
	}
	
	@Test
	public void entitlementTab() {
		boolean entitlementtabDisplayed = obj.EntitlementTab().isDisplayed();
		assertion.assertEquals(entitlementtabDisplayed, true);
		boolean entitlementtabEnabled = obj.EntitlementTab().isEnabled();
		assertion.assertEquals(entitlementtabEnabled, true);
	}
}
