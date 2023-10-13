package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimeLoginPage {

//	Declaration
	@FindBy(className="atLogoImg")
	private WebElement logo;
	
	@FindBy(id="username")
	private WebElement usernameTF;
	
	@FindBy(name="pwd")
	private WebElement passwordTF;
	
	@FindBy(id="keepLoggedInCheckBox")
	private WebElement keepMeLoggedin;
	
	@FindBy(id="loginButton")
	private WebElement loginButton;
	
	@FindBy(linkText="Forgot your password?")
	private WebElement forgotPasswordLink;
	
	public ActiTimeLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
//	Utilization
	
	public WebElement getLogo() {
		return logo;
	}
	
	public void setPassword(String pwd) {
		passwordTF.sendKeys(pwd);
	}
	
	public void setUsername(String username) {
		usernameTF.sendKeys(username);
	}
	
	public void clickLogin() {
		loginButton.click();
	}
	
	public void clickForgotPass() {
		forgotPasswordLink.click();
	}
	
	public void selectCheckbox() {
		keepMeLoggedin.click();
	}
	
}
