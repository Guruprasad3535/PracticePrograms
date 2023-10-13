package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataEnterIntoExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis=new FileInputStream("./TestData/ActitimeCredantials.xlsx");
		
		Workbook wb=WorkbookFactory.create(fis);
		
		Sheet sheet=wb.getSheet("Sheet1");
		
		Row row=sheet.getRow(4);
		
		Cell cell=row.createCell(0);
		
		cell.removeCellComment();
		
		cell.setCellValue("hi");
		
//		row.createCell(1).setCellValue("Shrivalli");
//		
//		row.createCell(2).setCellValue("madam");
		
		FileOutputStream fos=new FileOutputStream("./TestData/ActitimeCredantials.xlsx");
		
		wb.write(fos);
		
		wb.close();
	}
}
