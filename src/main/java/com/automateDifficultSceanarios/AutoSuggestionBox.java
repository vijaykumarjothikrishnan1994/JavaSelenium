package com.automateDifficultSceanarios;

import java.awt.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AutoSuggestionBox {
	
	WebDriver driver=null;
	
	@Test
	public void AutomateSuggestionBox_Method() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vijay Krishnan\\.m2\\repository\\org\\seleniumhq\\selenium\\selenium-chrome-driver\\3.141.59\\Selenium_StandAlone\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.navigate().to("https://www.google.com/");
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("india");
		
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
java.util.List<WebElement> listofelements=driver.findElements(By.xpath("//ul[@role='listbox']//li"));
		
		//List<WebElement> listofwebelement =driver.findElements(By.xpath("//ul[@role='listbox']//li"));
		
		for (WebElement webElement : listofelements) {
			
			String listofvalue=webElement.getText();
			
			System.out.println(listofvalue);
			
		if(listofvalue.equals("india map"))
		{
			webElement.click();
			
			break;
		}
		
		
	}
	
	}
	
	public void SecondMethod()
	{
		java.util.List<WebElement> listofelements=driver.findElements(By.xpath("//ul[@role='listbox']//li"));
		
		//List<WebElement> listofwebelement =driver.findElements(By.xpath("//ul[@role='listbox']//li"));
		
		for (WebElement webElement : listofelements) {
			
			String listofvalue=webElement.getText();
			
			System.out.println(listofvalue);
			
			
		}
	}
	
	
	
	

}
