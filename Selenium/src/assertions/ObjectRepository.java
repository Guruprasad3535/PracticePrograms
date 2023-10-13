package assertions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ObjectRepository {
	
	@FindBy(id="username")
	private WebElement usernameTF;
	
	@FindBy(name="pwd")
	private WebElement passwordTF;
	
	@FindBy(id="loginButton")
	private WebElement loginButton;
	
	public void setUserName(String username) {
		
		usernameTF.sendKeys(username);
	}
	
	public void setPassword(String password) {
		
		passwordTF.sendKeys(password);
	}
	
	public void clickButton() {
		
		loginButton.click();
	}

}
