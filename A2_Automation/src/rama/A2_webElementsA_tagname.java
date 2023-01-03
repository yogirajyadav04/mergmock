package rama;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A2_webElementsA_tagname {
	
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","E:\\Software Testing\\Velocity Class\\Automation\\appication and software instalation\\instalation\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/html5_draganddrop.asp");

	
////web element automation by.tagname and other methods
	
		//	WebElement username= driver.findElement(By.tagName("//input[@type='text']"));
		//	username.sendKeys("9604041104");
			
			////-->tag name not not working so by xpath method
			
			Thread.sleep(1000);	
			WebElement username= driver.findElement(By.xpath("//input[@id='email']"));
			
			username.sendKeys("9604041104");
}
}
