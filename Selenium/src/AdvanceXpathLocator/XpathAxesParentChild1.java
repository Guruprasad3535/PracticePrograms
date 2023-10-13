package AdvanceXpathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathAxesParentChild1 {
	
	
public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//ul/child::li/child::a[contains(text(),'Selenium')]")).click();
		Thread.sleep(3000);
		String s=driver.findElement(By.xpath("//p/parent::div/child::p/child::a[text()='API Docs']")).getText();
		
		System.out.println("Selenium course fee: "+s);
		driver.close();
		
/*  To traverse from Ruby to API Docs
 *       //p/parent::div/child::p/child::a[text()='API Docs']
 */
         
/*	 To traverse RishabPanth Rating in Test
 *         //a[text()='Rishabh Pant']/parent::td/parent::tr/child::td[4]
 */
		
/*	 To traverse for total collection
 *         //b[text()='KGF 2 ( All Languages)']/parent::a/parent::td/parent::tr/child::td[2]
 */
		//b[text()='RRR( All Languages)']/parent::a/parent::td/parent::tr/parent::tbody/child::tr/child::td[text()='All Time Block Buster']
	}

}
