package Project_Test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Project_Main.ReusableComponents;
import Project_Main.pageObject;

public class ValidatingAssignLeaveTab {

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
		obj.AssignLeaveModuleTab().click();
	}
	
	@AfterTest
	public void teardown() {
		components.quit();
	}
	
	@Test
	public void assignLeaveTab() {
		boolean assignLeaveTabDisplayed = obj.AssignLeaveModuleTab().isDisplayed();
		assertion.assertEquals(assignLeaveTabDisplayed, true);
		boolean assignLeaveTabEnabled = obj.AssignLeaveModuleTab().isEnabled();
		assertion.assertEquals(assignLeaveTabEnabled, true);
		obj.AssignLeaveModuleTab().click();
		boolean assignButtonDisplayed = obj.assignButton().isDisplayed();
		assertion.assertEquals(assignButtonDisplayed, true);
		boolean assignButtonEnabled = obj.assignButton().isEnabled();
		assertion.assertEquals(assignButtonEnabled, true);
	}
}
