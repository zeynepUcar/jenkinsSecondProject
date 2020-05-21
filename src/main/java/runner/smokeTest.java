package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(

        plugin={"pretty",
                "html:target/cucumber-report",
                "json:target/cucumber.json"
        },
//        plugin = {"pretty:STDOUT","html:target",
//                "json:target//cucumber.json"
//                //"com.cucumber.listener.ExtentCucumberFormatter:target//report.html"
//        },

//        if you need to run specific feature files then add tag here and in the
//          feature file then it will run those feature files
        //tags = "@SmokeTest",

//        path for the my feature Files
        features = {"src/test/java/resources"},

//        location of the step definitions
        glue={"src/test/java/stepDefinition"},

//        if the dry run is true it is making sure your feature files steps are
//          created in the step definition
        dryRun=false
)

public class smokeTest extends AbstractTestNGCucumberTests {

}
