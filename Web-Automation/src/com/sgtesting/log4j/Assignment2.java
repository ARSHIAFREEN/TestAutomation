package com.sgtesting.log4j;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.apache.log4j.Logger;

public class Assignment2 {
	public static WebDriver oBrowser=null;
	public static Logger log=Logger.getLogger("For browser successful");
	@Test(priority=1)
		static void LaunchBrowser()
		{
			try
			{
				log.info("Browser launched successfully");
				System.setProperty("webdriver.gecko.driver", "D:\\DemoWorkspace\\Web-Automation\\library\\drivers\\geckodriver.exe");
				oBrowser=new FirefoxDriver();
				oBrowser.manage().window().maximize();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	@Test(priority=2)
		static void navigate()
		{
			try
			{
				log.info("Navigated successfully");
				oBrowser.get("http://localhost:81/login.do");
				Thread.sleep(2000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	@Test(priority=3,dataProvider="getLoginCredentials")
	public void login(String username,String password)
		{
			try
			{
				log.info("Login page has opened successfully");
				oBrowser.findElement(By.xpath("//*[@id='username']")).sendKeys(username);
				oBrowser.findElement(By.xpath("//*[@name='pwd']")).sendKeys(password);
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//div[starts-with(text(),'Log')]")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id='gettingStartedShortcutsMenuCloseId']")).click();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	@Test(priority=4)
		static void CreateUser() {
			try {
				log.info("Create user page opened");
				oBrowser.findElement(By.xpath("//*[@class='content users']")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@class='buttonText']")).click();
				Thread.sleep(2000);
				log.info("Create user");
				oBrowser.findElement(By.xpath("//*[@name='firstName']")).sendKeys("demo");
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@name='lastName']")).sendKeys("user2");
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@name='email']")).sendKeys("demo2@gmail.com");
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@name='username']")).sendKeys("user2");
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@name='password']")).sendKeys("user2");
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@name='passwordCopy']")).sendKeys("user2");
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@class='buttonTitle']")).click();
				log.info("User created successfully");
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	@Test(priority=5)
		static void ModifyUser() {
			try {
				log.info("Modify the user");
				oBrowser.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
				Thread.sleep(5000);
				oBrowser.findElement(By.xpath("//*[@name='firstName']")).clear();
				oBrowser.findElement(By.xpath("//*[@name='lastName']")).clear();
				oBrowser.findElement(By.xpath("//*[@name='email']")).clear();
				Thread.sleep(5000);
				oBrowser.findElement(By.xpath("//*[@name='username']")).clear();
				oBrowser.findElement(By.xpath("//*[@name='password']")).clear();
				oBrowser.findElement(By.xpath("//*[@name='passwordCopy']")).clear();
				Thread.sleep(5000);
				oBrowser.findElement(By.xpath("//*[@name='firstName']")).sendKeys("arshi");
				oBrowser.findElement(By.xpath("//*[@name='lastName']")).sendKeys("afreen");
				oBrowser.findElement(By.xpath("//*[@name='email']")).sendKeys("arshi@gmail.com");
				Thread.sleep(5000);
				oBrowser.findElement(By.xpath("//*[@name='username']")).sendKeys("arshi");
				oBrowser.findElement(By.xpath("//*[@name='password']")).sendKeys("arshi1");
				oBrowser.findElement(By.xpath("//*[@name='passwordCopy']")).sendKeys("arshi1");
				oBrowser.findElement(By.xpath("//*[@class='buttonTitle']")).click();
				Thread.sleep(3000);
				log.info("User modified successfully");
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	@Test(priority=6)
		static void DeleteUser() {
			try {
				log.info("delete the user");
				oBrowser.findElement(By.xpath("//span[contains(text(),'arshi')]")).click();
				Thread.sleep(5000);
				oBrowser.findElement(By.xpath("//*[@class='deleteContainer']")).click();
				Thread.sleep(2000);
				Alert oAlert=oBrowser.switchTo().alert();
				String content=oAlert.getText();
				System.out.println(content);
				oAlert.accept();
				Thread.sleep(5000);

				Thread.sleep(5000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
			log.info("User deleted successfully");
		}
	@Test(priority=7)
		static void logout() {
			try {
				log.info("Logout action performed");
				Thread.sleep(1000);
				oBrowser.findElement(By.xpath("//*[@id='logoutLink']")).click();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	@Test(priority=8)
		static void closeApplication()
		{
			try
			{
				log.info("Application closed successfully");

				oBrowser.close();
			}catch(Exception e)
			{
				e.printStackTrace();
			}

		}
	@DataProvider
	public Object[][] getLoginCredentials()
	{
		return new Object[][]  {{"admin","manager"}};
	}

	}