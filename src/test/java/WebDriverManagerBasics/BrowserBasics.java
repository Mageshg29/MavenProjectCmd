package WebDriverManagerBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserBasics {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("file:///C:/Selenium/SampleWebpage.html");
		
		// click  Electronics,  Computers  checkbox
		WebElement electronicscheckbox = driver.findElement(By.id("eleid"));
		electronicscheckbox.click();
		
	 	WebElement computerscheckbox = driver.findElement(By.id("cid"));
	 	computerscheckbox.click();
		
	}

}
