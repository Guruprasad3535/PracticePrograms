package assertions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardAssert extends BaseClass {

	@Test
	public void login() throws InterruptedException {
		
		SoftAssert soft=new SoftAssert();
		ObjectRepository elements=new ObjectRepository();
		
		driver.get(fetchData("url"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		System.out.println(fetchData("un"));
		System.out.println(fetchData("pas"));
		Thread.sleep(2000);
		elements.setUserName(fetchData("username"));
		elements.setPassword(fetchData("password"));
		
		elements.clickButton();
		
		Thread.sleep(3000);
	    String s= driver.getTitle();
	    String s1="actiTIME - Enter Time-Track";
	    soft.assertEquals(s,s1);
	    System.out.println(s);
	    Thread.sleep(2000);
		driver.close();
		
		soft.assertAll();
	}
	
	public String fetchData(String key) {
		
		
		FileInputStream fis=null;
		
		try {
			fis=new FileInputStream("./TestData/data.properties");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		Properties property=new Properties();
		
		try {
			property.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return property.getProperty(key);
	}
}
