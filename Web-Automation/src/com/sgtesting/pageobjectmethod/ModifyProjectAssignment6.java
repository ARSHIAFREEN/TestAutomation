package com.sgtesting.pageobjectmethod;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ModifyProjectAssignment6 {
	public static WebDriver oBrowser=null;
	public static ActiTimePages oPage=null;
	public static void main(String[] args) {  //modifyproject
		launchBrowser();
		navigate();
		login();
		flyOutWindow();
		createCustomer();
		createProject();
		modifyProject();
		deleteProject();
		deleteCustomer();
		logout();
		closeApplication();
	}

	static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "D:\\DemoWorkspace\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			oBrowser.manage().window().maximize();
			oPage=new ActiTimePages(oBrowser);
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
			oPage.getUserName().sendKeys("admin");
			oPage.getPassword().sendKeys("manager");
			oPage.getLoginButton().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static void flyOutWindow()
	{
		try
		{
			oPage.getFlyOutWindow().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void createCustomer()
	{
		try
		{
			oPage.getCreateCustomer().click();
			Thread.sleep(3000);
			oPage.getAddCustomer().click();
			Thread.sleep(2000);
			oPage.getSelCustomer().click();
			Thread.sleep(3000);
			oPage. getCusName().sendKeys("Democustomer");
			Thread.sleep(3000);
		    oPage.getDesName().click();
			Thread.sleep(3000);
			oPage.getCommitBtn().click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void createProject()
	{
		try
		{
			oPage.getCreateProject().click();
			Thread.sleep(3000);
			oPage.getCreateProject1().click();
			Thread.sleep(3000);
			oPage.getCreateProject2().click();
			Thread.sleep(3000);
			oPage.getCreateProject3().sendKeys("Demoproject");
			Thread.sleep(3000);
			oPage.getCreateProject4().click();
			Thread.sleep(3000);
			oPage.getCreateProject5().click();
			Thread.sleep(3000);
			oPage.getCreateProject6().click();
			Thread.sleep(3000);
			oPage.getCreateProject7().click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void modifyProject()
	{
		try
		{

			oPage.getModifyProject().click();
			Thread.sleep(4000);
			oPage.getModifyProject1().sendKeys("new project");
			Thread.sleep(4000);
			oPage.getModifyProject2().click();
			Thread.sleep(4000);
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void deleteProject()
	{
		try
		{

			oPage. getDeleteProject().click();
			Thread.sleep(3000);
			oPage. getDeleteProject1().click();
			Thread.sleep(3000);
			oPage. getDeleteProject2().click();
			Thread.sleep(3000);
			oPage. getDeleteProject3().click();
			Thread.sleep(3000);
			oPage. getDeleteProject4().click();
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
			oPage. getDeleteCustomer().click();
			Thread.sleep(4000);
			oPage.getDeleteCustomer1().click();
			Thread.sleep(4000);
			oPage.getDeleteCustomer2().click();
			Thread.sleep(4000);
			oPage.getDeleteCustomer3().click();
			Thread.sleep(4000);
			oPage.getDelCusName().click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void logout()
	{
		try
		{
			oPage.getLogoutLink().click();
			Thread.sleep(2000);
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




