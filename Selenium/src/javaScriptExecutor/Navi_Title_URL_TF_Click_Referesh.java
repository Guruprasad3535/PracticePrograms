package javaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Navi_Title_URL_TF_Click_Referesh {

		public static void main(String[] args) throws InterruptedException {
			
			WebDriver driver=new FirefoxDriver();
            driver.manage().window().maximize();
            
            JavascriptExecutor js=(JavascriptExecutor)driver;
            js.executeScript("window.location=arguments[0]","https://www.ebay.com/");
            
            Thread.sleep(2000);
            System.out.println(js.executeScript("return document.title"));
            System.out.println(js.executeScript("return document.URL"));
            
            Thread.sleep(2000);
            js.executeScript("history.go(0)");
            
            Thread.sleep(2000);
            WebElement element=driver.findElement(By.className("ui-autocomplete-input"));
            js.executeScript("arguments[0].value=arguments[1]",element,"smart tv");
            
            Thread.sleep(2000);
            WebElement button=driver.findElement(By.xpath("//input[@class='btn btn-prim gh-spr']"));
            js.executeScript("arguments[0].click()", button);
            
            Thread.sleep(2000);
            driver.close();
            
		}
}
