package Project_Test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Project_Main.ReusableComponents;
import Project_Main.pageObject;

public class ValidatingAddEntitlementModule {

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
	
	@BeforeMethod
	public void preCondition() {
		obj.EntitlementTab().click();
	}
	
	@AfterTest
	public void teardown() {
		components.quit();
	}
	
	@Test
	public void addEntitlementTab() {
		boolean addEntitlementTabDisplayed = obj.AddEntitlementTab().isDisplayed();
		assertion.assertEquals(addEntitlementTabDisplayed, true);
		boolean addEntitlementTabEnabled = obj.AddEntitlementTab().isEnabled();
		assertion.assertEquals(addEntitlementTabEnabled, true);
		obj.AddEntitlementTab().click();
		boolean addEntitlementPageDisplayed = obj.AddEntitlementPage().isDisplayed();
		assertion.assertEquals(addEntitlementPageDisplayed, true);
		boolean addEntitlementPageEnabled = obj.AddEntitlementPage().isEnabled();
		assertion.assertEquals(addEntitlementPageEnabled, true);
		boolean cancelDisplayed = obj.cancelButton().isDisplayed();
		assertion.assertEquals(cancelDisplayed, true);
		boolean cancelEnabled = obj.cancelButton().isEnabled();
		assertion.assertEquals(cancelEnabled, true);
		boolean saveDisplayed = obj.saveButton().isDisplayed();
		assertion.assertEquals(saveDisplayed, true);
		boolean saveEnabled = obj.saveButton().isEnabled();
		assertion.assertEquals(saveEnabled, true);
	}
}
