package stepDefinitions;

import org.junit.After;
import org.junit.Before;

public class Hooks {
	
	public static WebDriver driver;
	
	@Before 
	public void setup() {
		// initiate the driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vasic\\Documents\\Jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	}

	@After 
	public void tearDown() {
		driver.quit();
	}

}
