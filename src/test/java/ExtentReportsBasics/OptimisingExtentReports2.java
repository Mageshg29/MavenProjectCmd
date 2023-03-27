package ExtentReportsBasics;

import com.relevantcodes.extentreports.LogStatus;

public class OptimisingExtentReports2 extends MyTestListener
{

	public void setup()
	{
		
	}
	
	public void createorderTC2()
	{
		// to log pass, fail ,warning...etc in extent reports
		extest.log(LogStatus.PASS, "Enter Product Name");
		extest.log(LogStatus.PASS, "Enter Qty");
		extest.log(LogStatus.PASS, "Add to Cart");
					
		// Send / log fail msgs
		extest.log(LogStatus.FAIL, "Unable to add the products to cart");
					
		//  send info msg
		extest.log(LogStatus.INFO, "Proceed with Payment");
		
	}
	
	public void endtest()
	{
		
	}
	
	
}
