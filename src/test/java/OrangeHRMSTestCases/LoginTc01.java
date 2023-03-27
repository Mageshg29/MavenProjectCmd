package OrangeHRMSTestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.HomePage;
import Pages.LoginPage;
import Utilities.TestBase;

public class LoginTc01 {

	public static void main(String[] args) {
		
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
		WebDriver driver1= tb.openbrowser();	
		
		// access loginPage class variables + Methods
		LoginPage lpage = new LoginPage(driver1);
		
//		lpage.enter_Username("Admin");
//		lpage.enter_Pwd("admin123");
//		lpage.clickloginbtn();
		
		lpage.LogintoOrangeHRMSAppl("Admin", "admin123");
		
		HomePage hpage = new HomePage(driver1);
		hpage.isprofileimagedisplayed();
		
	}

}
