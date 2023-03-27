package ExtentReportsBasics;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentReportsNew1 {

	ExtentReports exRep;
	ExtentTest  exTest;
	
	@BeforeTest 
	public void setup()
	{
		String ResFile= ".\\src\\test\\java\\ExtentReportsBasics\\ExtentReportsNew1.html";
		exRep =  new ExtentReports(ResFile);	
		
	}

	@Test
	public void testA()
	{
		exTest = exRep.startTest("TC 1");
		
		//log pass msgs in extent report
		exTest.log(LogStatus.PASS, "Enter user name");
		exTest.log(LogStatus.PASS, "Enter PWd");
				
		// Log fail  msg
		exTest.log(LogStatus.FAIL, "Login  btn is not there");	
				
		// pass info, warning
		exTest.log(LogStatus.INFO, "info msg");
		exTest.log(LogStatus.WARNING, "warning msg");
	
	}
	
	@AfterTest
	public void endTest()
	{
		exRep.endTest(exTest);
		exRep.flush();
	}	
	
	
		
}
