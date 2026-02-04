package testRunner;
import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.SelectClasspathResource;
 
import io.cucumber.junit.platform.engine.Constants;
 

//for getting html report
@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("features")
@ConfigurationParameter(
  key = Constants.GLUE_PROPERTY_NAME, 
  value = "stepDefinitions"
)
@IncludeTags("activity5")
@ConfigurationParameter(
  key = Constants.PLUGIN_PROPERTY_NAME,
  value = "html:test-output/cucumber-reports/Cucumber.html"
)
 
public class ActivitiesRunner2 {
    
}
