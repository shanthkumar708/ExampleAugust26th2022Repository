package Com.SeleniumAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentNo4 {
    public static  WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		 login();
		 flyoutminimizewindows();
		 createcustomer();
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
    	oBrowser.findElement(By.name("username")).sendKeys("admin");
    	oBrowser.findElement(By.name("pwd")).sendKeys("manager");
    	oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']")).click();
    	Thread.sleep(3000);
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
    private static void flyoutminimizewindows()
    {
    	try
    	{
    	oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();	
    	Thread.sleep(4000);
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
    private static void createcustomer()
    {
    	try
    	{
    	oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr/td[3]/a/div[2]")).click();	
    	oBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[1]/div[2]/div/div[2]")).click();
    	oBrowser.findElement(By.xpath("/html/body/div[14]/div[1]")).click();
    	oBrowser.findElement(By.id("customerLightBox_nameField")).sendKeys("Shanthkumar M");
    	Thread.sleep(3000);
    	oBrowser.findElement(By.xpath("//*[@id=\'customerLightBox_commitBtn\']/div/span")).click();
    	oBrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
    	Thread.sleep(3000);
    	oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[2]/div[1]/div[4]/div/div/div[2]")).click();
    	Thread.sleep(3000);
    	oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[2]/div[4]/div/div[3]/div")).click();
    	Thread.sleep(3000);
    	oBrowser.findElement(By.id("customerPanel_deleteConfirm_submitTitle")).click();
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
