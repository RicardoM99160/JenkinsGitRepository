package myPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SmokeTest {

	@Test
	public void LoginTest() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Web drivers\\geckodriver-v0.29.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://google.com");
		Thread.sleep(5000);
		driver.quit();
	}
}
