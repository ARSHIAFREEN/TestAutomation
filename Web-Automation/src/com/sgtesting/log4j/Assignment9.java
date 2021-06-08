package com.sgtesting.log4j;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.apache.log4j.Logger;

public class Assignment9 {
	public static WebDriver oBrowser=null;
	public static Logger log=Logger.getLogger("For browser successful");
	@Test(priority=1)
	static void launchBrowser()
	{
		try
		{
			log.info("Browser launched successfully");
			System.setProperty("webdriver.chrome.driver", "D:\\DemoWorkspace\\Web-Automation\\Library\\drivers\\chromedriver.exe");
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
	@Test(priority=3)
	static void Adminlogin()
	{
		try
		{
			log.info("Login page displayed");
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(2000);
			log.info("Login successfull as Admin");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=4)
	static void minimizeFlyOutWindow()
	{
		try
		{
			log.info("Page minimized successfully");
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=5)
	static void User1()
	{
		try
		{
			log.info("Create User1");
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='createUserDiv']/div/div[2]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.name("firstName")).sendKeys("User1");
			oBrowser.findElement(By.name("lastName")).sendKeys("Demo1");
			oBrowser.findElement(By.name("email")).sendKeys("user1@gmail.com");
			oBrowser.findElement(By.name("username")).sendKeys("User1");
			oBrowser.findElement(By.name("password")).sendKeys("User1");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("User1");
			oBrowser.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click();
			Thread.sleep(5000);
			log.info("User1 created successfully");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=6)
	static void logout()
	{
		try
		{
			log.info("Logout successfull");
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=7)
	static void User1Loging()
	{
		try
		{
            log.info("Login as User1");
			oBrowser.findElement(By.id("username")).sendKeys("User1");
			oBrowser.findElement(By.name("pwd")).sendKeys("User1");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"welcomeScreenBoxId\"]/div[3]/div/span[1]")).click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		log.info("Login successful as User1");
	}
	@Test(priority=8)
	static void User2()
	{
		try
		{
			log.info("Create User2");
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='createUserDiv']/div/div[2]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.name("firstName")).sendKeys("User2");
			oBrowser.findElement(By.name("lastName")).sendKeys("Demo2");
			oBrowser.findElement(By.name("email")).sendKeys("User2@gmail.com");
			oBrowser.findElement(By.name("username")).sendKeys("User2");
			oBrowser.findElement(By.name("password")).sendKeys("User2");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("User2");
			oBrowser.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click();
			Thread.sleep(5000);
			log.info("User2 created successfully");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=9)
	static void User1logout()
	{
		try
		{
			log.info("Logout as User1");
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=10)
	static void User2Loging()
	{
		try
		{
			log.info("Login as User2");
			oBrowser.findElement(By.id("username")).sendKeys("User2");
			oBrowser.findElement(By.name("pwd")).sendKeys("User2");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"welcomeScreenBoxId\"]/div[3]/div/span[1]")).click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		log.info("Login successful as User2");
	}
	@Test(priority=11)
	static void User3()
	{
		try
		{
			log.info("Create User3");
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='createUserDiv']/div/div[2]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.name("firstName")).sendKeys("User3");
			oBrowser.findElement(By.name("lastName")).sendKeys("Demo3");
			oBrowser.findElement(By.name("email")).sendKeys("User3@gmail.com");
			oBrowser.findElement(By.name("username")).sendKeys("User3");
			oBrowser.findElement(By.name("password")).sendKeys("User3");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("User3");
			oBrowser.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click();
			Thread.sleep(5000);
			log.info("User3 created successfully");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=12)
	static void User2Logout()
	{
		try
		{
			log.info("Logout as User2");
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=13)
	static void Admin1login()
	{
		try
		{
			log.info("Login as Admin1");
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	@Test(priority=14)
	static void ModifyUser1() {
		try {
			log.info("Modify User1");
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[1]/td[1]/div/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(2000);
			log.info("Enter the details");
			oBrowser.findElement(By.name("firstName")).clear();
			oBrowser.findElement(By.name("lastName")).clear();
			oBrowser.findElement(By.name("email")).clear();
			oBrowser.findElement(By.name("username")).clear();
			oBrowser.findElement(By.name("password")).clear();
			oBrowser.findElement(By.name("passwordCopy")).clear();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("firstName")).sendKeys("demo1");
			oBrowser.findElement(By.name("lastName")).sendKeys("demo1");
			oBrowser.findElement(By.name("email")).sendKeys("demo1@gmail.com");
			oBrowser.findElement(By.name("username")).sendKeys("demo1");
			oBrowser.findElement(By.name("password")).sendKeys("demo1");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("demo1");
			oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_commitBtn\"]")).click();
			Thread.sleep(5000);
			log.info("User1 modified successfully");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=15)
	static void Admin1logout()
	{
		try
		{
			log.info("Logout as Admin1");
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=16)
	static void User1LogingAgain()
	{
		try
		{
            log.info("Login again as User1");
			oBrowser.findElement(By.id("username")).sendKeys("demo1");
			oBrowser.findElement(By.name("pwd")).sendKeys("demo1");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"welcomeScreenBoxId\"]/div[3]/div/span[1]")).click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=17)
	static void ModifyUser2() {
		try {
			log.info("Modify User2");
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(2000);
			log.info("Enter the details");
			oBrowser.findElement(By.name("firstName")).clear();
			oBrowser.findElement(By.name("lastName")).clear();
			oBrowser.findElement(By.name("email")).clear();
			oBrowser.findElement(By.name("username")).clear();
			oBrowser.findElement(By.name("password")).clear();
			oBrowser.findElement(By.name("passwordCopy")).clear();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("firstName")).sendKeys("demo2");
			oBrowser.findElement(By.name("lastName")).sendKeys("demo2");
			oBrowser.findElement(By.name("email")).sendKeys("demo2@gmail.com");
			oBrowser.findElement(By.name("username")).sendKeys("demo2");
			oBrowser.findElement(By.name("password")).sendKeys("demo2");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("demo2");
			oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_commitBtn\"]")).click();
			Thread.sleep(5000);
			log.info("User2 modified successfully");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=18)
	static void User1logoutAgain()
	{
		try
		{
			log.info("Logout again as User1");
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=20)
	static void User2LogingAgain()
	{
		try
		{
			log.info("Login again as User2");
			oBrowser.findElement(By.id("username")).sendKeys("demo2");
			oBrowser.findElement(By.name("pwd")).sendKeys("demo2");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"welcomeScreenBoxId\"]/div[3]/div/span[1]")).click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=21)
	static void ModifyUser3() {
		try {
			log.info("Modify User3");
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[3]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(2000);
			log.info("Enter details");
			oBrowser.findElement(By.name("firstName")).clear();
			oBrowser.findElement(By.name("lastName")).clear();
			oBrowser.findElement(By.name("email")).clear();
			oBrowser.findElement(By.name("username")).clear();
			oBrowser.findElement(By.name("password")).clear();
			oBrowser.findElement(By.name("passwordCopy")).clear();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("firstName")).sendKeys("demo3");
			oBrowser.findElement(By.name("lastName")).sendKeys("demo3");
			oBrowser.findElement(By.name("email")).sendKeys("demo3@gmail.com");
			oBrowser.findElement(By.name("username")).sendKeys("demo3");
			oBrowser.findElement(By.name("password")).sendKeys("demo3");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("demo3");
			oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_commitBtn\"]")).click();
			Thread.sleep(5000);
			log.info("User3 modified successfully");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=22)
	static void User2LogoutAgain()
	{
		try
		{
			log.info("Logout again as User2");
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=23)
	static void User2LogingAgainAgain()
	{
		try
		{
			log.info("Login again as User2");
			oBrowser.findElement(By.id("username")).sendKeys("demo2");
			oBrowser.findElement(By.name("pwd")).sendKeys("demo2");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"welcomeScreenBoxId\"]/div[3]/div/span[1]")).click();
			Thread.sleep(3000);
			log.info("Login successfull");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=24)
	static void deleteUser3()
	{
		try
		{
			log.info("Delete User3");
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[3]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
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
		log.info("User3 deleted successfully");
	}
	@Test(priority=25)
	static void User2LogoutAgainAgain()
	{
		try
		{
			log.info("Logout again as User2");
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=26)
	static void User1LogingAgainAgain()
	{
		try
		{
            log.info("Login again as User1");
			oBrowser.findElement(By.id("username")).sendKeys("demo1");
			oBrowser.findElement(By.name("pwd")).sendKeys("demo1");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"welcomeScreenBoxId\"]/div[3]/div/span[1]")).click();
			Thread.sleep(3000);
			log.info("Login successfull");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=27)
	static void deleteUser2()
	{
		try
		{
			log.info("Delete User2");
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
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
		log.info("User2 deleted successfully");
	}
	@Test(priority=28)
	static void User1logoutAgainAgain()
	{
		try
		{
			log.info("Logout again as User1");
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=29)
	static void Admin1loginAgain()
	{
		try
		{
			log.info("Login again as Admin1");
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(2000);
			log.info("Login successfull");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=30)
	static void deleteUser1()
	{
		try
		{
			log.info("Delete User1");
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[1]/td[1]/div/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
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
		log.info("User1 deleted successfully");
	}
	@Test(priority=31)
	static void Admin1logoutAgainAgain()
	{
		try
		{
			log.info("Logout again as Admin1");
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=32)
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
}



