package myRunnerClass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(		
	    features = {".//FeatureFiles/Login.feature",
	    		    ".//FeatureFiles/Register.feature",
	    		    ".//FeatureFiles/LoginScenarioOutLine.feature",
	    		    ".//FeatureFiles/Search.feature"
	    },

		glue="stepDefination",
		dryRun=false,
		monochrome=true,
		tags= "@smoke",
		plugin= {"pretty",
		        "html:target/smoke.html",
		        "rerun:fail/onlyfaied.txt"   // RERUN__ this line is for store all fail test cases in .txt format 

				
		}
		)









public class MyRunnerClass {

}
