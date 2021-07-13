package Selenium_Weel_1_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Edit_Page {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leafground.com/pages/Edit.html");
		
		driver.manage(). window().maximize();
		
		driver.findElement(By.id("email")).sendKeys("ravimani358@gmail.com");
		
		driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/input")).clear();
		
		driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/input")).sendKeys("Append a text and press keyboard tab");
		
		System.out.println(driver.findElement(By.xpath("(//input[@name = 'username'])[1]")).getAttribute("value"));
				
		driver.findElement(By.xpath("(//input[@name = 'username'])[2]")).clear();
		
		System.out.println(driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/div/div/input")).isEnabled());
		
		driver.quit();

	}

}
