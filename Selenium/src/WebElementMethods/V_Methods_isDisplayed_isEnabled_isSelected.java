package WebElementMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class V_Methods_isDisplayed_isEnabled_isSelected {
	
	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//      isDisplayed
		
		WebElement logo=driver.findElement(By.xpath("//img[@alt='Facebook']"));
		
		if(logo.isDisplayed())
			System.out.println("Logo Displayed");
		else
			System.out.println("Logo Not-Displayed");
		
//		isEnbaled
		
		WebElement button=driver.findElement(By.xpath("//button"));
		
		if(button.isEnabled())
			System.out.println("button is enbaled");
		else
			System.out.println("button is disabaled");
		
//		isSelected
		
		driver.findElement(By.linkText("Create new account")).click();
		WebElement gender=driver.findElement(By.xpath("//label[text()='Female']/following-sibling::input"));
		
		gender.click();
		
		if(gender.isSelected())
			System.out.println("gender is selected");
		else
			System.out.println("gender is not selected");
		
		driver.close();
		
		
		
	}

}
