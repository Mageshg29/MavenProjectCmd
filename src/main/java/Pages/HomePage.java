package Pages;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	public static WebDriver driver;
	
	//1.ele with locators
	
	@FindBy(xpath = "//img[@class='oxd-userdropdown-img']")
	public WebElement profileimg;
	
	@FindBy(xpath = "//span[text()='Admin']")
	public WebElement adminmenu;
	
	@FindBy(xpath = "//span[text()='PIM']")
	public WebElement pimmenu;
	
	@FindBy(xpath = "//span[text()='Leave']")
	public WebElement leavemenu;
	
	@FindBy(xpath = "//span[text()='Time']")
	public WebElement timemenu;
	
	@FindBy(xpath = "//h5[text()='System Users']")
	public WebElement systemuserstxtele;
	
	@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")
	public WebElement addbtn;
	
	@FindBy(xpath = "//h6[text()='Add User']")
	public WebElement addusertxtele;
	
	@FindBy(xpath = "(//div[@class='oxd-select-text-input'])[1]")
	public WebElement userroledropdownele;
	
	@FindBy(xpath = "//label[text()='User Role']/../following-sibling::div//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow']")
	public WebElement arrowbtninuserroledropdown;
	
	@FindBy(xpath = "//div[@role='listbox']//*[text()='Admin']")
	public WebElement userroledropdowntxtele;
	
	@FindBy(xpath = "//input[@placeholder='Type for hints...']")
	public WebElement employeenametxtboxele;
	
	@FindBy(xpath = "//*[text()='Orange  Test']")
	public WebElement employeenamevalueele;
	
	@FindBy(xpath = "//label[text()='Status']/../following-sibling::div//i")
	public WebElement statusarrowbutton;
	
	@FindBy(xpath = "//div[@role='listbox']//*[text()='Enabled']")
	public WebElement statusvalue;
	
	@FindBy(xpath = "//label[text()='Username']/../following-sibling::div/input")
	public WebElement usernametxtbox;
	
	@FindBy(xpath = "//label[text()='Password']/../following-sibling::div/input")
	public WebElement passwordtxtbox;
	
	@FindBy(xpath = "//label[text()='Confirm Password']/../following-sibling::div/input")
	public WebElement confirmpasswordtxtbox;
	
	@FindBy(xpath = "//button[@type='submit']")
	public WebElement submitbtn;
	
	@FindBy(xpath = "//label[text()='Username']/../following-sibling::div/input")
	public WebElement userNametxtbox;
	
	@FindBy(xpath = "//button[text()=' Search ']")
	public WebElement searchbtn;
	
	@FindBy(xpath = "//span[text()='No Records Found']")
	public WebElement norecordsfoundtxtele;
	
	@FindBy(xpath = "//p[text()='The selected record will be permanently deleted. Are you sure you want to continue?']")
	public WebElement deleteconfirmationmsg;
	
	@FindBy(xpath = "//button[text()=' Yes, Delete ']")
	public WebElement yesdeletebtn;
	
	
