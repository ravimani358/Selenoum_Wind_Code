package selenium.week2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class w3school_frame {

	public static void main(String[] args) throws InterruptedException {
		
	WebDriverManager.chromedriver().setup();
	
	ChromeDriver driver = new ChromeDriver();
	
	driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
	
	Thread.sleep(2000);
	
	driver.manage().window().maximize();
	
	driver.switchTo().frame(1);
		
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//button[text()='Try it']")).click();
		
	Thread.sleep(1000);
	
	Alert alert1 = driver.switchTo().alert();
	
	Thread.sleep(2000);
	
	alert1.accept();
	
	Thread.sleep(2000);
			
	String confirm_values = driver.findElement(By.xpath("//p[@id = 'demo']")).getText();
	
	if(confirm_values.equals("You pressed OK!")) {
		
		System.out.println("expected element is clicked");
		
		
	}

	}

}
