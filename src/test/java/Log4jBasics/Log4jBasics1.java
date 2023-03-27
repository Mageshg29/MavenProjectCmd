package Log4jBasics;

import org.apache.log4j.Logger;
import org.testng.Reporter;
import org.testng.annotations.Test;



public class Log4jBasics1 {
	
	@Test
	public void loginTC1()
	{
		System.out.println("1 open chrome browser");
		System.out.println("2 enter username");
		System.out.println("3 enter password");
		System.out.println("4 click login button");
		System.out.println("5 verify homepage is displayed");
		
		Reporter.log("1 open chrome browser");
		Reporter.log("2 enter username");
		Reporter.log("3 enter password");
		Reporter.log("4 click login button");
		Reporter.log("5 verify homepage is displayed");
		
		Logger log = Logger.getLogger("Ram");
		
		log.debug("loginTC1 starts");
		log.debug("1 open chrome browser");
		log.debug("2 enter username");
		log.debug("3 enter password");
		log.debug("4 click login button");
		log.debug("5 verify homepage is displayed");
		
		
		
	}

}
