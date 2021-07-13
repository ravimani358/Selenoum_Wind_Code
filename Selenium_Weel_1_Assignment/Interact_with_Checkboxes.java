package Selenium_Weel_1_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Interact_with_Checkboxes {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leafground.com/pages/checkbox.html");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//input[contains(text(),'')])[1]")).click();
		
		System.out.println(driver.findElement(By.xpath("(//input[contains(text(),'')])[6]")).isSelected());
		
		driver.findElement(By.xpath("(//input[contains(text(),'')])[8]")).click();
		
		////input[contains(text(),'')])[8]
		
		for(int i=9; i<=13; i++) {			
			String Xpath1 = "(//input[contains(text(),'')])[";
			String Xpath2 = "]";
			
			String Main_Xpath = Xpath1+i+Xpath2;
			
			//System.out.println(Main_Xpath);
			
			driver.findElement(By.xpath(Main_Xpath)).click();
			
			
		}
		
		
		
	}

}
