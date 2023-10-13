package WindowManagment;

import org.openqa.selenium.firefox.FirefoxDriver;

public class BlueStone {
	
	public static void main(String[] args) throws InterruptedException {
		
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		
		Thread.sleep(2000);
		driver.manage().window().minimize();
		
//		Thread.sleep(2000);
//		driver.manage().window().fullscreen();
	}
	
	

}
