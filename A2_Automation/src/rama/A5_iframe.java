package rama;



import org.openqa.selenium.By;
import java.util.ArrayList;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A5_iframe {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","E:\\Software Testing\\Velocity Class\\Automation\\appication and software instalation\\instalation\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
       // driver.get("https://www.w3schools.com/js/js_popup.asp");
		
		
      
				///**********iframe by 3 methods*************
				
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
		
		
		/*driver.switchTo().frame(1);// index start with 0// 1st method
		WebElement tryit=driver.findElement(By.xpath("//button[text()='Try it']"));// this is important for xpath-->import java.util.ArrayList;
		tryit.click();
		
		System.out.println("pass");//only to check 
	   */
		
		
		
		/* driver.switchTo().frame("iframeResult");  // only atrribute value//              2nd method
		 WebElement tryit=driver.findElement(By.xpath("//button[text()='Try it']"));
			tryit.click(); 
		*/
		
		
		////WebElement tryit=driver.findElement(By.xpath("//button[text()='Try it']")); //not finding xpath due to inside iframe
		
		/*WebElement ifrm_tryit=driver.findElement(By.xpath("//iframe[@id='iframeResult']"));//     3rd method
		driver.switchTo().frame(ifrm_tryit);
		WebElement tryit=driver.findElement(By.xpath("//button[text()='Try it']"));
		tryit.click();
		*/
		
		// run ok
		
		
		
		
	}		

}
