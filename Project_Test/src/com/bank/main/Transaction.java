package com.bank.main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Transaction {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Bhavika Koli\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.get("https://testbank.com");
		driver.findElement(By.id("username")).sendKeys("testuser");
		driver.findElement(By.id("password")).sendKeys("abc1234");
		driver.findElement(By.id("loginbtn")).click();
		
		driver.findElement(By.id("TransactionMenu")).click();
		
	
		
		String amount = "5000";
        new Select(driver.findElement(By.id("fromAcct"))).selectByVisibleText("Savings ‑ 123456");
        new Select(driver.findElement(By.id("toAcct"))).selectByVisibleText("Checking ‑ 987654");
        driver.findElement(By.id("amount")).sendKeys(amount);
        driver.findElement(By.id("btnTransfer")).click();
        
        //String amt=5000;
        new Select(driver.findElement(By.id("fromacc1"))).selectByVisibleText("Saving 1123");
        //new Select(driver.findElement(By.id("To Acc"))).selectByVisibleText("Saving 345");
        //driver.findElement(By.id("amt")).sendKeys(amt);
       driver.findElement(By.xpath("//input[@id='123']"));
    		   
    		 //h3[@class='post-title entry-title']
        
       System.out.println("Hello Git ");
		
		

	}

}
