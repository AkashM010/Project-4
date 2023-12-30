package Project_Test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Project_Main.ReusableComponents;
import Project_Main.pageObject;

public class ValidatingLeaveListTab {

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
		obj.LeaveListModuleTab().click();
	}
	
	@AfterTest
	public void teardown() {
		components.quit();
	}
	
	@Test
	public void leaveListtab() {
		boolean leaveListTabDisplayed = obj.LeaveListModuleTab().isDisplayed();
		assertion.assertEquals(leaveListTabDisplayed, true);
		boolean leaveListTabEnabled = obj.LeaveListModuleTab().isEnabled();
		assertion.assertEquals(leaveListTabEnabled, true);
		boolean resetButtonDisplayed = obj.resetButton().isDisplayed();
		assertion.assertEquals(resetButtonDisplayed, true);
		boolean resetButtonEnabled = obj.resetButton().isEnabled();
		assertion.assertEquals(resetButtonEnabled, true);
		boolean searchButtonDisplayed = obj.searchButton().isDisplayed();
		assertion.assertEquals(searchButtonDisplayed, true);
		boolean searchButtonEnabled = obj.searchButton().isEnabled();
		assertion.assertEquals(searchButtonEnabled, true);
		boolean tableDisplayed = obj.Table().isDisplayed();
		assertion.assertEquals( tableDisplayed, true);
	}
}
