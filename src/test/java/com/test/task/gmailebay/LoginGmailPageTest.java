package com.test.task.gmailebay;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.task.test.gmailebay.GmailLogin;

public class LoginGmailPageTest
{
@ Test (priority=1)
public void verifyValidLogin()
{
	
System.setProperty("webdriver.chrome.driver", "C:/Malathi Ponseha/Chrome/chromedriver.exe");
WebDriver driver = new ChromeDriver(); 
driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
driver.manage().window().maximize();
driver.get("http://www.gmail.com");
GmailLogin login= new GmailLogin(driver);

login.typeUsername("ponseha30");
login.ClickNext();
//login.typePassword("enter valid password");
String ErrorMessage= GmailLogin.ValidateError();
Assert.assertEquals(ErrorMessage,"Sign in");
//driver.close();
}
@ Test (priority=2)
public void gmailtitletest()
{
	String title= GmailLogin.ValidateGmailTitle();
	Assert.assertEquals(title,"Gmail");
	}
}