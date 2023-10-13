package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class DataUpdateIntoFile {
	
	public static void main(String[] args) throws IOException {
		
		FileInputStream fis=new FileInputStream("./TestData/data.properties");
		
		Properties property=new Properties();
		
		property.load(fis);
		
		property.put("username","guruprasad");
		property.put("password", "GurrPrasad");
		
		FileOutputStream fos=new FileOutputStream("./TestData/data.properties");
		property.store(fos,"update successfully");
		
		
				
	}

}
