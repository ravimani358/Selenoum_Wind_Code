package selenium.week2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class railway {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		//Load the URL
		
		driver.get("https://erail.in/");
		
		//Maximize screen
		
		driver.manage().window().maximize();

		driver.findElement(By.id("txtStationFrom")).clear();
		
		driver.findElement(By.id("txtStationFrom")).sendKeys("ms");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[text() = 'Chennai Egmore']")).click();
		
		driver.findElement(By.id("txtStationTo")).clear();
		
		driver.findElement(By.id("txtStationTo")).sendKeys("mdu");
				
		driver.findElement(By.xpath("//div[text() = 'Madurai Jn']")).click();
		
		driver.findElement(By.id("chkSelectDateOnly")).click();
		
		//DataTable TrainList TrainListHeader
		
		Thread.sleep(2000);
		
		WebElement Web_table = driver.findElement(By.xpath("//table[@class = 'DataTable TrainList TrainListHeader']"));
		 		
		Thread.sleep(2000);
		
		List<WebElement> Table_rows = Web_table.findElements(By.tagName("tr"));
		
		Thread.sleep(2000);
		
		//System.out.println(all_train_number);
		
		for(int i =1; i<Table_rows.size(); i++) {
			
			WebElement all_train_number = Table_rows.get(i);
			
			List <WebElement> train_number = all_train_number.findElements(By.tagName("td"));
			
			String final_values = train_number.get(1).getText();
			
			System.out.println(final_values);
			
		}


	}
}