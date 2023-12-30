package Project_Test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Project_Main.ReusableComponents;
import Project_Main.pageObject;

public class ValidatingReportsTab {

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
		obj.ReportsTab().click();
	}
	
	@AfterTest
	public void teardown() {
		components.quit();
	}
	
	@Test
	public void reportsTab() {
		boolean reportstabDisplayed = obj.ReportsTab().isDisplayed();
		assertion.assertEquals(reportstabDisplayed, true);
		boolean reportstabenabled = obj.ReportsTab().isEnabled();
		assertion.assertEquals(reportstabenabled, true);
		obj.ReportsTab().click();
		obj.LeaveEntitlementAndUsage().click();
		boolean page1Displayed = obj.LeaveEntitlementsAndUsageReportPage().isDisplayed();
		assertion.assertEquals(page1Displayed, true);
		boolean page1Enabled = obj.LeaveEntitlementsAndUsageReportPage().isEnabled();
		assertion.assertEquals(page1Enabled, true);
		boolean generateButtonDisplayed = obj.generateButton().isDisplayed();
		assertion.assertEquals(generateButtonDisplayed, true);
		boolean generateButtonEnabled = obj.generateButton().isDisplayed();
		assertion.assertEquals(generateButtonEnabled, true);
		obj.ReportsTab().click();
		obj.MyLeaveEntitlementAndUsage().click();
		boolean page2Displayed = obj.MyLeaveEntitlementsAndUsageReportPage().isDisplayed();
		assertion.assertEquals(page2Displayed, true);
		boolean page2Enabled = obj.MyLeaveEntitlementsAndUsageReportPage().isEnabled();
		assertion.assertEquals(page2Enabled, true);
		assertion.assertEquals(generateButtonDisplayed, true);
		assertion.assertEquals(generateButtonEnabled, true);
	}
}
