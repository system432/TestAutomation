package com.sgtesting.tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		{	

			launchbrowser();
			Navigate();
			Login();
		MinimizeFlyOutWindow();
		createuser();
		 modifyuser();
		 deleteuser();
		 logout();
		 CloseApp();
			
		}	
	}
		public static void launchbrowser()
		{
			try
			{
				String path=System.getProperty("user.dir");
				System.setProperty("webdriver.chrome.driver", path+"\\Library\\drivers\\chromedriver.exe");
				oBrowser=new ChromeDriver();
			}catch(Exception e)
			{
				e.printStackTrace();

			}

		}
		
		public static void Navigate()
		{
			try
			{
				oBrowser.get("http://localhost:81/login.do");
				
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		static void Login()
		{
			try
			{
				oBrowser.findElement(By.name("username")).sendKeys("admin");
				oBrowser.findElement(By.name("pwd")).sendKeys("manager");
				oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
				Thread.sleep(5000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		static void CloseApp()
		{
			try
			{
				oBrowser.close();
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
		static void MinimizeFlyOutWindow()
		{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\"gettingStartedShortcutsPanelId\"]/div[1]")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}

}
		static void createuser()
		{
			try
			{
				oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div/div[2]")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.name("firstName")).sendKeys("user2");
				Thread.sleep(2000);
				oBrowser.findElement(By.name("lastName")).sendKeys("demo2");
				Thread.sleep(2000);
				oBrowser.findElement(By.name("email")).sendKeys("1234@gamil.com");
				Thread.sleep(2000);
				oBrowser.findElement(By.name("username")).sendKeys("userdemo");
				Thread.sleep(2000);
				oBrowser.findElement(By.name("password")).sendKeys("223344");
				Thread.sleep(2000);
				oBrowser.findElement(By.name("passwordCopy")).sendKeys("223344");
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
				Thread.sleep(2000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		static void modifyuser()
		{
			try
			{
				oBrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.name("username")).sendKeys("user123");
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
				Thread.sleep(2000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		static void deleteuser()
		{
			try
			{
				oBrowser.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
				Thread.sleep(2000);
				Alert oAlert=oBrowser.switchTo().alert();
				String textcontent=oAlert.getText();
				System.out.println(textcontent);
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
				oBrowser.findElement(By.id("logoutLink")).click();
				Thread.sleep(2000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
}


