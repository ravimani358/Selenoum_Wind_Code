package Selenium_Weel_1_Assignment;

import org.openqa.selenium.By;  
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;  
import org.openqa.selenium.support.ui.Select;  

import io.github.bonigarcia.wdm.WebDriverManager;

public class Learn_Listboxes {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leafground.com/pages/Dropdown.html");
		
		driver.manage().window().maximize();
		
		
		// Select training program using Index
		WebElement dropdown1 = driver.findElement(By.id("dropdown1"));
				
		Select dd1 = new Select(dropdown1);
				
		dd1.selectByIndex(3);
		
		
		// Select training program using Text
		WebElement dropdown2 = driver.findElement(By.name("dropdown2"));
		
		Select dd2 = new Select(dropdown2);
				
		dd2.selectByVisibleText("Selenium");
		
		
		// Select training program using Value
		WebElement dropdown3 = driver.findElement(By.id("dropdown3"));
		
		Select dd3 = new Select(dropdown3);
		
		dd3.selectByValue("3");
		
		//Get the number of dropdown options
		
		WebElement dropdown4 = driver.findElement(By.xpath("//select[@class = 'dropdown']"));
		
		Select dd4 = new Select(dropdown4);
		
		int dropdown_value = dd4.getOptions().size()-1;
		
		System.out.println("maxmum Dropdown values "+dropdown_value);
		
		//
		
		driver.findElement(By.xpath("//option[contains(text(),'You can also use sendKeys to select')]/..")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//option[contains(text(),'You can also use sendKeys to select')]/..")).sendKeys("Selenium");
		
		// Select Your Programmer
		driver.findElement(By.xpath("//option[contains(text(),'Select your programs')]/..")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//option[contains(text(),'Select your programs')]/..")).sendKeys("Selenium");
	}



}