package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.AddCustomerPage;
import page.DashboardPage;
import page.ListCustomerPage;
import page.LoginPage;
import util.BrowserFactory;

public class AddCustomerTest {

	WebDriver driver;
	
	String userName = null;
	String password = null;
	String DashboardValidationText = null;
    String addContactValidationText = null;
    String fullName = null;
    String company = null;
    String email = null;
    String phone = null;
    String address = null;
    String city = null;
    String state = null;
    String zip = null;
    String country = null;
	
	
	@Test
	public void validCustomerShouldBeAbleToCreateCustomer() throws InterruptedException {
		
		driver = BrowserFactory.init();
		
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.enterUserName(userName);
		loginPage.enterPassword(password);
		loginPage.clickSigninButton();
		
		Thread.sleep(3000);
		DashboardPage dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
		dashboardPage.varifyDashboardPage(DashboardValidationText);
		dashboardPage.clickOnCustomer();
		dashboardPage.clickOnAddCustomer();
		
		AddCustomerPage addCustomerPage = PageFactory.initElements(driver, AddCustomerPage.class);
		addCustomerPage.verifyAddContactPage(addContactValidationText);
		addCustomerPage.insertFullName(fullName);
		addCustomerPage.selectCompany(company);
		addCustomerPage.insertEmail(email);
		addCustomerPage.insertPhone(phone);	
		addCustomerPage.insertAddress(address);
		addCustomerPage.insertCity(city);
		addCustomerPage.insertState(state);
		addCustomerPage.insertZip(zip);
		addCustomerPage.selectCountry(country);
		addCustomerPage.clickSaveButton();
		
		dashboardPage.clickonListCustomers();	
		
//		addCustomerPage.validateAddedNameOnListCustomer();
		
//		ListCustomerPage listCustomerPage=PageFactory.initElements(driver, ListCustomerPage.class);
//		listCustomerPage.validateAddedNameOnListCustomer();
	}
	
	
	
	
}
