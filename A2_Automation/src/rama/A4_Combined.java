package rama;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class A4_Combined {
	
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","E:\\Software Testing\\Velocity Class\\Automation\\appication and software instalation\\instalation\\chromedriver.exe");
		
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.instagram.com/accounts/login/");
        Thread.sleep(10000);
        
			   Thread.sleep(3000);
	          
	         WebElement createaccount = driver.findElement(By.xpath("(//a[@role='button'])[2]"));//by index
	       createaccount.click();
	          
        
	      ////*****how to handle dropdown or list box***********
	       Thread.sleep(10000);
	        
	          WebElement month = driver.findElement(By.xpath("//select[@aria-label='Month']"));
		
	         Select s= new Select(month);
	          
	          s.selectByIndex(2);
	          
	          s.selectByValue("4");
	          s.selectByVisibleText("May");
	          
	          ////***** to varify hidden elements*******
	          
	        /*  WebElement pronoun = driver.findElement(By.xpath("//select[@aria-label='Select your pronoun']"));
	          
	          boolean result= pronoun.isDisplayed();
	          
	          if(result==true)
	          {
	        	  System.out.println("fail");
	        	  
	          }
	          else
	          {
	        	  System.out.println("pass");
	          }
	        	*/
	        	  
	          ////***** to varify checkbox & radio button*******

	     /*   WebElement custom = driver.findElement(By.xpath("(//input[@name='sex'])[3]"));
	        	  
	        	  boolean result = custom.isSelected();
	        	  
	        	  if(result==true)
	              {
	            	  System.out.println("fail");
	            	  
	              }
	              else
	              {
	            	  System.out.println("pass");
	              }  
	       */
	        
	        ////****to varify enable & disable feature of web elements***8
	          /*  
	        
	        driver.get("https://www.instagram.com/accounts/login/");
	        Thread.sleep(10000);
	        
	        WebElement username = driver.findElement(By.xpath("(//input[@aria-label='Phone number, username, or email']"));
	        username.sendKeys("yogiraj");
	        Thread.sleep(10000);
	        
	        WebElement password = driver.findElement(By.xpath("(//input[@aria-label='Password']"));
	        password.sendKeys("1234");
	        Thread.sleep(10000);
	        
	        WebElement logggin = driver.findElement(By.xpath("(//button[@type='submit']"));
	        
	        boolean result= logggin.isEnabled();
	        System.out.println(result);
	        
	        		
	        	  
	        */	  
	          
	          ///**********how to perform mouse actions***********************************
	          
	    /*      WebElement accountAndlist=driver.findElement(By.xpath(""));
	          
	          Actions act= new Actions (driver);
	          
	          act.click();//left click
	          act.doubleClick();// left double click
	          act.contextClick();// right click
	          act.moveToElement(accountAndlist);//move mouse focus on target web element
	          act.dragAndDrop(accountAndlist, accountAndlist);//drag souece web element and drop on target web element
	          act.build();// to join 2 or more above mouse actions in one line
	          act.perform();//to execute mouse actions
	         
	      
	          
	          
	          
	          driver.get("https://www.amazon.in/");
	  
	          Thread.sleep(5000);
	          
	          WebElement AccountAndLists =driver.findElement(By.xpath("//span[text()='Account & Lists']"));
	          
	          WebElement YourOrders =driver.findElement(By.xpath("//span[text()='Your Orders']"));// never give extra spaces in string""
	          
	       
	          Actions act= new Actions(driver);
	          
	        act.moveToElement(AccountAndLists).moveToElement(YourOrders).click().build().perform();
	        
	         System.out.println("done");
	         
	        
	        // above run successfuly // f8 function to freez screen for hiden elements.
	          
	      */
	          
	          
	          ///**********how to perform drag and drop*************
	 		
	 		
	 		
	           
	        /*  
	           String path = "E:\\Software Testing\\Velocity Class\\Automation\\New Microsoft Office Excel Worksheet.xlsx";
	 	 		
	 	 		FileInputStream file = new FileInputStream(path);
	 	 		
	 	 		String data = WorkbookFactory.create(file).getSheet("MOCK").getRow(1).getCell(1).getStringCellValue();
	 	 		
	 	 		System.out.println(data);
	           
	           */
        
        

}
}
