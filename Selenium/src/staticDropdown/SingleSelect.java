package staticDropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class SingleSelect {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement dropdown=driver.findElement(By.id("searchDropdownBox"));
		
		Select drop=new Select(dropdown);
		
        List<WebElement> dropdownList=drop.getOptions();
		
		for (WebElement e : dropdownList) {
			System.out.println(e.getText());
		}
		
		if(drop.isMultiple())
			System.out.println("is multiple select");
		else
			System.out.println("is single select");
		
		Thread.sleep(2000);
		drop.selectByIndex(0);
		Thread.sleep(2000);
		drop.selectByValue("search-alias=kitchen-intl-ship");
		Thread.sleep(2000);
		drop.selectByVisibleText("Books");
		Thread.sleep(2000);
		driver.close();
		
	}
}
