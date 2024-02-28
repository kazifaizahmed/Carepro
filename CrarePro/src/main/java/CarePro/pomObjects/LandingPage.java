package CarePro.pomObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import CarePro.abstractComponent.AbstractComponent;

public class LandingPage extends AbstractComponent {
	WebDriver driver;

	public LandingPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void getURL() {
		driver.get("https://carepro-training.ihmafrica.com/");
	}

	@FindBy(xpath = "//input[@placeholder='Enter Your Username']")
	WebElement email;

	@FindBy(xpath = "//input[@placeholder='Enter Your Password']")
	WebElement password;

	@FindBy(xpath = "//button[normalize-space()='Sign In']")
	WebElement submit;

	public LoginPage loginProcess() {
		email.sendKeys("tester");
		password.sendKeys("tester2023!");
		submit.click();
		LoginPage loginPage = new LoginPage(driver);
		return loginPage;
	}
}