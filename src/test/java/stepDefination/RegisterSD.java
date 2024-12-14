package stepDefination;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import pageObjectModel.RegisterPO;

public class RegisterSD {
	WebDriver driver;
	RegisterPO register;
@Given("user navigates to the register page")
public void user_navigates_to_the_register_page() {
	   driver=new ChromeDriver();
	   register=new RegisterPO(driver);
	   driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}

@When("user enters their first name {string}")
public void user_enters_their_first_name(String string) {
  register.enterFirstName("jeru");
}

@When("user enters their last name {string}")
public void user_enters_their_last_name(String string) {
   register.enterLastName("Bandi");
}

@When("user enters their valid email address {string}")
public void user_enters_their_valid_email_address(String string) {
 register.enterEmailAddress("shiva2lap@gmail.com");
 System.out.println(10 / 0);
}

@When("user enters their telephone number {string}")
public void user_enters_their_telephone_number(String string) {
  register.enterTelephoneNumber("1212121212");
}

@When("user enters their password {string}")
public void user_enters_their_password(String string) {
register.enterPasswordFiled("12345");
}

@When("user enters their confirm password {string}")
public void user_enters_their_confirm_password(String string) {
  register.enterRePasswordFiled("12345");
}

@When("user clicks the privacy policy")
public void user_clicks_the_privacy_policy() {
  register.clickThePrivacyPolocy();
}

@When("user clicks the continue button")
public void user_clicks_the_continue_button() {
 register.clickTheContinueButton();
}

@Then("user successfully opens their account")
public void user_successfully_opens_their_account() throws InterruptedException {
    Thread.sleep(200);
    driver.quit();
}

@Then("user is shown an error message indicating that the passwords do not match")
public void user_is_shown_an_error_message_indicating_that_the_passwords_do_not_match() throws InterruptedException {
   Thread.sleep(200);
   driver.quit();
}

@When("user enters an invalid email address {string}")
public void user_enters_an_invalid_email_address(String string) {
   register.enterEmailAddress("wrongEmailAddress@gmail.com");
}

@Then("user is shown an error message indicating that the email address is invalid")
public void user_is_shown_an_error_message_indicating_that_the_email_address_is_invalid() throws InterruptedException {
   Thread.sleep(2);
   driver.quit();
}

@When("user does not click on the privacy policy checkbox")
public void user_does_not_click_on_the_privacy_policy_checkbox() {
  register.clickThePrivacyPolocy();
  register.clickThePrivacyPolocy();
}

@Then("user is shown an error message indicating that the privacy policy must be accepted")
public void user_is_shown_an_error_message_indicating_that_the_privacy_policy_must_be_accepted() throws InterruptedException {
	Thread.sleep(2);
	driver.quit();
}






}
