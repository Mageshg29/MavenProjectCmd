package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import bsh.This;

public class LoginPage {
	
	public WebDriver driver;
	
	//username
	@FindBy(name="username")
	public WebElement username_txtbox;
	
	//pwd
	@FindBy(name="password")
	public WebElement pwd_txtbox;
	
	//login btn
	////button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']
	@FindBy(xpath="//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")
	public WebElement login_btn;
	
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//enter username in txtbox
	public void enter_Username(String value)
	{
		username_txtbox.sendKeys(value);
	}
	
	//enter pwd in txtbox
	public void enter_Pwd(String pwd)
	{
		pwd_txtbox.sendKeys(pwd);
	}
	
	//click login btn
	public void clickloginbtn()
	{
		login_btn.click();
	}
	
	public void LogintoOrangeHRMSAppl(String user, String pwd)
	{
		enter_Username(user);
		enter_Pwd(pwd);
		clickloginbtn();
	}
	

}
