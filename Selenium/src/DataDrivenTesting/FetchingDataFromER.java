package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FetchingDataFromER {

   public static void main(String[] args) throws IOException {
	
//		Step 1: Bring file into java 
//	   it throws FileNotException
		FileInputStream fis=new FileInputStream("./TestData/data.properties");
		
//		Step 2: Create instance for properties class
		Properties property=new Properties();
		
//		Step 3: Copy the file from the fis
//		it throws the IOException
		property.load(fis);
		
//		Step 4: Fetch the data from file
		String browser=property.getProperty("browser");
		String timeout=property.getProperty("timeout");
		String url=property.getProperty("URL");
		String UN=property.getProperty("UN");
		String passw=property.getProperty("PWD");
		
		System.out.println(browser+"\n"+timeout+"\n"+url+"\n"+UN+"\n"+passw);
		
}
}
