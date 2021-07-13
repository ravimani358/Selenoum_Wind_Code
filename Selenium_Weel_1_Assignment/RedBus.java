package Selenium_Weel_1_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RedBus {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.redbus.in/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("src")).sendKeys("chennai");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//li[text() = 'Chennai']")).click();
				
		driver.findElement(By.id("dest")).sendKeys("Bangalore");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//li[text() = 'Bangalore']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[contains(@class , \"fl icon-calendar_icon-new icon-onward-calendar icon\")]")).click();
				
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//td[@class = \"next\"]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//td[contains(@class,'wd day')])[1]")).click();
				
		driver.findElement(By.id("search_btn")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//i[contains(@class,'icon icon-close c-fs')]")).click();
		
		Thread.sleep(2000);
		
		System.out.println("After Execution");
		
		String totalresult = driver.findElement(By.xpath("//span[contains(@class,'f-bold busFound')]")).getText();
		
		System.out.println("1st Normal " + totalresult);
		
		driver.findElement(By.xpath("(//label[contains(@class,'custom-checkbox')])[5]")).click();
		
		Thread.sleep(4000);
		
		String sleeper_result = driver.findElement(By.xpath("//span[contains(@class,'f-bold busFound')]")).getText();
		
		System.out.println("2nd Sleepers " + sleeper_result);
		
		driver.findElement(By.xpath("(//label[contains(@class,'custom-checkbox')])[6]")).click();
		
		Thread.sleep(4000);
		
		String AC_result = driver.findElement(By.xpath("//span[contains(@class,'f-bold busFound')]")).getText();

		System.out.println("3rd AC " +AC_result);
		
		
		
		
	}

}
