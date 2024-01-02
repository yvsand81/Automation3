package maven;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TESTNG1SRTEST 
{
	
	@Test
	public void test1() throws InterruptedException
	
	{
WebDriver driver = new ChromeDriver(); 
		
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
		
		driver.switchTo().frame("gdpr-consent-notice");
		driver.findElement(By.xpath("//span[text()='Accept All']")).click();
		
		driver.switchTo().defaultContent();
		
		
		 System.out.println(driver.getTitle());
		 System.out.println(driver.getCurrentUrl());
		 
		  WebElement dropdown = driver.findElement(By.name("country")); 
		  Select gur = new Select(dropdown);
		 
		  List<WebElement> li = gur.getOptions(); 
		  System.out.println(li.size());
		  
		  for(int i = 0 ; i<li.size() ; i++) 
		  { 
			 // li.get(i).click();
			 System.out.println(li.get(i).getText()); 
			  
			  if(li.get(i).getText().equals("ANGOLA"))
			  {
				  li.get(i).click();
				  break;
			  }
		
			  for(int j = li.size()-1 ; j>=0 ; j--) 
			  {
				  System.out.println(li.get(j).getText()); 
				  
				  if(li.get(j).getText().equals("UNITED KINGDOM"))
				  {
					  li.get(j).click();
					  break;
				  }  
			  }
		  }
		 
		
	}
	
	
	

}
