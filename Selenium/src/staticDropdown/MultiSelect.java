package staticDropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class MultiSelect {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement dropdown=driver.findElement(By.id("cars"));
		
		Select drop=new Select(dropdown);
		
		if(drop.isMultiple())
			System.out.println("Multi select");
		else
			System.out.println("single select");
		
		drop.selectByIndex(0);
		Thread.sleep(2000);
		drop.selectByIndex(1);
		drop.selectByIndex(2);
		
		Thread.sleep(2000);
		System.out.println(drop.getFirstSelectedOption().getText());
		
		List<WebElement> element=drop.getAllSelectedOptions();
		for (WebElement e : element) {
			System.out.println(e.getText());
		}
		Thread.sleep(2000);
		drop.deselectByIndex(0);
		Thread.sleep(2000);
		drop.deselectByIndex(1);
		drop.deselectByIndex(2);
		
		Thread.sleep(2000);
		drop.selectByIndex(0);
		drop.selectByIndex(1);
		drop.selectByIndex(2);
		
		Thread.sleep(2000);
		drop.deselectAll();
		
		driver.close();
		Thread.sleep(2000);
	}
}
