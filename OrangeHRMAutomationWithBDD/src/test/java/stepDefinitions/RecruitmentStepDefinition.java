package stepDefinitions;

import org.openqa.selenium.WebDriver;

import driverManager.WebDriverManager;
import io.cucumber.java.en.When;
import pageObjects.RecruitmentPage;

public class RecruitmentStepDefinition {
	WebDriver driver = WebDriverManager.getDriver();
	RecruitmentPage recruitmentPage = new RecruitmentPage(driver);
	
	@When("User clicks on Recruitment menu item")
	public void user_clicks_on_recruitment_menu_item()  {
		recruitmentPage.clickOnRecruitmentItem();
	}
}
