package OrangeHRMSTestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.HomePage;
import Pages.LoginPage;

public class SearchWithInvalidUserTC4 {

	public static void main(String[] args) {
		
WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		LoginPage lpage = new LoginPage(driver);
		
		lpage.enter_Username("Admin");
		lpage.enter_Pwd("admin123");
		lpage.clickloginbtn();
		
		HomePage hpage = new HomePage(driver);
		hpage.isprofileimagedisplayed();
		
		// check navigate menu option	
		hpage.navigatetoadminmenu();	
		
		// Verify System user page is displayed or not
		hpage.verifysystemuserpagedisplayed();
		
		// Seacrh with invalid user
		String invaliduser = "Manoj";
		hpage.enterusername(invaliduser);
		
		// click Seacrh button
		hpage.clicksearchbtn();
		
		// Verify  'No Records Found'  msg is displayed
		hpage.isnorecordmsgdisplayed();

	}

}
