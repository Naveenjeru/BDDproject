package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPO {
	
	WebDriver driver;
	public SearchPO(WebDriver ldriver) {
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@name='search']") WebElement search;
	public void enterTheSearchFiled(String s) {
		search.sendKeys(s);
	}
	
	@FindBy(xpath="//button[@class='btn btn-default btn-lg']") WebElement searchButton;
	public void clickTheSearchButton() {
		searchButton.click();
	}
	
	
	
	
	

}
