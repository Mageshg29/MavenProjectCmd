package ExtentReportsBasics;

import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class MyTestListener implements ITestListener
{
	public static ExtentReports exrep;
	public static ExtentTest  extest;
//	String ResFile= ".\\src\\test\\java\\ExtentReportsBasics\\OptimisedExtentReports1.html";
	
	
	@Override
	public void onStart(ITestContext context) {
		//		ITestListener.super.onStart(context);
		
		Date d = new Date();
		System.out.println("d="+d);
		String sdate = d.toString();
		sdate =sdate.replace(" ", "_");
		sdate =sdate.replace(":", "_");
		System.out.println("sdate="+sdate);
		String ResFile= ".\\src\\test\\java\\ExtentReportsBasics\\OptimisedExtentReports" + sdate +".html";
		System.out.println("ExtentReports file="+ ResFile);
		exrep =  new ExtentReports(ResFile);
		
		
	}
	
	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
//		ITestListener.super.onTestStart(result);
		String TestMethodName= result.getMethod().getMethodName();
		System.out.println("TestMethodName="+TestMethodName);
		extest = exrep.startTest(TestMethodName);
		
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
//		ITestListener.super.onTestSuccess(result);
	}
	
	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
//		ITestListener.super.onTestFailure(result);
	}
	
	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
//		ITestListener.super.onTestFailedWithTimeout(result);
	}
	
	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
//		ITestListener.super.onTestSkipped(result);
	}
	
	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
//		ITestListener.super.onFinish(context);
		exrep.endTest(extest);
		exrep.flush();
	}

}
