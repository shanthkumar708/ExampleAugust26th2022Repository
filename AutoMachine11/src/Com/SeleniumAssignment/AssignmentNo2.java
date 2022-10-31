package Com.SeleniumAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentNo2 {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutwindow();
		createUser1();
		 Modifyuser();
		 deleteuser();
		 logout();
	}
	private static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "D:\\Eclipsesample\\AutoMachine11\\Library\\drivers\\chromedriver.exe");
			oBrowser= new ChromeDriver();	
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void navigate()
	{
		try
		{
			oBrowser.get("http://localhost/login.do");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void login()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void minimizeFlyOutwindow()
	{
		try
		{
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void createUser1()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//div[text()='Add User']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("firstName")).sendKeys("Shanth");
			oBrowser.findElement(By.name("middleName")).sendKeys("M");
			oBrowser.findElement(By.name("lastName")).sendKeys("Kumar");
			oBrowser.findElement(By.name("email")).sendKeys("shanthkumar1996@gmail.com");
			oBrowser.findElement(By.name("username")).sendKeys("Demo10 M");
			oBrowser.findElement(By.name("password")).sendKeys("Shanthi!1996");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("Shanthi!1996");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void Modifyuser()
	{
		try
		{
		oBrowser.findElement(By.xpath("//*[@id='userListTableContainer']")).click();
		oBrowser.findElement(By.id("userDataLightBox_firstNameField")).clear();
		oBrowser.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("abc");
		oBrowser.findElement(By.xpath("//span[text()='Save Changes']")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void deleteuser()
	{
		try
		{
		oBrowser.findElement(By.xpath("//span[text()=Kumar, niunh M.")).click();
		Thread.sleep(5000);
		oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
		Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logout()
	{
		try
		{
		oBrowser.findElement(By.id("logoutLink")).click();	
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}