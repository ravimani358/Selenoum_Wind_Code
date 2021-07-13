package selenium.week2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class servicenow {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://dev113545.service-now.com");
		
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.id("user_name")).sendKeys("admin");
		
		driver.findElement(By.id("user_password")).sendKeys("m3GkKEKU8atr");
		
		driver.findElement(By.id("sysverb_login")).click();
		
		driver.switchTo().defaultContent();
		
		Thread.sleep(1000);
		
		driver.findElement(By.id("filter")).sendKeys("incident");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//div[text() = 'All'])[2]")).click();
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.id("sysverb_new")).click();
		
		driver.findElement(By.id("sys_display.incident.caller_id")).sendKeys("a");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//td[contains(@class, 'ac_cell')])[1]")).click();
		
		driver.findElement(By.id("incident.short_description")).sendKeys("iam so happy to test");
		
		String numbers = driver.findElement(By.xpath("//input[@id = 'incident.number']")).getAttribute("value");
		
		System.out.println(numbers);
		
		driver.findElement(By.id("sysverb_insert")).click();
		
		driver.findElement(By.xpath("(//input[@class = 'form-control'])[1]")).sendKeys(numbers);
		
		WebElement textbox = driver.findElement(By.xpath("(//input[@class = 'form-control'])[1]"));
		
		textbox.sendKeys(Keys.ENTER);

	}

}
