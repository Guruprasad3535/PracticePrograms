package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class MethodChaining {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis=new FileInputStream("./TestData/ActitimeCredantials.xlsx");
		
		Workbook wb=WorkbookFactory.create(fis);
		
		DataFormatter df=new DataFormatter();
		
		String data=df.formatCellValue(wb.getSheet("sheet1").getRow(3).getCell(1));
		
		System.out.println(data);
		
		wb.close();
	}
	
	
	
}
