package Selenium_Weel_1_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class click_radio_button {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leafground.com/pages/radio.html");
		
		driver.manage().window().maximize();
		
		// click the ratio button?
		
		driver.findElement(By.name("0")).click();
		
		// check default value select or not?
		
		//(//input[@name= 'news'])[i]
		
		for(int i=1; i<=2; i++) {			
			String Xpath1 = "(//input[@name= 'news'])[";
			String Xpath2 = "]";
			
			String Main_Xpath = Xpath1+i+Xpath2;
			
			//System.out.println(Main_Xpath);
			
			String values;
			values = driver.findElement(By.xpath(Main_Xpath)).getAttribute("value");
			
			if (values.equals("1")) {
				
			String print2 = "/..";
			
			String parent = Main_Xpath+print2;
			
			String Default_click = driver.findElement(By.xpath(parent)).getText();
			
			System.out.println(Default_click);
			}
			
		}
		
		//Select your age group (Only if choice wasn't selected)
		
		driver.findElement(By.xpath("(//input[@name= 'age'])[2]")).click();
		
		
		
	}

}
