package rama;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class B1_TakeScreenShoot {
	
	public static void main(String[] args) throws IOException {
		
             System.setProperty("webdriver.chrome.driver","E:\\\\Software Testing\\\\Velocity Class\\\\Automation\\\\appication and software instalation\\\\instalation\\\\chromedriver.exe");
		
		     WebDriver driver= new ChromeDriver();
		
		     driver.get("https://www.facebook.com/");
		     
		     // how take screenshot
		     
		     //TakesScreenshot t= (TakesScreenshot)driver;
		      // t.getScreenshotAs();
		     
		     // for single screenshot
		    /* File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		     File dest= new File("E:\\Software Testing\\Velocity Class\\Automation\\appication and software instalation\\screenshot automation\\Test123.jpg");
		
		     FileHandler.copy(src, dest);
		     
		     */
		     
		     // for multiple screenshot
		     
		     for(int i=0; i<3;i++)
		     {
		     
		     File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				
		     File dest= new File("E:\\Software Testing\\Velocity Class\\Automation\\appication and software instalation\\screenshot automation\\Test"+i+".jpg");
		
		     FileHandler.copy(src, dest);
		     
		     }
		     
		     // task:1) add date and time in file name ,find from google : how to fetch system date and time in java
		     
		       //      2) random number for image
		     
		     //(task pending ,topic completed)
		              
	}

}
