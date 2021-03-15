package com.sgtesting.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserDemo {
	public static WebDriver oBrowser=null;

	public static void main(String[] args) {
		launchBrowser();	
		 navigate();
	}
	public static void launchBrowser()
	{
		try {
			String path=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver",path+"\\Library\\Drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		}
	
public static void navigate()
{
	try {
		oBrowser.get("http://localhost:81/login.do");
		
	}catch (Exception e)
	{
		e.printStackTrace();
	}
}
	}


