package ExtentReportsBasics;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentReports1 {

	
	@Test
	public void testA()
	{
		System.out.println("stmt1 from testA");
		
		String ResFile = ".\\src\\test\\java\\ExtentReportsBasics\\ExtentReports1.html";
		ExtentReports exrep = new ExtentReports(ResFile);
		
		ExtentTest extest = exrep.startTest("TC 1");
		
		//log pass msgs in extent report
		extest.log(LogStatus.PASS, "enter user name");
		extest.log(LogStatus.PASS, "password");
		
		// Log fail  msg 
		extest.log(LogStatus.FAIL, "login button not showing");
		
		// pass info, warning
		extest.log(LogStatus.INFO, "info message");
		extest.log(LogStatus.WARNING, "warning message");
		
		exrep.endTest(extest);
		exrep.flush();
		
	}
	
		
}
