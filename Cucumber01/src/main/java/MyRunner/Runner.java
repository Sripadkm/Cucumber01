package MyRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(
   //path of the feature file
   features = "E:/Sripad Kulkarni/Sripad_Eclipse_projects/Cucumber01/Features",
   //path of the step definition file
   glue = "StepDefinitions"
   ,
   monochrome=true,
  plugin = {"pretty","html:target/HtmlReports/HtmlReports.html",
		  "json:target/JsonReports/JsonReports.json",
 "junit:target/JunitReports/XmlReports.xml"}
   )

public class Runner {

}
