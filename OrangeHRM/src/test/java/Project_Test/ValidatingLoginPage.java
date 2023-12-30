package Project_Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Project_Main.pageObject;
import Project_Main.ReusableComponents;

public class ValidatingLoginPage {
	
	WebDriver driver;
	ReusableComponents components = new ReusableComponents();
	pageObject obj;
	
	@BeforeMethod
	public void set2() {
		components.setUp();
		obj = new pageObject(components.driver);
	}
	
	@AfterMethod
	public void teardown() {
		components.quit();
	}
	
	@DataProvider(name = "Test Data")
	public Object[][] dataProvider() throws IOException {
		FileInputStream f = new FileInputStream("C:\\Users\\Akash\\OneDrive\\Desktop\\Study\\Project\\TestData.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(f);
		XSSFSheet s = wb.getSheet("Sheet1");
		
		int rowCount = s.getPhysicalNumberOfRows();
		int colCount = s.getRow(0).getLastCellNum();
		Object data[][] = new Object[rowCount-1][colCount];
		XSSFRow row;
		
		for(int i=1; i<rowCount; i++) {
			row = s.getRow(i);
			for(int j=0; j<colCount; j++) {
				data[i-1][j] = row.getCell(j).toString();
			}
		}
		return data;
	}
	
	@Test(dataProvider = "Test Data")
	public void login(String username, String password) {
		obj.username(username);
		obj.password(password);
		obj.button();
	}
}
