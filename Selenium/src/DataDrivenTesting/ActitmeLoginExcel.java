package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActitmeLoginExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis = new FileInputStream("./TestData/ActitimeCredantials.xlsx");
		
		Workbook wb=WorkbookFactory.create(fis);
		
		Sheet sheet=wb.getSheet("Sheet1");
		
		DataFormatter df=new DataFormatter();
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(df.formatCellValue(sheet.getRow(0).getCell(1)));
		
		long time=Long.parseLong(df.formatCellValue(sheet.getRow(3).getCell(1)));	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
		
		String username=df.formatCellValue(sheet.getRow(1).getCell(1));
		String password=df.formatCellValue(sheet.getRow(2).getCell(1));
		
		driver.findElement(By.id("username")).sendKeys(username+Keys.TAB+password+Keys.ENTER);
		
		wb.close();
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(time));
		
		boolean val=wait.until(ExpectedConditions.titleContains("Enter Time-Track"));
		
		if (val) 
		   System.out.println("pass");
		else
			System.out.println("fail");
		
		driver.close();
	}
}
