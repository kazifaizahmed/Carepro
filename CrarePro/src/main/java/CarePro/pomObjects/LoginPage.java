package CarePro.pomObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import CarePro.abstractComponent.AbstractComponent;

public class LoginPage extends AbstractComponent {
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//select[@placeholder='Enter Province']")
	WebElement provinceBtn;
	@FindBy(xpath = "//select[@placeholder='Enter District']")
	WebElement districtBtn;
	@FindBy(xpath = "//input[@placeholder='Search facility']")
	WebElement facultyBtn;
	@FindBy(xpath = "//button[normalize-space()='Enter']")
	WebElement enterBtn;
	@FindBy(xpath = "//button[normalize-space()='NRC']")
	WebElement nrcBtn;
	@FindBy(xpath = "//input[@placeholder='Search by NRC']")
	WebElement nrcnumBtn;
	@FindBy(xpath = "//button[@type='submit']")
	WebElement searchBtn;
	@FindBy(xpath = "//button[normalize-space()='Attend to Patient']")
	WebElement attentTopatient;;
	@FindBy(xpath = "//body/div[@id='root']/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/a[1]/div[1]")
	WebElement vitalBtn;


	public void selectFaculty() throws InterruptedException {
		Thread.sleep(3000);
		provinceBtn.click();
		Thread.sleep(4000);
		districtBtn.click();
		Thread.sleep(4000);
		facultyBtn.click();
		Thread.sleep(4000);
		enterBtn.click();
		Thread.sleep(2000);
		nrcBtn.click();
		Thread.sleep(1000);
		nrcnumBtn.sendKeys("111111111");
		Thread.sleep(2000);
		searchBtn.click();
		Thread.sleep(2000);
		attentTopatient.click();
		Thread.sleep(2000);
		vitalBtn.click();


	}

	@FindBy(css = "button[class='flex gap-1 items-center text-[11px] 2xl:text-[13px] bg-primaryColor hover:bg-primaryHover px-4 py-2 2xl:py-2 rounded-full text-whiteColor']")
	WebElement addVitalBtn;
	@FindBy(xpath = "//input[@placeholder='Enter Temperature (c)']")
	WebElement temperatureBtn;
	@FindBy(xpath = "//input[@placeholder='Enter Systolic (mmHg)']")
	WebElement systolicBtn;

	public void patientInfo() throws InterruptedException {
		Thread.sleep(8000);
		addVitalBtn.click();
		Thread.sleep(1000);
		temperatureBtn.sendKeys("30");
		Thread.sleep(1000);
		systolicBtn.sendKeys("72");

	}
	

}
