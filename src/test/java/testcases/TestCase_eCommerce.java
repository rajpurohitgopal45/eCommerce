package testcases;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import base.Base;
import base.Excel_Config;
import locator_pages.Locator_PlaceOrder;
import locator_pages.Locator_Registration;

public class TestCase_eCommerce extends Base {
	public Locator_Registration locator_Registration;
	public Locator_PlaceOrder locator_PlaceOrder;
	Excel_Config excel = new Excel_Config(".\\Data.xlsx");
	WebDriver driver1;
	String price;

	public TestCase_eCommerce(WebDriver driver2) {
		this.locator_Registration = new Locator_Registration();
		this.locator_PlaceOrder = new Locator_PlaceOrder();
		driver1 = driver2;
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver1, 20);
		PageFactory.initElements(factory, this.locator_Registration);
		PageFactory.initElements(factory, this.locator_PlaceOrder);
	}

	public void registration() throws InterruptedException {
		this.locator_Registration.sign_in.click();
		this.locator_Registration.type_email.sendKeys(excel.getData(2, 1));
		this.locator_Registration.submit_email.click();
		Thread.sleep(2000);
		this.locator_Registration.gender.click();
		this.locator_Registration.firsrName.sendKeys(excel.getData(3, 1));
		this.locator_Registration.lastName.sendKeys(excel.getData(4, 1));
		Thread.sleep(1000);
		this.locator_Registration.enterPasswd.sendKeys(excel.getData(5, 1));
		selectValue(this.locator_Registration.days, excel.getData(6, 1));
		selectValue(this.locator_Registration.months, excel.getData(7, 1));
		selectValue(this.locator_Registration.years, excel.getData(8, 1));
		this.locator_Registration.address.sendKeys(excel.getData(9, 1));
		this.locator_Registration.city.sendKeys(excel.getData(10, 1));
		selectText(this.locator_Registration.state, excel.getData(11, 1));
		this.locator_Registration.postcode.sendKeys(excel.getData(12, 1));
		this.locator_Registration.phone_mobile.sendKeys(excel.getData(13, 1));
		this.locator_Registration.anotherAddress.sendKeys(excel.getData(14, 1));
		this.locator_Registration.submit.click();
		this.locator_Registration.logout.click();
	}

	public void sign_in() {
		this.locator_PlaceOrder.email.sendKeys(excel.getData(2, 1));
		this.locator_PlaceOrder.password.sendKeys(excel.getData(5, 1));
		this.locator_PlaceOrder.login.click();
	}

	public void selectProduct() {
		this.locator_PlaceOrder.womenButton.click();
		List<WebElement> products = this.locator_PlaceOrder.products;
		Actions action = new Actions(driver1);
		action.moveToElement(products.get(1)).click().build().perform();
		driver1.switchTo().frame(0);
	}

	public void proceed_to_checkout() throws InterruptedException {
		this.locator_PlaceOrder.increment_quantity.click();
		this.locator_PlaceOrder.addToCart.click();
		Thread.sleep(3000);
		this.locator_PlaceOrder.Proceed_to_checkout.click();
		price = this.locator_PlaceOrder.total_price.getText();
		this.locator_PlaceOrder.Proceed_to_checkout2.click();
		this.locator_PlaceOrder.Proceed_to_checkout2.click();
		this.locator_PlaceOrder.checkBox.click();
		this.locator_PlaceOrder.process.click();
	}

	public void payBy_Check() throws IOException {
		String price1 = this.locator_PlaceOrder.total_price2.getText();
		verifyEquals(price1, price);
		this.locator_PlaceOrder.payByCheck.click();
	}

	public void confirmOrder() throws IOException {
		String price2 = this.locator_PlaceOrder.total_price3.getText();
		verifyEquals(price2, price);
		this.locator_PlaceOrder.confirm_order.click();
	}

	public void order_history() throws IOException {
		String price3 = this.locator_PlaceOrder.total_price4.getText();
		verifyEquals(price3, price);
		this.locator_PlaceOrder.view_account.click();
		this.locator_PlaceOrder.order_history.click();
		String price4 = this.locator_PlaceOrder.total_price5.getText();
		verifyEquals(price4, price);
		System.out.println(price);
	}
}
