package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactusPO {
	WebDriver driver;
	public ContactusPO(WebDriver ldriver) {
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="input-name") WebElement name;
	public void enterName(String n)
	{
		name.sendKeys(n);
	}
	
	@FindBy(id="input-email") WebElement email;
	public void enterEmailAddress(String e) {
		email.sendKeys(e);
	}
	@FindBy(id="input-enquiry") WebElement enquiry;
	public void enterEnqiryMessage(String en) {
		enquiry.sendKeys(en);
	}
	@FindBy(xpath="//input[@value='Submit']") WebElement submit;
	public void clickTheSubmitButton() {
		submit.click();
	}
	
	
	
	
}
