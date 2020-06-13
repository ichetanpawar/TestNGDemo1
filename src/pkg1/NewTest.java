package pkg1;

import org.testng.annotations.Test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class NewTest {
	public static Logger log = LogManager.getLogger(NewTest.class.getName());;

	@Test
	public void f() {
		log.info("This is first line");
		log.info("This is second line");
		log.info("This is third line");
	}
}
