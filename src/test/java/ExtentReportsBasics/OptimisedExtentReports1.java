package ExtentReportsBasics;

import org.testng.annotations.BeforeTest;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class OptimisedExtentReports1 extends MyTestListener
{
	
	@BeforeTest 
	public void setup()
	{
		
	}
	
	public void loginTC1()
	{
		//log pass msgs in extent report
		extest.log(LogStatus.PASS, "Enter user name");
		extest.log(LogStatus.PASS, "Enter PWd");
		
		// Log fail  msg
		extest.log(LogStatus.FAIL, "Login  btn is not there");	
		
		// pass info, warning
		extest.log(LogStatus.INFO, "info msg");
		extest.log(LogStatus.WARNING, "warning msg");
		
	}
	
	public void endtest()
	{
		
	}

}
