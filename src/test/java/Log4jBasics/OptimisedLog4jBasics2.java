package Log4jBasics;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class OptimisedLog4jBasics2 extends TestBase
{
	@Test
	public void CreateOrder()
	{
		
		log.debug("CreateOrder -started");
		log.debug("1 open chrome browser");
		log.debug("2 enter username");
		log.debug("3 enter password");
		log.debug("4 click login button");
		log.debug("5 verify homepage is displayed");	

		log.debug("6 search for product");
		log.debug("7 add qty");
		log.debug("8 add to cart and proceed with payment");
		log.info("info msg");
		log.error("logging error msgs");
	
	
	}
	
}
