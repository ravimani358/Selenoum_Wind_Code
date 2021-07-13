package selenium.week2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandling_Irctc {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--disable-notifications");
		
		ChromeDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.irctc.co.in/nget/train-search");
		
		driver.manage().window().maximize();
		
		//driver.findElement(By.className("btn btn-primary")).click();
		
		driver.findElement(By.xpath("//button[@class = 'btn btn-primary']")).click();
		
		driver.findElement(By.xpath("(//i[@class = 'fa fa-align-justify'])[1]")).click();
		
		driver.findElement(By.xpath("(//label[@class = 'toggle'])[7]")).click();
		
		Set<String> Window_Handles = driver.getWindowHandles();
		
		List<String> listHandles = new ArrayList<String>(Window_Handles);
		
		String second_Window_Handles = listHandles.get(1);
		
		driver.switchTo().window(second_Window_Handles);
		
		String two_Title = driver.getTitle();
		
		System.out.println(two_Title);
		
		driver.switchTo().window(listHandles.get(0));
		
		String One_Title = driver.getTitle();
		
		System.out.println(One_Title);
		
		

	}

}
