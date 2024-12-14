package stepDefination;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjectModel.LoginPO;

public class LoginScenarioOutline extends Base {

	
	
	
	
	  
	 

	    @Given("user navigates to the login home page")
	    public void user_navigates_to_the_login_home_page() {	
	    	 driver = new ChromeDriver();
		     login = new LoginPO(driver);
		     driver.manage().window().maximize();
		     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	         driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
	      
	    }

	    @When("user enters his email address in address field {string}")
	    public void user_enters_his_email_address_in_address_field(String email) {
	        login.enterEmailAddress(email);  // Passing the email parameter
	    }

	    @When("user enters his password in password field {string}")
	    public void user_enters_his_password_in_password_field(String password) {
	        login.enterPassword(password);  // Passing the password parameter
	    }

	    @When("user clicks on the login button")
	    public void user_clicks_on_the_login_button() {
	        login.clickTheLoginButton();  // Click the login button
	    }

	    @Then("user navigates to the inside page")
	    public void user_navigates_to_the_inside_page() throws InterruptedException {
	        Thread.sleep(1);  // Wait for a few seconds before closing the browser
	        driver.quit();
	    }
	    
	  
	    
	}

	
	


	
	

