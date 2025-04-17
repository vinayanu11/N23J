package stepDefinitions;
import static org.junit.Assert.assertEquals;
import org.openqa.selenium.WebDriver;

import driverManager.WebDriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginPage;
import pageObjects.RecruitmentPage;


public class LoginStepDefinition {
	
		
	WebDriver driver = WebDriverManager.getDriver();
	LoginPage loginPage = new LoginPage(driver);
		
	@Given("user navigated to OrangeHRM Login page")
	public void user_navigated_to_orange_hrm_login_page() {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	@When("user enters Username")
	public void user_enters_username() {
		loginPage.enterUserName("Admin");
	}
	
	@When("user enters Password")
	public void user_enters_password() {
		loginPage.enterPassword("admin123");
	}
	
	@When("user clicks on Login button")
	public void user_clicks_on_login_button() {
		loginPage.clickOnLogin();
	}
	
	@Then("user should able to see Dashboard URL")
	public void user_should_able_to_see_dashboard_url() throws InterruptedException {
		Thread.sleep(5000);
		String expected_url = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index1";
		String actual_url = driver.getCurrentUrl();
		assertEquals("Login failed", expected_url, actual_url);
		
		
	}
	
	@When("user enters Username {string}")
	public void user_enters_username(String username) {
		loginPage.enterUserName(username);
	}
	
	@And("user enters Password {string}")
	public void user_enters_password(String password) {
		loginPage.enterPassword(password);
	}
}
