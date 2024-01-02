package maven;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MutiTest {

	WebDriver driver;

	@BeforeClass
	public void Initalization() throws InterruptedException {
		driver = new ChromeDriver(); // rtp

		driver.get("https://www.amazon.in");

		driver.manage().window().maximize(); // Maximize the browser

		Thread.sleep(2000);

		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
	}

	@Test(priority=1)
	public void SelectDropDown() throws InterruptedException {

		WebElement dropdown = driver.findElement(By.id("searchDropdownBox"));

		Select sel = new Select(dropdown);

		sel.selectByIndex(3);

		sel.selectByValue("search-alias=mobile-apps");

		sel.selectByVisibleText("Collectibles");

	}

	@Test(priority=2)
	public void AdvanceDropDown() throws InterruptedException {

		WebElement dropdown = driver.findElement(By.id("searchDropdownBox"));

		Select sel = new Select(dropdown);

		List<WebElement> li = sel.getOptions();

		System.out.println(li.size());

		/*
		 * for(int i = 0 ; i<li.size() ; i++) { li.get(i).click();
		 * System.out.println(li.get(i).getText()); }
		 */
		for (int i = li.size() - 1; i >= 0; i--) {
			li.get(i).click();
			System.out.println(li.get(i).getText());

		}

	}

	@AfterClass
	public void CleanUp() {
		driver.quit();
	}

}
