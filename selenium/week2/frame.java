package selenium.week2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class frame {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leafground.com/pages/frame.html");
		
		driver.manage().window().maximize();
				
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Thread.sleep(1000);
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("//button[@id ='Click']")).click();
				
		Thread.sleep(1000);
				
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(1);
		
		driver.switchTo().frame("frame2");
		
		driver.findElement(By.xpath("//button[@id ='Click1']")).click();
		
		// To get the total number of f frame in over all programs
		
		 List<WebElement> f = driver.findElements(By.tagName("iframe"));
		 
		 System.out.println(f.size() + " total frames in code");
	}

}
