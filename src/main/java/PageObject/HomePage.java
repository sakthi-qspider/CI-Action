package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.PageAction;

public class HomePage {

	public WebDriver driver;
	PageAction page;

	@FindBy(xpath="//div[@class='main-navigation']//a[text()='Automobile']")
	WebElement automobile;

	public HomePage(WebDriver driver) throws Exception, Exception {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		page =new PageAction(driver);
	}

	public void clickAutomobile() throws Exception {
		Thread.sleep(3000);
	   page.clickElement(automobile);


	}

}
