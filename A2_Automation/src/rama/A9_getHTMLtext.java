package rama;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A9_getHTMLtext {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver","E:\\\\Software Testing\\\\Velocity Class\\\\Automation\\\\appication and software instalation\\\\instalation\\\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement username= driver.findElement(By.xpath("//input[@id='email']"));
		
		WebElement password= driver.findElement(By.xpath("//input[@id='pass']"));
		
		WebElement loginButton= driver.findElement(By.xpath("//button[text()='Log in']"));
		
		//************************** to get HTML text**********************
		
		/*String value=loginButton.getText();
		System.out.println(value);
		
		if(value.equals("Sign in"))
		{
			System.out.println("pass");
		}
		
		else
		{
			System.out.println("fail");
		}
		
		
		// run successfully
		
		*/
		
		//************************** to get Atrribute value of webelement**********************
		
		
		String Attributevalue=username.getAttribute("aria-label");
		
		System.out.println(Attributevalue);
		
		if(Attributevalue.equals("Email address or phone number"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		
		// run successfully
		
		/* pending
		 
		 String a=username.getTagname();
		 
		 username.clear();
		 
		 */
		
		//******************************************************************************
		

}
}