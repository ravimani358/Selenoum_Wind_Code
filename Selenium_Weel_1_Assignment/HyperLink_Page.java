package Selenium_Weel_1_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HyperLink_Page {

	public static void main(String[] args) {
				
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();
				
		driver.get("http://leafground.com/pages/Link.html");
		
		driver.manage().window().maximize();
		
		// Find where am supposed to go without clicking me?
		System.out.println(driver.findElement(By.xpath("//a[text()='Find where am supposed to go without clicking me?']")).getAttribute("href"));
		
		//(Interact with same link name)
		//driver.findElement(By.xpath("(//a[text() = 'Go to Home Page'])[2]")).click();
		
		//Click to Home Page
		driver.findElement(By.xpath("(//a[text() = 'Go to Home Page'])[1]")).click();
		
		driver.quit();
		
	}

}
