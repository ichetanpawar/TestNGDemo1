package pkg1;

import org.testng.annotations.Test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NewTest {
	public static Logger log = LogManager.getLogger(NewTest.class.getName());;
	public static WebDriver driver;

	@Test
	public void f() {
			System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");

			ChromeOptions chromeOptions = new ChromeOptions();
			chromeOptions.addArguments("--ChromelessOptions");
            chromeOptions.addArguments("--headless");
            chromeOptions.addArguments("--no-sandbox");
			chromeOptions.addArguments("--disable-dev-shm-usage");
			driver = new ChromeDriver(chromeOptions);
			log.info("Opening google.co.in");
			log.info("Window maximized");
			driver.get("https://www.google.co.in/");
			log.info("Window title:"+driver.getTitle());
			log.info("Current URL:"+driver.getCurrentUrl());
			log.info(driver.getPageSource());
	}
}
