package stepDefinitions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import driverManager.WebDriverManager;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pageObjects.AdminPage;

public class AdminStepDefinition {
	final private static Logger logs=LogManager.getLogger(AdminStepDefinition.class);
	WebDriver driver = WebDriverManager.getDriver();
	AdminPage adminPage=new AdminPage(driver);
	
	
	
	@When("User clicks on Admin menu item")
	public void user_clicks_on_admin_menu_item() throws InterruptedException {
	  	 adminPage.clickOnAdminItem();
	  	 logs.info("clicked on admin item");
	}
	@When("User enters username")
	public void User_enters_username()  {
	  	 adminPage.enterUserName("Admin");
	  	logs.info("entered username");
	}
	
	@When("Click on dropdown and select admin")
	public void Click_on_dropdown_and_select_admin() throws InterruptedException {
	  	 adminPage.searchAdminUser();
	  	logs.info("search for ");
	  	
	  	//adminPage.clickOnSearchBtn();
	  	adminPage.enterEmployeeName("Leonardo  Alves de Almeida");
	  	adminPage.statusDropdwn();
	}
	
	@When("Click on dropdown and select ESS")
	public void SelectESSUser() throws InterruptedException {
		adminPage.searchESSUser();
		
	}
	@When("Click on Search button")
	public void Click_on_searchBtn() {
	  	  	
	  	adminPage.clickOnSearchBtn();
	}
	@Then("User should see {string} in the table")
	public void validate_User(String username) {
		adminPage.printWebTableData();
		boolean userFound = adminPage.isAdminUserDisplayed(username);
	 	assertEquals("Admin user not found in the web table", username, userFound );
	     
	}
	
	@When("Select Status Enabled")
	public void Select_Status_Enabled() {
		adminPage.statusDropdwn();
		
	     
	}
	
    @Then("User should see {string}  and {string}in the table")
    public void Validate_both_ESS_and_Enabled_Status(String role, String status)
    {
    	assertTrue("Filtered results do not match expected ESS and Enabled users!", 
                adminPage.validateESSAndEnabledUsers());
    	
    }
}
	
	