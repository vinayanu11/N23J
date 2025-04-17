package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//input[@placeholder='Username']")
	private WebElement usernametxtbx;
	
	@FindBy(xpath = "//input[@placeholder='Password']")
	private WebElement passwordtxtbx;
	
	@FindBy(tagName = "button")
	private WebElement loginBtn;
	
	public void enterUserName(String username) {
		usernametxtbx.sendKeys(username);
	}
	
	public void enterPassword(String password) {
		passwordtxtbx.sendKeys(password);
	}
	
	public void clickOnLogin() {
		loginBtn.click();
	}

}
