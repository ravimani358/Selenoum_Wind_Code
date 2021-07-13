package selenium.week2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class nykaa {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--disable-notifications");
		
		ChromeDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.nykaa.com/");
		
		driver.manage().window().maximize();
		
		WebElement brand_hover = driver.findElement(By.xpath("//a[text() = 'brands']"));
		
		Actions builders = new Actions(driver);
		
		builders.moveToElement(brand_hover).perform();
		
		Thread.sleep(1000);
		
		driver.findElement(By.id("brandSearchBox")).sendKeys("L'Oreal Paris");
		
		driver.findElement(By.xpath("(//a[contains(text() , 'Oreal Paris')])[1]")).click();
		
		Thread.sleep(1000);
		
		String Mrp_values = driver.findElement(By.xpath("(//span[@class = 'mrp-price'])[1]")).getText();
		
		System.out.println(Mrp_values);
		
		WebElement preview_shades = driver.findElement(By.xpath("(//div[@class = 'product-list-box card desktop-cart'])[1]"));
		
		Actions builders1 = new Actions(driver);
		
		Thread.sleep(1000);
		
		builders1.moveToElement(preview_shades).perform();
		
		driver.findElement(By.xpath("(//button[@class = 'primary-btn common-btn '])[1]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//button[contains(@class , 'atc-configurable')])[1]")).click();
		
		driver.findElement(By.className("AddBagIcon")).click();
		
		Thread.sleep(1000);
		
		String product_price = driver.findElement(By.xpath("//div[@class = 'value medium-strong']")).getText();
		
		System.out.println(product_price);
		
		Thread.sleep(5000);
		
		driver.findElement(By.className("second-col")).click();
		
		//driver.findElement(By.xpath("//button[@class = 'btn full fill no-radius proceed ']")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[@class = 'btn full big']")).click();
		
		String Grand_Total = driver.findElement(By.xpath("(//div[@class = 'value'])[2]")).getText();
		
		System.out.println(Grand_Total);
		
		if(product_price.equals(Grand_Total)) {
			System.out.println("print values are correct");
		}
		
		else {
			System.out.println("pls check code once again");
		}
	}

}
