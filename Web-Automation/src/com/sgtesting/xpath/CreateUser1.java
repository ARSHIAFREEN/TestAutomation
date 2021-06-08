package com.sgtesting.xpath;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateUser1 {

	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		logout();
		minimizeFlyOutWindow();
		createUser();
		deleteUser();
		closeApplication();
		
}
	
	static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "D:\\DemoWorkspace\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			oBrowser.manage().window().maximize();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static void navigate()
	{
		try
		{
			oBrowser.get("http://localhost:81/login.do");
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void login()
	{
		try
		{
			oBrowser.findElement(By.xpath("//input[starts-with(@name, 'username')]")).sendKeys("admin");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//input[starts-with(@name, 'pwd')]")).sendKeys("manager");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
		
		static void minimizeFlyOutWindow()
		{
			try
			{
				oBrowser.findElement(By.xpath("//*[@*='gettingStartedShortcutsPanelId']")).click();
				Thread.sleep(1000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
		static void createUser()
		{
			try
			{
				oBrowser.findElement(By.xpath("//div[text()='USERS']")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//div[text()='Add User']")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//input[starts-with(@name, 'firstName')]")).sendKeys("demo");
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//input[starts-with(@name, 'lastName')]")).sendKeys("User1");
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//input[starts-with(@name, 'email')]")).sendKeys("demo@gmail.com");
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//input[starts-with(@name, 'username')]")).sendKeys("demoUser11");
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//input[starts-with(@name, 'password')]")).sendKeys("welcome123");
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//input[starts-with(@name, 'passwordCopy')]")).sendKeys("welcome123");
			    Thread.sleep(2000);
			    oBrowser.findElement(By.xpath("//*[@*='buttonTitle']")).click();
			    Thread.sleep(2000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
		
		static void deleteUser()
		{
			try
			{
				oBrowser.findElement(By.xpath("//*[@*='userNameSpan']")).click();
				Thread.sleep(3000);
				oBrowser.findElement(By.xpath("//*[@*='deleteContainer']")).click();
				Thread.sleep(3000);
				Alert oAlert=oBrowser.switchTo().alert();
				String content=oAlert.getText();
				System.out.println(content);
				oAlert.accept();
				Thread.sleep(2000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
		static void logout()
		{
			try
			{
				oBrowser.findElement(By.xpath("Logout")).click();
				Thread.sleep(3000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
		static void closeApplication()
		{
			try
			{
				oBrowser.close();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
}
	
		


		