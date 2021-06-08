package com.sgtesting.log4j;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.apache.log4j.Logger;

public class Assignment1 {
		public static WebDriver oBrowser=null;
		public static Logger log=Logger.getLogger("For browser successful");
		@Test(priority=1)
		static void LaunchBrowser()
		{
			try
			{
				log.info("Browser launched successfully");
				System.setProperty("webdriver.chrome.driver", "D:\\DemoWorkspace\\Web-Automation\\library\\drivers\\chromedriver.exe");
				oBrowser=new ChromeDriver();
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
				oBrowser.findElement(By.xpath("//*[@name='lastName']")).sendKeys("user1");
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@name='email']")).sendKeys("demo@gmail.com");
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@name='username']")).sendKeys("user11");
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@name='password']")).sendKeys("user");
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@name='passwordCopy']")).sendKeys("user");
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@class='buttonTitle']")).click();
				log.info("User created successfully");
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		@Test(priority=5)
		static void DeleteUser() {
			try {
				log.info("delete the user");
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@class='groupName']")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@class='deleteContainer']")).click();
				Thread.sleep(2000);
				Alert oAlert=oBrowser.switchTo().alert();
				String content=oAlert.getText();
				System.out.println(content);
				oAlert.accept();
				Thread.sleep(2000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
			log.info("User deleted successfully");
		}
		@Test(priority=6)
		static void logout() {
			try {
				log.info("Logout action performed");
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id='logoutLink']")).click();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		@Test(priority=7)
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







