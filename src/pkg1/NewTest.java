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
		log.info("first line");
			System.setProperty("webdriver.chrome.driver", ".//lib//chromedriver");
		log.info("system property set");
		ChromeOptions chromeOptions = new ChromeOptions();
			chromeOptions.addArguments("--ChromelessOptions");
            chromeOptions.addArguments("--headless");
            chromeOptions.addArguments("--no-sandbox");
			chromeOptions.addArguments("--disable-dev-shm-usage");
					chromeOptions.addArguments("--incognito");
		chromeOptions.setExperimentalOption("useAutomationExtension",false);
			log.info("options added");
		driver = new ChromeDriver(chromeOptions);
			log.info("before google url");
		log.info(driver.get("https://www.google.com/"));
		log.info("last line");
		
	}
}
