package OrangeHRMSTestCases;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.HomePage;
import Pages.LoginPage;
import Utilities.TestBase;

public class CreateNewUserTc03 {

	public static void main(String[] args) throws InterruptedException {
		
//		WebDriver driver;
//		
//		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		
//		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		// call OpenBrowser() from TestBase Class
		TestBase tb = new TestBase();
		WebDriver driver= tb.openbrowser();
		
		LoginPage lpage = new LoginPage(driver);
		
//		lpage.enter_Username("Admin");
//		lpage.enter_Pwd("admin123");
//		lpage.clickloginbtn();
		
		lpage.LogintoOrangeHRMSAppl("Admin", "admin123");
		
		HomePage hpage = new HomePage(driver);
		hpage.isprofileimagedisplayed();
		
		// check navigate menu option	
		hpage.navigatetoadminmenu();	
		
		//  navigate to Pim menu
//		hpage.navigatetopimmenu();
		
		// HW navigate to 'Leave' menu option
//		hpage.navigatetoleavemenu();
				
		// HW navigate to 'Time' menu option
//		hpage.navigatetotimemenu();
		
		// Verify System user page is displayed or not
		hpage.verifysystemuserpagedisplayed();
		
		//Click add btn
		hpage.clickaddbtn();
		
		// Verify add user page is displayed
		hpage.verifyadduserpagedisplayed();
		
		//Select some value (Admin) in User Role dropdown
//		hpage.selectuserrole();
		String userrole= "ESS";
		hpage.selectuserrole(userrole);
		
		// type some employee name(Orange test) - in Employee Name txt box
		String empname= "Orange  Test";
		hpage.entervalueinemployeename(empname);
		
		// Select some status =Enabled
		String status ="Disabled";
		hpage.selectstatus(status);
		
		// Type some value in user name text box 
//		hpage.entervalueinusername();
		//Random no
		Random r = new Random();
		int rno = r.nextInt(100);
		
		String username = "Magesh"+rno;
		hpage.entervalueinusername(username);
		
		// Type some value in password  text box
		String pwd= "Test@123321";
		hpage.entervalueinpassword(pwd);
		
		// Type some value in Confirm password  text box
		String confirmpwd= "Test@123321";
		hpage.entervalueinconfirmpassword(confirmpwd);
		
		// click on Save button
		hpage.clicksavebtn();
		
		// Verify  new user name is exist in table or not
		hpage.searchforgivenuser(username);
		
	}

}
