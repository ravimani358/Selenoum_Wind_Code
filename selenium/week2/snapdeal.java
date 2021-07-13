package selenium.week2;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class snapdeal {

	public static void main(String[] args) throws InterruptedException, IOException {
	
		
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--disable-notifications");
		
		ChromeDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.snapdeal.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		WebElement Mens_Fashion = driver.findElement(By.xpath("(//span[contains(text(),'Fashion')])[5]"));
		
		Actions builders = new Actions(driver);
		
		builders.moveToElement(Mens_Fashion).perform();
		
		System.out.println("mains");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//span[text()='Sports Shoes'])[1]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//input[@class = 'sd-input'])[2]")).sendKeys("614616");
		
		driver.findElement(By.xpath("//button[@class = 'pincode-check']")).click();
		
		Thread.sleep(1000);
		
		String Count_shoes = driver.findElement(By.className("category-count")).getText();
		
		System.out.println(Count_shoes);
		
		driver.findElement(By.xpath("//div[text() = 'Training Shoes']")).click();
		
		Thread.sleep(1000);
		
		//driver.findElement(By.xpath("//i[@class = 'sd-icon sd-icon-expand-arrow sort-arrow']")).sendKeys("Price Low To High");
		
		//String element = driver.findElement(By.xpath("(//div[@class = 'product-desc-rating '])[1]")).getText();
		
		WebElement Product = driver.findElement(By.xpath("(//div[@class = 'clearfix row-disc'])[1]"));
		
		Actions builders1 = new Actions(driver);
		
		builders1.moveToElement(Product).perform();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//div[contains(text(),'Quick View')])[1]")).click();
		
		Set<String> Window_Handles = driver.getWindowHandles();
		
		List<String> listHandles = new ArrayList<String>(Window_Handles);
		
		String second_Window_Handles = listHandles.get(1);
		
		driver.switchTo().window(second_Window_Handles);
		
		WebElement Images = driver.findElement(By.xpath("(//*[@class = 'cloudzoom'])[1]"));
		
		File Source = Images.getScreenshotAs(OutputType.FILE);
		
		File target = new File("./snaps/screen/lg.png");
		
		FileUtils.copyFile(Source, target);
		
		driver.close();
		
		driver.switchTo().window(listHandles.get(0));
		
	}

}
