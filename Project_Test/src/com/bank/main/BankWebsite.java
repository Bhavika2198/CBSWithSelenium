package com.bank.main;



import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class BankWebsite {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Bhavika Koli\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				driver.get("https://testautomationpractice.blogspot.com/");
				driver.manage().window().maximize();
				//driver.findElement(By.xpath("//input[@type='text']")).sendKeys("BPCL");
				//Thread.sleep(2000);
				//Select dropdown=new Select(driver.findElement(By.xpath("//select[@id='country']")));)
				//dropdown.selectByVisibleText("option");	
				//List<WebElement> countries=driver.findElements(By.id("country);				
				//countries.get(4).click();
		
						//driver.navigate().to("https://www.mscbank.com/");
				//driver.navigate().refresh();
				//driver.close();
				
				//Select dropdown=new Select(driver.findElement(By.className("//select[@id='searchDropdownBox']]")));
				//dropdown.selectByVisibleText("Options");
				
				//driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Watches");
				
				//driver.findElement(By.xpath("//input[@id='sunday']")).click();
				//List<WebElement> checkboxes=driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
				//for(int i=0;i<checkboxes.size();i++) {
				//	checkboxes.get(i).click();
				//}
				//driver.findElement(By.id())
				
				/*Thread.sleep(2000);
				driver.findElement(By.xpath("//a[@id='link_5']")).click();
				dr*/
				
				
				
		

	}

}
