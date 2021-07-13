package Selenium_Weel_1_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class sleep_search_leads {

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
				
		driver.findElement(By.id("ext-gen248")).sendKeys("a");
				
		driver.findElement(By.id("ext-gen334")).click();
						
		Thread.sleep(1000); 
		
		driver.findElement(By.xpath("(//a[@class = 'linktext'])[4]")).click();
		
		// View Lead | opentaps CRM
		
		String Title = driver.getTitle();
				
		if(Title.equals("View Lead | opentaps CRM")) {
			System.out.println("Redirect page is correct");
		}
		else {
			System.out.println("Redirect page is wrong");
		}
		
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("TestLeaf");
		
		driver.findElement(By.className("smallSubmit")).click();
		
		driver.quit();
		
	}

}
