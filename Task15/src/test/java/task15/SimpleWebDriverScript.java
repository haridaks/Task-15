package task15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SimpleWebDriverScript {

	public static void main(String[] args) throws Exception {
		// Q.5 in Task 15
		
		//To setup the webdriver manager(chrome driver)
		WebDriverManager.chromedriver().setup();
		
		//To launch the chrome driver
		WebDriver driver = new ChromeDriver();
		
		//launching the facebook webpage
		driver.get("https://www.facebook.com/login/");
		
		//maximizing the screen
		driver.manage().window().fullscreen();
		
		//giving inputs to the mail id field by using id to find the element
		driver.findElement(By.id("email")).sendKeys("akshayahari10@gmail.com");
		
		//giving inputs to the password field by using id to find the element
		driver.findElement(By.id("pass")).sendKeys("123456");
		
		//webpage will load for 3 secs
		Thread.sleep(3000);
		
		//closing the current webpage
		driver.close();
		

	}

}
