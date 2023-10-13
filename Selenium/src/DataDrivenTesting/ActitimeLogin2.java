package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

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

public class ActitimeLogin2 {
	
	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		Map<String, String> map=readDataFromExcel();
		
		driver.get(map.get("url"));
		long time = Long.parseLong(map.get("time"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
		
		driver.findElement(By.id("username")).sendKeys(map.get("username")+Keys.TAB+map.get("password")+Keys.ENTER);
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(time));
		boolean val=wait.until(ExpectedConditions.titleContains("Enter Time-Track"));
		
		if (val) 
			 System.out.println("pass");
	    else
		    System.out.println("fail");
			
			driver.close();
	}
	
	public static Map<String, String> readDataFromExcel()
	{
		FileInputStream fis=null;
		try {
			fis=new FileInputStream("./TestData/ActitimeCredantials.xlsx");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		Workbook wb=null;
		try {
			wb=WorkbookFactory.create(fis);
		} catch (EncryptedDocumentException | IOException e) {
			e.printStackTrace();
		}
		
		Sheet sheet=wb.getSheet("Sheet1");
		
		Map<String,String> map=new HashMap();
		DataFormatter df=new DataFormatter();
		
		for (int i = 0; i <= sheet.getLastRowNum(); i++) {
			
			String key=df.formatCellValue(sheet.getRow(i).getCell(0));
			String value=df.formatCellValue(sheet.getRow(i).getCell(1));
			
			map.put(key, value);
			
		}
		
		return map;
	}

}
