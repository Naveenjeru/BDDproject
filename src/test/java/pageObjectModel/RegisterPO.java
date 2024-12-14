package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPO {
	WebDriver driver;
	public RegisterPO(WebDriver ldriver) {
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="input-firstname") WebElement firstname;
	public void enterFirstName(String first) {
		firstname.sendKeys(first);
	}
	
	@FindBy(id="input-lastname") WebElement lastname;
	public void enterLastName(String last) {
		lastname.sendKeys(last);
	}
	@FindBy(id="input-email") WebElement email;
	public void enterEmailAddress(String mail) {
		email.sendKeys(mail);
	}
	@FindBy(id="input-telephone") WebElement telephone;
	public void enterTelephoneNumber(String phone) {
		telephone.sendKeys(phone);
	}
	
	@FindBy(id="input-password") WebElement password;
	public void enterPasswordFiled(String pass) {
		password.sendKeys(pass);
	}
	
	@FindBy(id="input-confirm") WebElement repassword;
	public void enterRePasswordFiled(String pass1) {
		repassword.sendKeys(pass1);
	}
	@FindBy(xpath="//input[@name='agree']") WebElement privacyPolocy;
	public void clickThePrivacyPolocy() {
		privacyPolocy.click();
	}
	@FindBy(xpath="//input[@value='Continue']") WebElement continuebutton;
	public void clickTheContinueButton() {
		continuebutton.click();
	}
	
	
	

}
