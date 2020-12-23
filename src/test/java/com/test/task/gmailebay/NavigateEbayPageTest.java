package com.test.task.gmailebay;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.task.test.gmailebay.*;


public class NavigateEbayPageTest
{
@ Test (priority=1)
public void verifyFirstItemPrice()
{
	

System.setProperty("webdriver.chrome.driver", "C:/Malathi Ponseha/Chrome/chromedriver.exe");
WebDriver driver = new ChromeDriver(); 
driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
driver.manage().window().maximize();
driver.get("http://www.ebay.com");


EbayNavigation eBay= new EbayNavigation(driver);

eBay.SearchItem("electric guitar");

eBay.ClickSearch();
}
@ Test (priority=2)
public void ValidateFirstPrlicelist()
{
	String ItemPrice= EbayNavigation.FirstPrlicelist();
	System.out.println("First Item Price is  "+ItemPrice);
	
}
}

