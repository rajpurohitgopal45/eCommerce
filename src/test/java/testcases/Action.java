package testcases;

import java.io.IOException;

import org.testng.annotations.Test;
import base.Base;

public class Action extends Base {
	public TestCase_eCommerce test;

	@Test(priority = 1)
	public void registration() throws InterruptedException {
		setup();
		test = new TestCase_eCommerce(driver);
		test.registration();
	}

	@Test(priority = 2)
	public void sign_in() {
		test.sign_in();
	}

	@Test(priority = 3)
	public void selectProduct() {
		test.selectProduct();
	}

	@Test(priority = 4)
	public void proceed_to_checkout() throws InterruptedException {
		test.proceed_to_checkout();
	}

	@Test(priority = 5)
	public void payBy_Check() throws IOException {
		test.payBy_Check();
	}

	@Test(priority = 6)
	public void confirmOrder() throws IOException {
		test.confirmOrder();
	}

	@Test(priority = 7)
	public void order_history() throws IOException {
		test.order_history();
		tearDown();
	}
}
