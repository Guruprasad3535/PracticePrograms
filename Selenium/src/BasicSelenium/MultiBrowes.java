package BasicSelenium;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiBrowes {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Welocme to browser list");
		System.out.println("1.Chrome");
		System.out.println("2.Firefox");
		System.out.println("3.Edge");
		System.out.println("\nSelect your choice");
		int choice=sc.nextInt();
		
		WebDriver drive1;
		switch (choice) {
		case 1: ChromeOptions option=new ChromeOptions();
		        option.addArguments("--remote-allow-origins=*");
			drive1=new ChromeDriver(option);
			break;
			
		case 2:drive1=new FirefoxDriver();
		break;
		
		case 3:drive1=new EdgeDriver();
		break;

		default:System.out.println("Invalid choice");
			break;
		}
	}

}
