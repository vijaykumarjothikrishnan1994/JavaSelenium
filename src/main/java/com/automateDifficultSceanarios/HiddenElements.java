package com.automateDifficultSceanarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class HiddenElements {
	////input[@name='show-hide']
	
	@Test
	public void ElementHidden() {
		
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Vijay Krishnan\\Desktop\\DesktoP\\software\\FFDriver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.navigate().to("https://learn.letskodeit.com/p/practice");
		
		driver.findElement(By.xpath("//input[@value='Hide']")).click();	
	Boolean en=	driver.findElement(By.xpath("//input[@name='show-hide']")).isEnabled();
	
	System.out.println("Check box status    : "+en);
	
	
	
	
	
	if(en.TRUE)
	{
		System.out.println("Emabled");
	}
	else
	{
		driver.findElement(By.xpath("//input[@value='Show']")).click();
		
		Boolean en1=	driver.findElement(By.xpath("//input[@name='show-hide']")).isEnabled();
		System.out.println("Btn is enabled"+en1);
	}
		
	}

}
