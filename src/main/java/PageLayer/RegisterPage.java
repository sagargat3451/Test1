package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import BaseLayer.BaseClass;

public class RegisterPage extends BaseClass {

	@FindBy(name = "firstName")
	private WebElement firstname;

	@FindBy(name = "lastName")
	private WebElement lastname;

	@FindBy(name = "phone")
	private WebElement phone;

	@FindBy(name = "userName")
	private WebElement username;

	@FindBy(name = "address1")
	private WebElement add;

	@FindBy(name = "city")
	private WebElement city;

	@FindBy(name = "state")
	private WebElement state;

	@FindBy(name = "postalCode")
	private WebElement postal;

	@FindBy(name = "country")
	private WebElement country;

	@FindBy(name = "email")
	private WebElement id;
	
	@FindBy(name = "password")
	private WebElement pswd;
	
	@FindBy(name = "confirmPassword")
	private WebElement cpswd;
	
	@FindBy(name = "submit")
	private WebElement submit;
	
	public RegisterPage() {
		PageFactory.initElements(driver, this);
	}

	
	
	public void contactInfoFunctionality(String fname, String lname, String phonee, String emai) {

		firstname.sendKeys(fname);
		lastname.sendKeys(lname);
		phone.sendKeys(phonee);
		username.sendKeys(emai);
	}

	public void mailingInfoFunctionality(String adres, String cit, String stat, String code, String Country) {
		add.sendKeys(adres);
		city.sendKeys(cit);
		state.sendKeys(stat);
		postal.sendKeys(code);
		
		Select sel = new Select(country);
		sel.selectByVisibleText(Country);

	}
	
	public void userInfoFunctionality(String Email, String Pasword, String ConPassword) {
		id.sendKeys(Email);
		city.sendKeys(Pasword);
		state.sendKeys(ConPassword);
		submit.click();
		
		

	}

}
