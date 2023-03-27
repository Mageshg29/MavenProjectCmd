package TestNGReports;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Reporting {
	
	@Test
	public void testA()
	{
		System.out.println("enter username");
		System.out.println("enter pwd");
		System.out.println("click login");
		
		Reporter.log("enter username");
		Reporter.log("enter pwd");
		Reporter.log("click login");
		
//		Assert.assertEquals("ram", "sita");//failed test method in red colour
	}
	
	@Test
	public void createorder()
	{
		Reporter.log("enter product name");
		Reporter.log("enter qty");
		Reporter.log("enter address");
		Reporter.log("payment through credit card");
	}

}
