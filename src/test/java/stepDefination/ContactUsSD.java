package stepDefination;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjectModel.ContactusPO;

public class ContactUsSD {
WebDriver driver;
ContactusPO contact;

	
	@Given("user navigates to the contact us page")
	public void user_navigates_to_the_contact_us_page() {
		   driver=new ChromeDriver();
		   contact=new ContactusPO(driver);
		   driver.get("https://tutorialsninja.com/demo/index.php?route=information/contact");
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@When("user enters their name {string}")
	public void user_enters_their_name(String string) {
	contact.enterName("Naveen");
		
	}

	@When("user enters their email address {string}")
	public void user_enters_their_email_address(String string) {
	 contact.enterEmailAddress("shivalaptop1@gmail.com");
	}

	@When("user fills the enquiry message with {string}")
	public void user_fills_the_enquiry_message_with(String string) {
	 contact.enterEnqiryMessage("abcdefhjikiojijijijijjijijijijijjijijijijijijiijijdeedefrncksospkdpqws");
	}

	@Then("user clicks the submit button")
	public void user_clicks_the_submit_button() throws InterruptedException {
		contact.clickTheSubmitButton();
		Thread.sleep(1000);
	 driver.quit();
	}

	@When("user leaves the name field empty")
	public void user_leaves_the_name_field_empty() {
	 contact.enterName("");
	}

	@When("user enter an invalid email address {string}")
	public void user_enter_an_invalid_email_address(String string) {
	  contact.enterEmailAddress("kjkjkjkjkjkj@gmail.com");
	}




	
	
	
}
