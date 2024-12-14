package myRunnerClass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(		
	    features = ".//fail/onlyfaied.txt",

		glue="stepDefination",
		dryRun=false,
		monochrome=true,
		//tags= "@regression",
		plugin= {"pretty",
		        "html:target/onlyfail.html",
		      

				
		}
		)











public class ReRun {

}
