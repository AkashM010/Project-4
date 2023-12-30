package Project_Main;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pageObject extends ReusableComponents{
	
	public pageObject(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name = "username")		//Login Page Object
	WebElement username;
	
	public void username(String name) {
		username.sendKeys(name);
	}
	
	@FindBy(name = "password")
	WebElement passwordElement;
	
	public void password(String pwd) {
		passwordElement.sendKeys(pwd);
	}
	
	@FindBy(tagName = "button")
	WebElement btnElement;
	
	public void button() {
		btnElement.click();
	}
	
	@FindBy(xpath = "//span[text()='Leave']")		//Leave Module tab Page Object
	WebElement leaveTabElement;
	
	public WebElement leaveModuleTab() {
		return leaveTabElement;
	}
	
	@FindBy(xpath = "//h5[text()='Leave List']")		//Leave List Module Tab
	WebElement leaveListElement;
	
	public WebElement LeaveListModuleTab() {
		return leaveListElement;
	}
	
	@FindBy(xpath = "//a[text()='Apply']")		//Apply Module tab Page Object
	WebElement applyModuleElement;
	
	public WebElement applyModuleTab() {
		return applyModuleElement;
	}
	
	@FindBy(xpath = "//a[text()='My Leave']")		//My Leave tab Page Object
	WebElement myLeaveTabElement;
	
	public WebElement MyLeaveTab() {
		return myLeaveTabElement;
	}
	
	@FindBy(xpath = "//*[text()='My Leave List']")
	WebElement myLeaveListPageElement;
	
	public WebElement MyLeaveListPage() {
		return myLeaveListPageElement;
	}
	
	@FindBy(xpath = "//*[text()='No Record Found']")
	WebElement recordsElement;
	
	public WebElement recordsTable() {
		return myLeaveListPageElement;
	}
	
	@FindBy(xpath = "//button[contains(@class,'oxd-button--ghost')]")		//Reset Button
	WebElement resetElement;
	
	public WebElement resetButton() {
		return resetElement;
	}
	
	@FindBy(xpath = "//button[contains(@class,'orangehrm-left-space')]")		//Search Button
	WebElement searchElement;
	
	public WebElement searchButton() {
		return searchElement;
	}
	
	@FindBy(xpath = "//button[contains(@class,'oxd-button--ghost')]")		//Cancel Button
	WebElement cancelElement;
	
	public WebElement cancelButton() {
		return cancelElement;
	}
	
	@FindBy(xpath = "//button[contains(@class,'oxd-button--secondary')]")		//Save Button
	WebElement saveElement;
	
	public WebElement saveButton() {
		return saveElement;
	}
	
	@FindBy(xpath = "//button[contains(@class,'oxd-button--secondary')]")		//Add Button
	WebElement addElement;
	
	public WebElement AddButton() {
		return addElement;
	}
	
	@FindBy(xpath = "//button[contains(@class,'oxd-button--secondary')]")		//Generate Button
	WebElement generateElement;
	
	public WebElement generateButton() {
		return generateElement;
	}
	
	@FindBy(xpath = "//button[contains(@class,'oxd-button--secondary')]")		//Assign Button
	WebElement assignElement;
	
	public WebElement assignButton() {
		return assignElement;
	}
	
	@FindBy(className = "orangehrm-container")			//Table Page Object
	WebElement tableElement;
	
	public WebElement Table() {
		return tableElement;
	}
	
	@FindBy(className = "oxd-table-card")				//Table Rows Page Object
	List<WebElement> rowsElement;
	
	public List<WebElement> tableRows() {
		return rowsElement;
	}
	
	@FindBy(xpath = "//span[text()='Entitlements ']")		//Entitlement tab Page Object
	WebElement entitlementTabElement;
	
	public WebElement EntitlementTab() {
		return entitlementTabElement;
	}
	
	@FindBy(xpath = "//a[text()='Add Entitlements']")		//Add Entitlement tab Page Object
	WebElement addEntitlementTabElement;
	
	public WebElement AddEntitlementTab() {
		return addEntitlementTabElement;
	}
	
	@FindBy(xpath = "//p[text()='Add Leave Entitlement']")
	WebElement addEntitlementPageElement;
	
	public WebElement AddEntitlementPage() {
		return addEntitlementPageElement;
	}
	
	@FindBy(xpath = "//a[text()='Employee Entitlements']")		//Employee Entitlement tab Page Object
	WebElement employeeEntitlementTabElement;
	
	public WebElement EmployeeEntitlementTab() {
		return employeeEntitlementTabElement;
	}
	
	@FindBy(xpath = "//a[text()='My Entitlements']")		//My Entitlement tab Page Object
	WebElement myEntitlementTabElement;
	
	public WebElement MyEntitlementTab() {
		return myEntitlementTabElement;
	}
	
	@FindBy(xpath = "//h5[text()='My Leave Entitlements']")
	WebElement myEntitlementPageElement;
	
	public WebElement MyEntitlementPage() {
		return myEntitlementPageElement;
	}
	
	@FindBy(xpath = "//span[text()='Reports ']")		//Reports tab Page Object
	WebElement reportsTabElement;
	
	public WebElement ReportsTab() {
		return reportsTabElement;
	}
	
	@FindBy(xpath = "//a[text()='Leave Entitlements and Usage Report']")		//LeaveEntitlementAndUsage Page Object
	WebElement leaveEntitlementAndUsageElement;
	
	public WebElement LeaveEntitlementAndUsage() {
		return leaveEntitlementAndUsageElement;
	}
	
	@FindBy(xpath = "//a[text()='My Leave Entitlements and Usage Report']")		//MyLeaveEntitlementAndUsage Page Object
	WebElement myLeaveEntitlementAndUsageElement;
	
	public WebElement MyLeaveEntitlementAndUsage() {
		return myLeaveEntitlementAndUsageElement;
	}
	
	@FindBy(xpath = "//h5[text()='Leave Entitlements and Usage Report']")
	WebElement LeaveEntitlementsAndUsageReportPageElement;
	
	public WebElement LeaveEntitlementsAndUsageReportPage() {
		return LeaveEntitlementsAndUsageReportPageElement;
	}
	
	@FindBy(xpath = "//h5[text()='My Leave Entitlements and Usage Report']")
	WebElement myLeaveEntitlementsAndUsageReportPageElement;
	
	public WebElement MyLeaveEntitlementsAndUsageReportPage() {
		return myLeaveEntitlementsAndUsageReportPageElement;
	}
	
	@FindBy(xpath = "//span[text()='Configure ']")		//Configure tab Page Object
	WebElement configureTabElement;
	
	public WebElement ConfigureTab() {
		return configureTabElement;
	}
	
	@FindBy(xpath = "//a[text()='Leave Period']")
	WebElement leaveperiodElement;
	
	public WebElement LeavePeriod() {
		return leaveperiodElement;
	}
	
	@FindBy(xpath = "//p[text()='Leave Period']")
	WebElement leavePeriodPageElement;
	
	public WebElement LeavePeriodPage() {
		return leavePeriodPageElement;
	}
	
	@FindBy(xpath = "//a[text()='Leave Types']")
	WebElement leaveTypesElement;
	
	public WebElement LeaveTypes() {
		return leaveTypesElement;
	}
	
	@FindBy(xpath = "//a[text()='Work Week']")
	WebElement workWeekElement;
	
	public WebElement WorkWeek() {
		return workWeekElement;
	}
	
	@FindBy(xpath = "//p[text()='Work Week']")
	WebElement workWeekPageElement;
	
	public WebElement WorkWeekPage() {
		return workWeekPageElement;
	}
	
	@FindBy(className = "oxd-form-row")
	List<WebElement> weekRowsElement;
	
	public List<WebElement> WeekRows() {
		return weekRowsElement;
	}
	
	@FindBy(xpath = "//a[text()='Holidays']")
	WebElement holidaysElement;
	
	public WebElement Holidays() {
		return holidaysElement;
	}
	
	@FindBy(xpath = "//a[text()='Assign Leave']")		//Assign Leave Module tab Page Object
	WebElement assignLeaveModuleElement;
	
	public WebElement AssignLeaveModuleTab() {
		return assignLeaveModuleElement;
	}
	
	
}
