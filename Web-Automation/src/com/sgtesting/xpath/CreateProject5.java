package com.sgtesting.xpath;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateProject5 {

	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		logout();
		minimizeFlyOutWindow();
		createCustomer();
		createProject();
		deleteProject();
		//deleteCustomer();
		//closeApplication();
		
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
		
		static void createCustomer()
		{
			try
			{
				oBrowser.findElement(By.xpath("//div[text()='TASKS']")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//div[text()='Add New']")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@*='item createNewCustomer ellipsis']")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@*='customerLightBox_nameField']")).sendKeys("Kareena");
				Thread.sleep(2000);
			    oBrowser.findElement(By.xpath("//*[@*='customerLightBox_commitBtn']")).click();
			    Thread.sleep(2000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
		static void createProject()
		{
			try
			{
				oBrowser.findElement(By.xpath("//div[text()='Add New']")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@*='item createNewProject ellipsis']")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@*='projectPopup_projectNameField']")).sendKeys("Orion Mall");
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@*='projectPopup_commitBtn']")).click();
				Thread.sleep(3000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
		static void deleteProject()
		{
			try
			{
				oBrowser.findElement(By.xpath("//*[@*='editButton available']")).click();
				Thread.sleep(3000);
				oBrowser.findElement(By.xpath("//*[@*='action']")).click();
				Thread.sleep(3000);
				oBrowser.findElement(By.xpath("//*[@*='deleteButton']")).click();
				Thread.sleep(3000);
				oBrowser.findElement(By.xpath("//*[@*='projectPanel_deleteConfirm_submitTitle']")).click();
				Thread.sleep(3000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	
		
		static void deleteCustomer()
		{
			try
			{
				oBrowser.findElement(By.xpath("//*[@*='editButton available']")).click();
				Thread.sleep(3000);
				oBrowser.findElement(By.xpath("//*[@*='action']")).click();
				Thread.sleep(3000);
				oBrowser.findElement(By.xpath("//*[@*='title']")).click();
				Thread.sleep(3000);
				oBrowser.findElement(By.xpath("//*[@*='customerPanel_deleteConfirm_submitTitle']")).click();
				Thread.sleep(3000);
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
