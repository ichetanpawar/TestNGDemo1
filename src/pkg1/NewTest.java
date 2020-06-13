package pkg1;

import org.testng.annotations.Test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class NewTest {
	public static Logger log = LogManager.getLogger(NewTest.class.getName());;

	@Test
	public void f() {
			log.info("Opening google.co.in");
			log.info("Window maximized");
			log.info("Window title:");
			log.info("Current URL:");
	}
}
