package rama;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class A4_combined2 {
	
		
		public static void main(String[] args) throws InterruptedException, IOException {
			
			System.setProperty("webdriver.chrome.driver","E:\\\\Software Testing\\\\Velocity Class\\\\Automation\\\\appication and software instalation\\\\instalation\\\\chromedriver.exe");
			
			WebDriver driver= new ChromeDriver();
			
			//driver.get("https://www.w3schools.com/html/html5_draganddrop.asp");
			
			///**********how to perform drag and drop*************
			
		/*	WebElement logodrag= driver.findElement(By.xpath("//img[@id='drag1']"));
			
			WebElement drop= driver.findElement(By.xpath("//div[@id='div2']"));
			
			Actions act= new Actions(driver);
			
			act.dragAndDrop(logodrag, drop).build().perform();
			
			System.out.println("end");
			
		*/
			
			///**********How to scroll up,down and right left*************
			
		/*	
			JavascriptExecutor js = (JavascriptExecutor) driver ;
			
			js.executeScript("window.scrollBy(0,3000);");// scroll down
			
			Thread.sleep(1000);// (from top to down 3000 and -2000 working in increment not absolute towards above)
			
			js.executeScript("window.scrollBy(0,-2000);");//scroll up
			
			js.executeScript("window.scrollBy(3000,0);"); // scroll right 
			js.executeScript("window.scrollBy(-3000,0);");// scroll left 
			
			*/
			
			///**********Scroll Until target element is not displayed*************
			
		/*	WebElement TryitYourself = driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[2]"));
			
			JavascriptExecutor js=(JavascriptExecutor)driver;
			
			js.executeScript("arguments[0].scrollIntoView(true);", TryitYourself);
			
		*/	
			
			///********** how to take screenschot in selenium*************
		/*	
		//	TakesScreenshot t= (TakesScreenshot) driver;
		//	t.getScreenshotAs()
			
			File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			File Deskt=new File("E:\\Software Testing\\Velocity Class\\Automation\\screenshot in selenium");
			
			FileHandler.copy(src, Deskt);
			
			// remaining , not run, see class recording
		*/	
			///********** how to handled Alert popup*************
			
			
			driver.get("https://demo.guru99.com/test/delete_customer.php");
			Thread.sleep(5000);
			
			WebElement submit=driver.findElement(By.xpath("//input[@type='submit']"));
			
			Thread.sleep(1000);
			
			submit.click();
			
			Alert alt= driver.switchTo().alert();
			
			Thread.sleep(1000);
			
			//alt.accept();// click on ok,accept,allow,approve,positive words
			
			alt.dismiss();//click on no,cancel,not now,deny,dismiss,negative words
			
	  //System.out.println("done");
			
			//alt.sendKeys("yogiraj");// to send data on alert popup
			
			//String text= alt.getText();//to get text from alet popup
		//	System.out.println(text);
			
			//// we can write above command in one line like
			
		    // driver.switchTo().alert().accept();
		
			
			///********** Handling of child browser*************	
			
			/*driver.get("https://www.w3schools.com/js/js_popup.asp");
			
			WebElement alert=driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[1]"));
			WebElement confirm=driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[2]"));
			WebElement prompt=driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[3]"));
			WebElement line=driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[4]"));
			
			alert.click();
			confirm.click();
			prompt.click();
			line.click();
			
		    String mainpage=driver.getWindowHandle();// gives address of main browser(1st window,parent window)
		    System.out.println(mainpage);
		    
		    ////Set<String> addr=driver.getWindowHandles();//adress of main browsers + all child browsers
		    ArrayList<String> addr=new ArrayList<String> (driver.getWindowHandles());
		    
		    ////String a1=addr.get(0);
		    
		    
		    System.out.println(addr.get(0));
		    System.out.println(addr.get(1));
		    System.out.println(addr.get(2));
		    System.out.println(addr.get(3));
		    System.out.println(addr.get(4));
		    
		    
			driver.switchTo().window(addr.get(0));
			//String url=driver.getCurrentUrl();
			System.out.println(driver.getCurrentUrl());
			
			driver.switchTo().window(addr.get(1));
			System.out.println(driver.getCurrentUrl());
			
			driver.switchTo().window(addr.get(2));
			System.out.println(driver.getCurrentUrl());
			
			driver.switchTo().window(addr.get(3));
			System.out.println(driver.getCurrentUrl());
		
			driver.switchTo().window(addr.get(4));
			System.out.println(driver.getCurrentUrl());
		
		*/
		
		
		
		
		}

}
