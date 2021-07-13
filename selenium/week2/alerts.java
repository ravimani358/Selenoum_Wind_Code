package selenium.week2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class alerts {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://www.leafground.com/pages/Alert.html");

		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[text()='Alert Box']")).click();
				
		Alert alert1 = driver.switchTo().alert();

		String textAlert1 = alert1.getText();
		
		System.out.println("textAlert1:" + textAlert1);

		alert1.accept();
		
		driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
		
		Alert alert2 = driver.switchTo().alert();
		
		String textAlert2 = alert2.getText();
		
		System.out.println("textAlert:2" + textAlert2);

		alert2.accept();
		
	}
}
