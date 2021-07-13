package selenium.week2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Lensecart {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--disable-notifications");
		
		ChromeDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.lenskart.com");
		
		driver.manage().window().maximize();
		
		WebElement Computer_class = driver.findElement(By.xpath("//a[text() = 'Computer Glasses']"));
		
		Actions builders = new Actions(driver);
		
		builders.moveToElement(Computer_class).perform();
		
		Thread.sleep(1000);
						
		driver.findElement(By.xpath("(//span[text() = 'men'])[2]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//span[text() = 'PREMIUM RANGE'])[1]")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//span[text() = 'Round'])[1]")).click();
		
		Thread.sleep(3000);
		
		int size= driver.findElements(By.xpath("//li[@class = 'list-checkbox']")).size();
		
		System.out.println(size);
		
		List<String> choose_options = new ArrayList<String>();
		
		for(int i = 1; i<size; i++) {
			
			String lists = driver.findElement(By.xpath("(//li[@class = 'list-checkbox'])["+i+"]")).getText();	
			
			String replace = lists.replaceAll("[a-zA-Z(-)]", "");
			
			choose_options.add(replace);
			
		}
		
		System.out.println(choose_options);
		
		Thread.sleep(4000);
				
		driver.findElement(By.xpath("(//li[@class = 'list-checkbox'])[1]")).click();
		
		
		
		
		
		
		
	}

}
