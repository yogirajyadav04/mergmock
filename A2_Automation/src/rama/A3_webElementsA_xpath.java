package rama;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A3_webElementsA_xpath {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","E:\\Software Testing\\Velocity Class\\Automation\\appication and software instalation\\instalation\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com/");

	
	 ////*******web element automation--> by xpath method
    
    
    //Thread.sleep(1000); //to avoid page loading and NoSuchElement Exception //error   id="email"
    
    WebElement username= driver.findElement(By.xpath("//input[@id='email']"));//NoSuchElement Exception //error
    
    username.sendKeys("9604041104");
    
    
    WebElement password= driver.findElement(By.xpath("//input[@id='pass']"));// InvalidSelectorException//error ] due to syntax wrong

    password.sendKeys("8888245426");
    
    Thread.sleep(1000);
    
    WebElement loginButton= driver.findElement(By.xpath("//button[text()='Log in']"));
     
    loginButton.click();
    
    
    //driver.navigate().refresh();// StaleElementReference Exception due to refresh id change
    
    //username.sendKeys("9604041104");
   // password.sendKeys("9689688850");
   // loginButton.click();
    
    
    
    
    
    
    
    
 // insurance    // bajaj insurence
	// ecommerce    // amazon
	// investment    // angel
	// social media   // instagram

}
}
