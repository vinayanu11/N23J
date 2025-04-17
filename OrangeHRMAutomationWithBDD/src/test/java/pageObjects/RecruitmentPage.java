package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RecruitmentPage extends BasePage {

	public RecruitmentPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//*[@id='app']/div[1]/div[1]/aside/nav/div[2]/ul/li[5]/a/span")
	private WebElement recruitmentItem;
	
	public void clickOnRecruitmentItem() {
		recruitmentItem.click();
	}
}
