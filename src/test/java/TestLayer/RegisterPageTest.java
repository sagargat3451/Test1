package TestLayer;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseLayer.BaseClass;
import PageLayer.RegisterPage;

public class RegisterPageTest extends BaseClass{

	@BeforeTest
	public static void setUp() {
		inirialize();
	}
	
	@Test
	public void validateRegisterFunctionality() {
		RegisterPage registerpage = new RegisterPage();
		
		registerpage.contactInfoFunctionality("Sagar", "Gat", "7666919222", "sagar@gmail.com");
		registerpage.mailingInfoFunctionality("Pune", "hadapsar", "MH", "411028", "INDIA");
		registerpage.userInfoFunctionality("sagar", "sagar123", "sagar123");
		
	}
	
	@AfterTest
	public void tearDown() {
		driver.close();
		
	}
}
