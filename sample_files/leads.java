package sample_files;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class leads {
	
public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		//Load the URL
		
		driver.get("http://leaftaps.com/opentaps/control/logout");
		
		//Maximize screen
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		String Title = driver.getTitle();
		
		System.out.println(Title + "Webpage Tile");
		
		// get Title of the page
				
		String heading = driver.findElement(By.tagName("h2")).getText();
		
		System.out.println("string "+ heading);
		
		driver.findElement(By.ByTagName.linkText("CRM/SFA")).click();
		
		driver.findElement(By.ByTagName.linkText("Leads")).click(); //->//a[text() = 'Leads']
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("123");
		
	}

}
