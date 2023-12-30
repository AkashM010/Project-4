package Project_Test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Project_Main.ReusableComponents;
import Project_Main.pageObject;

public class ValidatingConfigureTab {

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
		obj.ConfigureTab().click();
	}
	
	@AfterTest
	public void teardown() {
		components.quit();
	}
	
	@Test
	public void configureTab() {
		boolean configureTabDisplayed = obj.ConfigureTab().isDisplayed();
		assertion.assertEquals(configureTabDisplayed, true);
		boolean configureTabEnabled = obj.ConfigureTab().isEnabled();
		assertion.assertEquals(configureTabEnabled, true);
		obj.ConfigureTab().click();
		boolean leavePeriodDisplayed = obj.LeavePeriod().isDisplayed();
		assertion.assertEquals(leavePeriodDisplayed, true);
		boolean leavePeriodEnabled = obj.LeavePeriod().isEnabled();
		assertion.assertEquals(leavePeriodEnabled, true);
		obj.LeavePeriod().click();
		boolean leavePeriodPageDisplayed = obj.LeavePeriodPage().isDisplayed();
		assertion.assertEquals(leavePeriodPageDisplayed, true);
		boolean resetButtonDisplayed = obj.resetButton().isDisplayed();
		assertion.assertEquals(resetButtonDisplayed, true);
		boolean resetButtonEnabled = obj.resetButton().isEnabled();
		assertion.assertEquals(resetButtonEnabled, true);
		boolean saveButtonDisplayed = obj.saveButton().isDisplayed();
		assertion.assertEquals(saveButtonDisplayed, true);
		boolean saveButtonEnabled = obj.saveButton().isEnabled();
		assertion.assertEquals(saveButtonEnabled, true);
		obj.ConfigureTab().click();
		boolean leaveTypesDisplayed = obj.LeaveTypes().isDisplayed();
		assertion.assertEquals(leaveTypesDisplayed, true);
		boolean leaveTypesEnabled = obj.LeaveTypes().isEnabled();
		assertion.assertEquals(leaveTypesEnabled, true);
		obj.LeaveTypes().click();
		boolean addButtonDisplayed = obj.AddButton().isDisplayed();
		assertion.assertEquals(addButtonDisplayed, true);
		boolean addButtonEnabled = obj.AddButton().isEnabled();
		assertion.assertEquals(addButtonEnabled, true);
		int size1 = obj.tableRows().size();
		assertion.assertEquals(size1, 10);
		obj.ConfigureTab().click();
		obj.WorkWeek().click();
		boolean workWeekPageDisplayed = obj.WorkWeekPage().isDisplayed();
		assertion.assertEquals(workWeekPageDisplayed, true);
		int size2 = obj.WeekRows().size();
		assertion.assertEquals(size2, 7);
		assertion.assertEquals(saveButtonDisplayed, true);
		assertion.assertEquals(saveButtonEnabled, true);
		obj.ConfigureTab().click();
		boolean HolidaysTabDisplayed = obj.Holidays().isDisplayed();
		assertion.assertEquals(HolidaysTabDisplayed, true);
	}
}
