package driverManager;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverManager {
	 private static WebDriver driver;

	    private WebDriverManager() {
	        // private constructor to prevent instantiation
	    }

	    public static WebDriver getDriver() {
	        if (driver == null) {
	            // Initialize the WebDriver here
	            driver = new ChromeDriver();
	            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	            driver.manage().window().maximize();
	        }
	        return driver;
	    }

	    public static void closeDriver() {
	        if (driver != null) {
	            driver.quit();
	            driver = null;
	        }
	    }
}
