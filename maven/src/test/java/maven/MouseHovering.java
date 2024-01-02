package maven;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseHovering {
	
	@Test

	public void MH() throws InterruptedException {
		// TODO Auto-generated method stub
		
WebDriver driver = new ChromeDriver(); //rtp
		
		driver.get("https://www.amazon.in");
		
		driver.manage().window().maximize(); //Maximize the browser
		
		Thread.sleep(6000);
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
	//	int i = 10;
		
	WebElement accountlist =	driver.findElement(By.xpath("//span[text()='Account & Lists']"));

	
	Actions act = new Actions(driver);
	
	act.moveToElement(accountlist).perform();

	//driver.findElement(By.xpath("//span[text()='Your Account']")).click();
	
	//List<WebElement> li =driver.findElements(By.xpath("div[@class='nav-title'][2][1]"));
	List<WebElement> li =driver.findElements(By.xpath("//div[@class='nav-title']|//a[@class='nav-link nav-item']"));
	System.out.println(li.size());
	
	
	
	
	
	for(int i = 0 ; i<li.size();i++)
	{
		System.out.println(li.get(i).getText());
	}
	

	
	}

}
