package CarePro.test;

import CarePro.pomObjects.LoginPage;
import CarePro.testComponent.BaseTest;

public class Test extends BaseTest {
	@org.testng.annotations.Test
	public void SupplierDocumentation() throws InterruptedException {

		LoginPage loginPage = lpage.loginProcess();
		loginPage.selectFaculty();
		loginPage.patientInfo();

	}






}