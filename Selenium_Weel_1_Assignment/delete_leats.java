package Selenium_Weel_1_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class delete_leats {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		
		driver.findElement(By.xpath("//a[text() = 'Leads']")).click();
		
		driver.findElement(By.xpath("//a[text() = 'Find Leads']")).click();
		
		driver.findElement(By.xpath("//span[text() = 'Phone']")).click();
		
		driver.findElement(By.id("ext-gen270")).sendKeys("9943776013");
		
		driver.findElement(By.id("ext-gen334")).click();
		
		Thread.sleep(1000); 
		
		//int capture_id = //a[@class = 'linktext'])[4];
		
		String Capture_id = driver.findElement(By.xpath("(//a[@class = 'linktext'])[4]")).getText();
		
		System.out.println(Capture_id);
		
		driver.findElement(By.xpath("(//a[@class = 'linktext'])[4]")).click();
		
		driver.findElement(By.xpath("//a[text() = 'Delete']")).click();
		
		driver.findElement(By.xpath("//a[text() = 'Find Leads']")).click();
		
		driver.findElement(By.xpath("(//input[contains(@class, ' x-form-text x-form-field')])[28]")).sendKeys(Capture_id);
		
		driver.findElement(By.xpath("//button[text() = 'Find Leads']")).click();
		
		Thread.sleep(2000);
		
		String result = driver.findElement(By.xpath("//div[text() = 'No records to display']")).getText();
				
		System.out.println(result);
		
		if(result.equals("No records to display")) {
			System.out.println("Redirect page is correct");
		}
		else {
			System.out.println("Redirect page is wrong");
		}
		
		
		
	}

}
