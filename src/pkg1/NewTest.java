package pkg1;

import org.testng.annotations.Test;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTest {
	public static Logger log = LogManager.getLogger(NewTest.class.getName());;
	public static WebDriver driver;

	@Test
	public void f() {
			//System.setProperty("webdriver.chrome.driver", ".//lib//chromedriver");
			driver.Firefox()
			//driver = new ChromeDriver();
			log.info("Opening google.co.in");
		log.info("Opening google.co.in3");
		log.info("Opening google.co.in4"+driver.get("https://www.google.com/"));
		
	}
}
