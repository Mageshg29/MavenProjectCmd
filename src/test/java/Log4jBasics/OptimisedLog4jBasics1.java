package Log4jBasics;


import org.testng.annotations.Test;

public class OptimisedLog4jBasics1 extends TestBase
{
	
	@Test
	public void loginTC1()
	{
	
		log.debug("loginTC1 starts");
		log.debug("1 open chrome browser");
		log.debug("2 enter username");
		log.debug("3 enter password");
		log.debug("4 click login button");
		log.debug("5 verify homepage is displayed");

	}
}
