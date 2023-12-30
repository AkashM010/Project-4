package Project_Test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Project_Main.ReusableComponents;
import Project_Main.pageObject;

public class ValidatingMyEntitlementTab {

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
	public void myEntitlementTab() {
		boolean myEntitlemnetTabDisplsyed = obj.MyEntitlementTab().isDisplayed();
		assertion.assertEquals(myEntitlemnetTabDisplsyed, true);
		boolean myEntitlemnetTabEnabled = obj.MyEntitlementTab().isEnabled();
		assertion.assertEquals(myEntitlemnetTabEnabled, true);
		obj.MyEntitlementTab().click();
		boolean myEntitlementPageDisplayed = obj.MyEntitlementPage().isDisplayed();
		assertion.assertEquals(myEntitlementPageDisplayed, true);
		boolean searchDisplayed = obj.searchButton().isDisplayed();
		assertion.assertEquals(searchDisplayed, true);
		boolean searchEnabled = obj.searchButton().isEnabled();
		assertion.assertEquals(searchEnabled, true);
		boolean addDisplayed = obj.AddButton().isDisplayed();
		assertion.assertEquals(addDisplayed, true);
		boolean addEnabled = obj.AddButton().isEnabled();
		assertion.assertEquals(addEnabled, true);
	}
}
