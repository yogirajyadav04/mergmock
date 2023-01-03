package rama;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A8_Dynamic_ElementHandling {
	
	public static void main(String[] args) {
		
		//Dynamic element Handling by cotains and by Relative Xpath
		
		
        System.setProperty("webdriver.chrome.driver","E:\\Software Testing\\Velocity Class\\Automation\\appication and software instalation\\instalation\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
        driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
        
        
		//1)by contains( use when half text not change)
        
       // WebElement CheckAvalblty= driver.findElement(by.)     //remaining
	
	
	
	
	  // 2)by Relative Xpath( use when all values change)
        
        WebElement CheckAvalblty= driver.findElement(By.xpath("(//input[@type='button'])[1]"));
        //WebElement CheckAvalblty1= driver.findElement(By.xpath("//td[@valign='bottom']//input[2]"));        // another way of relative xpath  
      
        CheckAvalblty.click();
        //CheckAvalblty1.click();
        
        
        // practice it on e commerce websites.. amazon.. for searching different product
	}

}