//	--------------------------------------------------------------------//
	//2.constr and pass webdriver var
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	//3.seperate method for each step
	
	// check  profile image is displayed
	public boolean isprofileimagedisplayed()
	{
		if(profileimg.isDisplayed())
		{
			System.out.println("Login to Orange HRMS");
			return true;
		}
		else
		{
			System.out.println("Unable to Login to Orange HRMS");
			return false;
		}
	}
	
	// Navigate to Admin menu
	public void navigatetoadminmenu()
	{
		System.out.println("Click admin menu from left side");
		adminmenu.click();
	}
	
	// Navigate to Pim menu
	public void navigatetopimmenu()
	{
		System.out.println("Click pim menu from left side");
		pimmenu.click();
	}
	
	// HW navigate to 'Leave' menu option
	public void navigatetoleavemenu()
	{
		System.out.println("Click leave menu from left side");
		leavemenu.click();
	}
	
	// HW navigate to 'Time' menu option
	public void navigatetotimemenu()
	{
		System.out.println("Click time menu from left side");
		timemenu.click();
	}
	
	
	// Verify System user page is displayed or not
	public void verifysystemuserpagedisplayed()
	{
		if(systemuserstxtele.isDisplayed())
		{
			System.out.println("System user page is displayed");
		}
		else
		{
			System.out.println("System user page is not displayed");
		}
	}
	
	//click add btn
	public void clickaddbtn()
	{
		System.out.println("click add btn");
		addbtn.click();
	}
	
	//Verify add user page is displayed
	public void verifyadduserpagedisplayed()
	{
		if(addusertxtele.isDisplayed())
		{
			System.out.println("Add user page is displayed");
		}
		else
		{
			System.out.println("Add user page is not displayed");
		}
	}
	
	//Select some value (Admin) in User Role dropdown
	public void selectuserrole(String userrole) throws InterruptedException
	{
		System.out.println("Click arrow btn in user role dropdown");
		arrowbtninuserroledropdown.click();
		Thread.sleep(4000);
		
		//Select 'Admin' value in dropdown
	//	userroledropdowntxtele.click();
		driver.findElement(By.xpath("//div[@role='listbox']//*[text()='"+userrole+"']")).click();
	}
	
	// type some employee name(Orange test) in Employee Name txt box
	public void entervalueinemployeename(String empname) throws InterruptedException
	{
		employeenametxtboxele.sendKeys(empname);
//		Thread.sleep(40000);
		employeenamevalueele.click();
	}
	
	// Select some status =Enabled
	public void selectstatus(String status) throws InterruptedException
	{
		statusarrowbutton.click();
		Thread.sleep(4000);
	//	statusvalue.click();
		driver.findElement(By.xpath("//div[@role='listbox']//*[text()='" +status+ "']")).click();
	}
	
	// Type some value in user name text box 
	public void entervalueinusername(String username)
	{
		System.out.println("Enter value in user name= "+ username);
		usernametxtbox.sendKeys(username);
	}
	
	// Type some value in password  text box
	public void entervalueinpassword(String pwd)
	{
		passwordtxtbox.sendKeys(pwd);
	}
	

	// Type some value in Confirm password  text box
	public void entervalueinconfirmpassword(String confirmpwd)
	{
		confirmpasswordtxtbox.sendKeys(confirmpwd);
	}
	
	// click on Save button
	public void clicksavebtn() throws InterruptedException
	{
		Actions act = new Actions(driver);
		act.sendKeys(Keys.TAB).perform();
		Thread.sleep(4000);
		act.sendKeys(Keys.TAB).perform();
		Thread.sleep(4000);
		act.sendKeys(Keys.ENTER).perform();
		System.out.println("click save button");
		Thread.sleep(4000);
	}
	
	// Verify  new user name is exist in table or not
	public void searchforgivenuser(String username) throws InterruptedException
	{
		Thread.sleep(4000);
		System.out.println("Enter username="+ username);
		userNametxtbox.sendKeys(username);

		// click Seacrh button
		searchbtn.click();
		String myxpath = "//div[@role='table']//div[text()='"+username+ "']";
		
		boolean userdisplayed = driver.findElement(By.xpath(myxpath)).isDisplayed(); 
	
		if(userdisplayed)
		{
			System.out.println("user name ="+ username + "is displayed in table");
		}
		else
		{
			System.out.println("user name ="+ username + "is not displayed in table");
		}
		
	}
	
	public void enterusername(String username)
	{
		System.out.println("enter user name="+ username);
		userNametxtbox.sendKeys(username);
	}
	
	public void clicksearchbtn()
	{
		System.out.println("click search btn");
		searchbtn.click();
	}
	
	public boolean isnorecordmsgdisplayed()
	{
		boolean norecordsmsgsdisplayed = norecordsfoundtxtele.isDisplayed();
		if(norecordsmsgsdisplayed)
		{
			System.out.println("Pass.No Records Found msg is displayed");
		}
		else
		{
			System.out.println("Fail.No Records Found msg is not displayed");
		}	
		return norecordsmsgsdisplayed;
	}
	
	// Select  some  user checkbox 
	public void selectgiveuser(String username)
	{
		System.out.println("select the user name="+ username);
		//div[text()='Alice.Duval']/../preceding-sibling::div//input/..
		String myxpath = "//div[text()='" +username+ "']/../preceding-sibling::div//input/..";
		driver.findElement(By.xpath(myxpath)).click();
	}
	
	// Click delete image icon
	public void deleteuser(String username)
	{
		System.out.println("delete the user name="+ username);
		driver.findElement(By.xpath("//div[text()='" +username+ "']/../following-sibling::div[4]//i[@class='oxd-icon bi-trash']")).click();
	}
	
	// Verify the msg -The selected record will be permanently deleted. Are you sure you want to continue?
	public void isdeleteconfirmationmsgdisplayed()
	{
		if(deleteconfirmationmsg.isDisplayed())
		{
			System.out.println("Pass.The selected record will be permanently deleted. Are you sure you want to continue? msg is displayed");
		}
		else
		{
			System.out.println("Fail.The selected record will be permanently deleted. Are you sure you want to continue? msg is not displayed");
		}
	}
	
	// Click Yes Delete button
	public void clickyesdeletebtn()
	{
		yesdeletebtn.click();
	}
	
	// Seacrh with invalid user
	public void searchforinvaliduser(String invaliduser) throws InterruptedException
	{
		String invalidUser= "Manoj";
		enterusername(invaliduser);
		
		// click Search button
		clicksearchbtn();
		Thread.sleep(5000);
		
		// Verify  'No Records Found'  msg is displayed
		isnorecordmsgdisplayed();
	}
	

}
