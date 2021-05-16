package com.automateDifficultSceanarios;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class EnabledorNot {
	
	
	
	//http://www.seleniumframework.com/Practiceform/
	
	@Test
	public void EnabledorNot() {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vijay Krishnan\\.m2\\repository\\org\\seleniumhq\\selenium\\selenium-chrome-driver\\3.141.59\\Selenium_StandAlone\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.navigate().to("http://www.seleniumframework.com/Practiceform/");
	
		Boolean bvalue=driver.findElement(By.xpath("//button[@id='alert']")).isEnabled();
		
		System.out.println(bvalue);
		
		
		
		
	}

}
