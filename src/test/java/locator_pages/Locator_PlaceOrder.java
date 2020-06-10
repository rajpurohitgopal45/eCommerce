package locator_pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Locator_PlaceOrder {
	@FindBy(id = "email")
	public WebElement email;

	@FindBy(id = "passwd")
	public WebElement password;
	
	@FindBy(id = "SubmitLogin")
	public WebElement login;
	
	@FindBy(xpath = "//a[text()='Women']")
	public WebElement womenButton;
	
	@FindBy(xpath = "//img[@class='replace-2x img-responsive']")
	public List<WebElement> products;
	
	@FindBy(xpath = "//i[@class='icon-plus']")
	public WebElement increment_quantity;
	
	@FindBy(xpath = "//*[text()='Add to cart']")
	public WebElement addToCart;
	
	@FindBy(xpath = "//a[@title='Proceed to checkout']")
	public WebElement Proceed_to_checkout;
	
	@FindBy(id = "total_price")
	public WebElement total_price;
	
	@FindBy(xpath = "//*[text()='Proceed to checkout']")
	public WebElement Proceed_to_checkout2;
	
	@FindBy(id = "cgv")
	public WebElement checkBox;
	
	@FindBy(name = "processCarrier")
	public WebElement process;
	
	@FindBy(id = "total_price_container")
	public WebElement total_price2;
	
	@FindBy(xpath = "//a[@title='Pay by check.']")
	public WebElement payByCheck;
	
	@FindBy(id = "amount")
	public WebElement total_price3;
	
	@FindBy(xpath = "//*[text()='I confirm my order']")
	public WebElement confirm_order;
	
	@FindBy(xpath = "//span[@class='price']")
	public WebElement total_price4;
	
	@FindBy(xpath = "//div/a[@title='View my customer account']")
	public WebElement view_account;
	
	@FindBy(xpath = "//*[text()='Order history and details']")
	public WebElement order_history;
	
	@FindBy(xpath = "//*[@class='price']")
	public WebElement total_price5;
}
