package WebDriverMethods;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Method_Flipkart {

	public static void main(String[] args) throws InterruptedException {
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.get("https://www.flipkart.com/");
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		String title=driver.getTitle();
		System.out.println(title);
		
		System.out.println(driver.getPageSource());
		Thread.sleep(2000);
		driver.close();
		
		
		
		

	}

}
