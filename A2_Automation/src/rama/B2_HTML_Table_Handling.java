package rama;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class B2_HTML_Table_Handling {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\Software Testing\\Velocity Class\\Automation\\appication and software instalation\\instalation\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		// HANDLING HTML Table and use of findelements method
		
		List<WebElement> celss =driver.findElements(By.xpath("//table[@id='customers']//td"));
		
		WebElement c1=celss.get(0);
		String text=c1.getText();
		
		// OR
		//String text=celss.get(0).getText();
		
		for(int i=0 ;i<celss.size(); i++)
		{
		System.out.println(celss.get(i).getText());
		
		//task:
		
		//List<WebElement> celss =driver.findElements(By.xpath("//table[@id='customers']//tr[+i+]//td"));
		// put above in for loop // see video lecture date 5/9/22
		}
		
	}
}
