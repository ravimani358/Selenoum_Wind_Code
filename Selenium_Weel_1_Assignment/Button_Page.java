package Selenium_Weel_1_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Button_Page {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leafground.com/pages/Button.html");
		
		driver.manage().window().maximize();
		
		// Print X and Y location
		System.out.println(driver.findElement(By.id("position")).getLocation());
		
		// Find Color
		System.out.println(driver.findElement(By.id("color")).getCssValue("background-color"));
		
		// Find Size
		System.out.println(driver.findElement(By.id("size")).getSize());
		
		// Click Button
		driver.findElement(By.id("home")).click();
		
		driver.quit();
		
		

	}

}
