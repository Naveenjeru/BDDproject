package stepDefination;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import pageObjectModel.LoginPO;

public class LoginSD {
	WebDriver driver;
	LoginPO login;
	
	
	
	@Given("the user navigates to the login page")
	public void the_user_navigates_to_the_login_page() {
	   driver=new ChromeDriver();
	   login=new LoginPO(driver);
	   driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@When("the user enters valid username {string}")
	public void the_user_enters_valid_username(String string) {
		login.enterEmailAddress("shiva1lap@gmail.com");
	}

	@When("the user enters valid password {string}")
	public void the_user_enters_valid_password(String string) {
	   login.enterPassword("12345");
	}

	@When("the user clicks the login button")
	public void the_user_clicks_the_login_button() {
	   login.clickTheLoginButton();
	}

	@Then("the user successfully navigates to the home page")
	public void the_user_successfully_navigates_to_the_home_page() throws InterruptedException {
		Thread.sleep(100);
	   System.out.println("user succesfully loged in");
	   driver.quit();
	}

	@When("the user enters invalid username {string}")
	public void the_user_enters_invalid_username(String string) {
	   login.enterEmailAddress("qwqw@gmail.com");
	}

	@When("the user enters invalid password {string}")
	public void the_user_enters_invalid_password(String string) {
	 login.enterPassword("oioioo");

	}

	@Then("user will see the error meassage")
	public void user_will_see_the_error_meassage() throws InterruptedException {
	   Thread.sleep(100);
	   System.out.println("user still login page");
	     driver.quit();
	}

	@When("the user leaves the username field empty")
	public void the_user_leaves_the_username_field_empty() {
	  login.enterEmailAddress("");
	}

	@When("the user leaves the password field empty")
	public void the_user_leaves_the_password_field_empty() {
	  login.enterPassword("");
	}

	
	
	

}
