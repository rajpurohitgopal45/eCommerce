package locator_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Locator_Registration {

	@FindBy(xpath = "//a[@class='login']")
	public WebElement sign_in;
	
	@FindBy(id = "email_create")
	public WebElement type_email;
	
	@FindBy(id = "SubmitCreate")
	public WebElement submit_email;
	
	@FindBy(id = "id_gender1")
	public WebElement gender;
	
	@FindBy(id = "customer_firstname")
	public WebElement firsrName;
	
	@FindBy(id = "customer_lastname")
	public WebElement lastName;
	
	@FindBy(id = "passwd")
	public WebElement enterPasswd;
	
	@FindBy(id = "days")
	public WebElement days;
	
	@FindBy(id = "months")
	public WebElement months;
	
	@FindBy(id = "years")
	public WebElement years;
	
	@FindBy(id = "address1")
	public WebElement address;
	
	@FindBy(id = "city")
	public WebElement city;
	
	@FindBy(id = "id_state")
	public WebElement state;
	
	@FindBy(id = "postcode")
	public WebElement postcode;
	
	@FindBy(id = "phone_mobile")
	public WebElement phone_mobile;
	
	@FindBy(id = "alias")
	public WebElement anotherAddress;
	
	@FindBy(id = "submitAccount")
	public WebElement submit;
	
	@FindBy(xpath = "//a[@class='logout']")
	public WebElement logout;
}
