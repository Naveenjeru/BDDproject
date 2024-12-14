package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPO {
	
	WebDriver driver;
	public LoginPO(WebDriver ldriver) {
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="input-email") WebElement email;
	public void enterEmailAddress(String mail) {
		email.sendKeys(mail);
		
	}
	@FindBy(id="input-password") WebElement password;
	public void enterPassword(String pass) {
		password.sendKeys(pass);
	}
	@FindBy(xpath="//input[@class='btn btn-primary']") WebElement loginButton;
	public void clickTheLoginButton() {
		loginButton.click();
	}
	
	
	
	
	

}
