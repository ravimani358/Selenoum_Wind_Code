package selenium.week2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Inner_Frames {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("//input[@type = 'text']")).sendKeys("Text Fields");
		
		driver.switchTo().frame("frame3");
		
		driver.findElement(By.id("a")).click();
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(1);
		
		driver.findElement(By.className("col-lg-3")).sendKeys("Avatar");
		
		

	}

}
