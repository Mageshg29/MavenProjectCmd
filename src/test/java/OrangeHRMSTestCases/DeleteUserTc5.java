package OrangeHRMSTestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.HomePage;
import Pages.LoginPage;

public class DeleteUserTc5 {

	public static void main(String[] args) throws InterruptedException {
		
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
		Thread.sleep(4000);
		
		// Delete the given user
		String username = "Cassidy.Hope";
		hpage.selectgiveuser(username);
		
		// Click delete image icon
		hpage.deleteuser(username);
		
		// Verify the msg -The selected record will be permanently deleted. Are you sure you want to continue?
		hpage.isdeleteconfirmationmsgdisplayed();
		
		// Click Yes Delete button
		hpage.clickyesdeletebtn();
		
		// Verify Record should not be available in table 
		hpage.searchforinvaliduser(username);
		

	}

}
