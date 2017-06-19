package linkedin1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;

public class linkedinlogin2 {
	
	WebDriver driver;
	
	@Test
	public void linkedin() {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("http://linkedin.com");

		
	}

}
