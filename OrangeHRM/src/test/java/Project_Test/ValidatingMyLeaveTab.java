package Project_Test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Project_Main.ReusableComponents;
import Project_Main.pageObject;

public class ValidatingMyLeaveTab {

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
		obj.MyLeaveTab().click();
	}
	
	@AfterTest
	public void teardown() {
		components.quit();
	}
	
	@Test
	public void validatingMyLeaveTab() {
		boolean displayed = obj.MyLeaveTab().isDisplayed();
		assertion.assertEquals(displayed, true);
		boolean enabled = obj.MyLeaveTab().isEnabled();
		assertion.assertEquals(enabled, true);
		boolean myLeaveListDisplayed = obj.MyLeaveListPage().isDisplayed();
		assertion.assertEquals(myLeaveListDisplayed, true);
		boolean resetDisplayed = obj.resetButton().isDisplayed();
		assertion.assertEquals(resetDisplayed, true);
		boolean resetEnabled = obj.resetButton().isEnabled();
		assertion.assertEquals(resetEnabled, true);
		boolean searchDisplayed = obj.searchButton().isDisplayed();
		assertion.assertEquals(searchDisplayed, true);
		boolean searchEnabled = obj.searchButton().isEnabled();
		assertion.assertEquals(searchEnabled, true);
	}
}
