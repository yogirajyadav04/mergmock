package rama;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dailypractice {
	
		
		public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver","E:\\Software Testing\\Velocity Class\\Automation\\appication and software instalation\\instalation\\chromedriver.exe");
			
			WebDriver driver= new ChromeDriver();
			
           // driver.get("https://www.w3schools.com/js/js_popup.asp");
			
			
          /*  // ******diffrent********
            driver.findElement(By.xpath("(//a[@class='w3-btn w3-margin-bottom'])[1]")).click();
			
			ArrayList<String> vinod = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(vinod.get(1));
			 
				driver.switchTo().frame("iframeResult");  // only atrribute value// 2nd method
				 WebElement tryit=driver.findElement(By.xpath("//button[text()='Try it']"));
					tryit.click(); 
					driver.switchTo().window(vinod.get(0));
					driver.findElement(By.xpath("(//a[@class='w3-btn w3-margin-bottom'])[2]")).click();	
			*/
			
					
			
			// ******diffrent********
			/*driver.get("https://www.w3schools.com/js/js_popup.asp");
			
			driver.findElement(By.xpath("(//a[@class='w3-btn w3-margin-bottom'])[1]")).click();
			
			ArrayList<String> vinod = new ArrayList<String>(driver.getWindowHandles());
			 driver.switchTo().window(vinod.get(1));
			*/
			
			
			
			
		}		
}
