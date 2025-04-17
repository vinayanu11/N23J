package pageObjects;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class AdminPage extends BasePage {
	public AdminPage(WebDriver driver) {
		super(driver);
	}
		@FindBy(xpath = "//span[normalize-space()='Admin']")
		private WebElement adminItem;
			
		@FindBy(xpath = "//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']")
		private WebElement usernametxtbx;
		
		@FindBy(xpath = "//div[@class='oxd-table-filter-area']//div[2]//div[1]//div[2]//div[1]//div[1]//div[2]//i[1]")
		private WebElement userRoleDrpdwn;
		@FindBy(xpath = "//span[contains(text(),'Admin')]")
		private WebElement admin;
		@FindBy(xpath = "//span[normalize-space()='ESS']")
		private WebElement ESS;
		@FindBy(xpath = "//input[@placeholder='Type for hints...']")
		private WebElement employeeName;
		@FindBy(xpath = "(//div[@class='oxd-select-text-input'][normalize-space()='-- Select --'])[1]")
		private WebElement statusDrpdwn;
		@FindBy(xpath = "//span[normalize-space()='Enabled']")
		private WebElement statusEnabled;
		@FindBy(xpath = "//button[normalize-space()='Search']")
		private WebElement searchBtn;
		@FindBy(xpath = "//div[@class='oxd-table-body']//div[@class='oxd-table-card']//div[2]")
		private WebElement adminUser;
		@FindBy(xpath = "//div[@class='oxd-table-body']")
		private WebElement tableBody;
		
		 @FindBy(xpath = "//div[@class='oxd-table-body']/div[@class='oxd-table-card']")
		    private List<WebElement> rows;
		 @FindBy(xpath = "//div[@role='columnheader'][3]")
		    private List<WebElement> userRoleColumn;
		 @FindBy(xpath = "//div[@role='columnheader'][5]")
		    private List<WebElement> userStatusColumn;
		 @FindBy(xpath = "//i[@class='oxd-icon bi-plus oxd-button-icon']")
		 private WebElement addBtn;
		 @FindBy(xpath = "//div[@class='oxd-select-text oxd-select-text--focus']//div[@class='oxd-select-text-input'][normalize-space()='-- Select --']")
		 private WebElement selectDpdwn;
		 @FindBy(xpath = "//span[contains(text(),'Admin')]")
		 private WebElement adminDpdwn;
		 @FindBy(xpath = "//div[@class='oxd-grid-item oxd-grid-item--gutters user-password-cell']//div[@class='oxd-input-group oxd-input-field-bottom-space']//input[@type='password']")
		 private WebElement pswd;
		 @FindBy(xpath = "//div[@class='oxd-autocomplete-text-input oxd-autocomplete-text-input--focus']")
		 private WebElement empName;
		 @FindBy(xpath = "//input[@class='oxd-input oxd-input--active oxd-input--error']")
		 private WebElement uName;
		public void clickOnAdminItem()  {
			adminItem.click();
					}
		public void enterUserName(String username) {
			
			usernametxtbx.sendKeys(username);
		}
		public void searchAdminUser() throws InterruptedException
		{
			Thread.sleep(5000);
			userRoleDrpdwn.click();
			admin.click();
			
			
		}
		public void searchESSUser() throws InterruptedException
		{
			Thread.sleep(5000);
			userRoleDrpdwn.click();
			//Thread.sleep(5000);
			ESS.click();
			
			
		}
		public void enterEmployeeName(String expectedUsername) {
			employeeName.sendKeys(expectedUsername);
			
		}
		public void statusDropdwn() {
			statusDrpdwn.click();
		    statusEnabled.click();
		}
		public void clickOnSearchBtn()
		{
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			wait.until(ExpectedConditions.elementToBeClickable(searchBtn));
			searchBtn.click();
		}
		public List<WebElement> getAllRows() {
	        return rows;
	    }

	    // Print table data
	    public void printWebTableData() {
	        for (WebElement row : rows) {
	            System.out.println(row.getText());
	        }
	    }
	    public boolean isAdminUserDisplayed(String expectedUsername) {
	  	        for (WebElement row : rows) {
	            if (row.getText().contains(expectedUsername)) {
	            	System.out.println(expectedUsername);
	                return true;
	            }
	        }
	        return false;
	    }
	    

	    public int getESSUserCount() {
	        return userRoleColumn.size();
	    }

	    public boolean validateESSAndEnabledUsers() {
	    	for (WebElement row : rows) {
	            if (row.getText().contains("ESS")&&row.getText().contains("Enabled")){
		                return true;
	            }
	        }
	    	return false;
	    }
	    }

 