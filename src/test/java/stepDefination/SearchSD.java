package stepDefination;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjectModel.SearchPO;

public class SearchSD {
	
	WebDriver driver;
	SearchPO search;
	
	@Before
	public void setup() {
		 driver=new ChromeDriver();
		   search=new SearchPO(driver);
		
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
	@Given("user navigates to the home page")
	public void user_navigates_to_the_home_page() {
		
		   driver.get("https://tutorialsninja.com/demo/index.php?route=product/search");
		
	}

	@When("user searches for the valid product {string}")
	public void user_searches_for_the_valid_product(String string) {
	search.enterTheSearchFiled("laptop");
	}

	@When("clicks the search button")
	public void clicks_the_search_button() {
	 search.clickTheSearchButton();
	}

	@Then("laptop products are displayed in the search results")
	public void laptop_products_are_displayed_in_the_search_results() throws InterruptedException {
	  Thread.sleep(2);
	  driver.quit();
	}

	@When("user searches for the non-existent product {string}")
	public void user_searches_for_the_non_existent_product(String string) {
	   search.enterTheSearchFiled("car");
    

	}

	@Then("no products are displayed")
	public void no_products_are_displayed() throws InterruptedException {
	 Thread.sleep(2);
	 driver.quit();
	}

	@When("user searches for the product {string}")
	public void user_searches_for_the_product(String string) {
	  search.enterTheSearchFiled("#$%^&*tablet");
	  
	}
	
	
	@After
	public void teardown(Scenario sc) throws IOException {
		
		// test
		if (sc.isFailed()) {
		    // Get screenshot from driver
		    TakesScreenshot ts = (TakesScreenshot) driver;
		    byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);
		    String screenshotName = "Screenshot_" + System.currentTimeMillis() + ".png"; // Unique name based on timestamp
		    sc.attach(screenshot, "image/png", screenshotName);
		    File screenshotFile = ts.getScreenshotAs(OutputType.FILE);
		    File destinationPath = new File(".//sc/" + screenshotName);
		    FileUtils.copyFile(screenshotFile, destinationPath);
		    sc.log("Screenshot saved as: " + screenshotName);
		}

		
		
		
		
		
		//test
		
		
		
		
		
		
		
		
		
		
		
		
		
	}}

