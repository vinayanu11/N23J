package stepDefinitions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import driverManager.WebDriverManager;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {
	
	
	final private static Logger logs=LogManager.getLogger(Hooks.class);
	@Before
    public void setUp(Scenario scenario) {
        // This will initialize the WebDriver before each scenario
		//logs.info("Starting the scenario"+scenario.getName());
		logs.debug("Starting the scenario"+scenario.getName());
		        WebDriverManager.getDriver();
		logs.info("Chrome browser launched sucessfully");     
    }

    @After
    public void tearDown() {
        // This will close the WebDriver after each scenario
    	
        WebDriverManager.closeDriver();
    }
    
    @AfterStep
    public void AddScreenshot(Scenario scenario) throws IOException
    {
    	
          WebDriver driver=WebDriverManager.getDriver();
          byte[] fileContent=null;
          boolean scenario_status=scenario.isFailed();
          System.out.println("status is failed"+scenario_status);
         File sourcePath=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
  		fileContent =FileUtils.readFileToByteArray(sourcePath);
    	if(scenario.isFailed())
    	{
    		logs.error("scenario failed"+scenario.getName());
    		scenario.attach(fileContent,"image/png", "Failed Step Screenshot");
    	}
//    	else {
//            scenario.attach(fileContent, "image/png", "Step Screenshot");
//    	}
          
    }
}
    
    


