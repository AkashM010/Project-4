package Project_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Project_Main.ReusableComponents;
import Project_Main.pageObject;

public class ValidatingLeaveModuletab {
	
	WebDriver driver;
	pageObject obj;
	ReusableComponents components = new ReusableComponents();
	SoftAssert assertion = new SoftAssert();
	
	@BeforeMethod
	public void setup() {
		components.setUp();
		obj = new pageObject(components.driver);
		components.LogIn();
	}
	
	@AfterMethod
	public void teardown() {
		obj.quit();
	}
	
	@Test
	public void leaveModuleTab() throws Exception {
		boolean displayed = obj.leaveModuleTab().isDisplayed();
		assertion.assertEquals(displayed, true);
		boolean enabled = obj.leaveModuleTab().isEnabled();
		assertion.assertEquals(enabled, true);
		
		obj.leaveModuleTab().click();
		boolean leaveModulePage = obj.LeaveListModuleTab().isDisplayed();
		assertion.assertEquals(leaveModulePage, true);
		Thread.sleep(2000);
	}
}
