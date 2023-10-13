package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataFormatterUsage {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
//		Step 1: Convert physical file into java readable object
		FileInputStream fis = new FileInputStream("./TestData/ActitimeCredantials.xlsx");
		
//		Step 2: Open the Workbook
//		To Open Workbook we need use a method create(fis) which is present WorkbookFactory
//		IOException
		Workbook wb=WorkbookFactory.create(fis);
		
//	    Step 3: Get control over sheet
		Sheet sheet = wb.getSheet("Sheet1");
		
		DataFormatter df=new DataFormatter();
		
//		Step 4: Get control over row
		Row row=sheet.getRow(3);
		
//		Step 5: Get control over cell
		Cell cell=row.getCell(1);
		
//		Step 6: Fetch the data
		String data=df.formatCellValue(cell);
		System.out.println(data);
		
//	    Step 7: Close the workbook
		wb.close();
		
	}

}
