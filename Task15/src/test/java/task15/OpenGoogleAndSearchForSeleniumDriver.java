package task15;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenGoogleAndSearchForSeleniumDriver {

	public static void main(String[] args) throws Exception {
		// Q.2 in Task 15
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.manage().window().fullscreen();
		
		Thread.sleep(200);
		
		driver.findElement(By.xpath("//div[contains(text(), 'Accept all')]/ancestor::button")).click();
		
		Thread.sleep(200);
		
		driver.findElement(By.name("q")).sendKeys("selenium browser driver");
		
		driver.switchTo().activeElement().sendKeys(Keys.ENTER);

	}

}
