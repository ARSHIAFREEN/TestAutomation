package com.sgtesting.log4j;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.apache.log4j.Logger;


public class Assignment5 {
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
	static void CreateCustomer() {
		try {
			log.info("Create a customer");
			oBrowser.findElement(By.xpath("//*[@class='content tasks']")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@class='downIcon']")).click();
			//oBrowser.findElement(By.xpath("//div[contains(text(),'Add')]")).click();
			Thread.sleep(3000);
			log.info("Enter customer details");
			oBrowser.findElement(By.xpath("//*[@class='item createNewCustomer ellipsis']")).click();
			oBrowser.findElement(By.xpath("//*[@id='customerLightBox_nameField']")).sendKeys("Customer1");
			oBrowser.findElement(By.xpath("//*[@id='customerLightBox_descriptionField']")).sendKeys("Customer discription");
            Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id='customerLightBox_commitBtn']")).click();
			Thread.sleep(3000);
			log.info("Customer created successfully");

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=5)
	static void CreateProject() {
		try {
			log.info("Create a project");
			oBrowser.findElement(By.xpath("//*[@class='plusIcon']")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@class='item createNewProject ellipsis']")).click();
			Thread.sleep(3000);
			log.info("Enter project name");
			oBrowser.findElement(By.xpath("//*[@id='projectPopup_projectNameField']")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id='projectPopup_projectNameField']")).sendKeys("Project 1");
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id='projectPopup_commitBtn']")).click();	
			Thread.sleep(3000);
			log.info("Project created successfully");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=6)
	static void DeleteProject() {
		try {
			log.info("Delete the project");
			oBrowser.findElement(By.xpath("//div[contains(text(),'Project 1')]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("/html/body/div[12]/div[1]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("/html/body/div[12]/div[2]/div[4]/div[1]/div[2]/div[3]/div/div/div[2]")).click();
			Thread.sleep(3000);
			log.info("Select the project to delete");
			oBrowser.findElement(By.xpath("/html/body/div[12]/div[2]/div[4]/div[4]/div/div[3]/div")).click();
			Thread.sleep(3000);		
			oBrowser.findElement(By.xpath("//span[contains(text(),'Delete permanently')]")).click();
			oBrowser.findElement(By.xpath("//*[@class='projectPanel_deleteConfirm_submitTitle']")).click();	
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		log.info("Project deleted successfully");
	}
	@Test(priority=7)
	static void DeleteCustomer()
	{
		try {
			log.info("Delete customer");
			oBrowser.findElement(By.xpath("//*[@class='editButton available']")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@class='action']")).click();
			oBrowser.findElement(By.xpath("//div[contains(text(),'Delete')]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id='customerPanel_deleteConfirm_submitTitle']")).click();
			Thread.sleep(3000);	
			log.info("Customer deleted successfully");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=8)
	static void logout() {
		try {
			log.info("Logout action performed");
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id='logoutLink']")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=9)
	static void closeApplication()
	{
		try
		{
			log.info("Application closed successfully");
			Thread.sleep(1000);
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
