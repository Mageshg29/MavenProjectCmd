package WebDriverManagerBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EdgeBrowserBasics {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		
		driver.get("file:///C:/Selenium/SampleWebpage.html");
		
		// click  Electronics,  Computers  checkbox
		WebElement electronicscheckbox = driver.findElement(By.id("eleid"));
		electronicscheckbox.click();
		
	 	WebElement computerscheckbox = driver.findElement(By.id("cid"));
	 	computerscheckbox.click();
	 	Thread.sleep(3000);
	 	
	 	// HW check these checkboxes  Electronics,  Computers  are selected
	 	boolean elecchkbox = electronicscheckbox.isSelected();
	 	System.out.println("elecchkbox="+elecchkbox);//elecchkbox=true
	 	
	 	boolean compchkbox = computerscheckbox.isSelected();
	 	System.out.println("compchkbox="+compchkbox);//compchkbox=true
		
	 	//  HW unselect 'Computers' checkbox -- use click()
	 	computerscheckbox.click();
	 			
	 	// HW check 'Computers' checkbox is selected or not
	 	boolean compchkbox1 = computerscheckbox.isSelected();
	 	System.out.println("compchkbox1="+compchkbox1);//compchkbox1=false
	 	
	}

}
