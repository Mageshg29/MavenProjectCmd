package Log4jBasics;

import org.testng.annotations.Test;

public class OptimisedLog4jBasics3 extends TestBase
{	
	@Test
	public void searchForProduct()
	{
	
		TestBase  tb = new TestBase();
		
		// log msgs
		tb.log.debug("searchForProduct -started");
		tb.log.debug("1 open chrome browser");
		tb.log.debug("2 enter user name");
		tb.log.debug("3 enter pwd");
		tb.log.debug("4 click login button");
		tb.log.debug("5 verify home page is dispalyed");	
		tb.log.debug("search for product samsung mobile");
	}

}
