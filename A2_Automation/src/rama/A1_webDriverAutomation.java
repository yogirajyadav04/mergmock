package rama;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A1_webDriverAutomation {
	
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","E:\\Software Testing\\Velocity Class\\Automation\\appication and software instalation\\instalation\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/html5_draganddrop.asp");
	
	
////*****************web driver automation ************************
    
	     Thread.sleep(1000);
	      
	driver.navigate().to("https://www.selenium.dev/");
	
	     Thread.sleep(1000);
	     
	     driver.navigate().back();
	     
	     Thread.sleep(1000);
	     
	     driver.navigate().forward();
	     
	     Thread.sleep(1000);
	
	driver.navigate().refresh();
	 
	Thread.sleep(1000);
	
	driver.manage().window().maximize();
	
	Thread.sleep(1000);
	
	//driver.manage().window().minimize();
	
	//driver.close();
	
	//driver.quit();
	
	String title= driver.getTitle(); 
	System.out.println(title);
	
	String url= driver.getCurrentUrl();
	System.out.println(url);
	
	
	      Dimension d= new Dimension(300,600);
	     driver.manage().window().setSize(d);// it for window size 
	     
	     Thread.sleep(1000);
	     
	     Point p = new Point(200,500);// some time shows error run again, it for window position on monitor screen
	     driver.manage().window().setPosition(p);
	
	      
	//*****************************************************************
	
	

}
}
