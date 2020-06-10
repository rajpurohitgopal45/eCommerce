package base;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Base {
	public WebDriver driver;
	
	public void setup() {
		System.setProperty("webdriver.chrome.driver", ".\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("http://automationpractice.com/index.php");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	public static void selectText(WebElement locator, String value) {
		Select select = new Select(locator);
		select.selectByVisibleText(value);
	}

	public static void selectValue(WebElement locator, String value) {
		Select select = new Select(locator);
		select.selectByValue(value);
	}

	public static void verifyEquals(String expected, String actual) throws IOException {
		Assert.assertEquals(actual, expected);
	}

	public void tearDown() {
		driver.close();
	}

}
