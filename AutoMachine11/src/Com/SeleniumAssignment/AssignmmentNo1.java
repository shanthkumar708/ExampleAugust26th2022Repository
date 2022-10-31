package Com.SeleniumAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmmentNo1 {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutwindow();
		createUser1();
		createUser2();
		createUser3();
		logOutAdmin();


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
			oBrowser.findElement(By.name("username")).sendKeys("Demo5 M");
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
	private static void createUser2()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//div[text()='Add User']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("firstName")).sendKeys("Sathish");
			oBrowser.findElement(By.name("middleName")).sendKeys("M");
			oBrowser.findElement(By.name("lastName")).sendKeys("Kumar");
			oBrowser.findElement(By.name("email")).sendKeys("sathiskumar1996@gmail.com");
			oBrowser.findElement(By.name("username")).sendKeys("Demo2 M");
			oBrowser.findElement(By.name("password")).sendKeys("Sathish!1996");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("Sathish!1996");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}	
	}
	private static void createUser3()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//div[text()='Add User']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("firstName")).sendKeys("Santhosh");
			oBrowser.findElement(By.name("middleName")).sendKeys("M");
			oBrowser.findElement(By.name("lastName")).sendKeys("Kumar");
			oBrowser.findElement(By.name("email")).sendKeys("santhoshkumar1996@gmail.com");
			oBrowser.findElement(By.name("username")).sendKeys("Demo3 M");
			oBrowser.findElement(By.name("password")).sendKeys("Santhosh!1996");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("Santhosh!1996");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logOutAdmin()
	{
		try
		{
		oBrowser.findElement(By.id("usersManagementBodyTagId"))	.click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
