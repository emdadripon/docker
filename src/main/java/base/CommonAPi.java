package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CommonAPi {
	
	public WebDriver driver = null;
	
	@BeforeMethod
	public void setUp() {
		
		System.setProperty("webdriver.gecko.driver", "/Users/emdadripon/Documents/driver/geckodriver");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://healthy.kaiserpermanente.org");
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void search() {
		System.out.println(driver.getCurrentUrl());
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
