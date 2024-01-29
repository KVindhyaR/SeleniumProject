package AjaxCallsChildWindows;

import java.util.List;
import java.util.Set;

import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InterviewQues1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//count the no of links on a webpage.
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		//count no of links in footer of webpage
		
		WebElement footerdriver = driver.findElement(By.id("gf-BIG"));
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		
		//count no of links in footers 1st column
		
		WebElement columnDriver = footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(columnDriver.findElements(By.tagName("a")).size());
		
		//click on each link and check if the pages are opening - footer 1st column
		for (int i=1; i<columnDriver.findElements(By.tagName("a")).size(); i++)
		{
			//keys.CONRTOL, keys.ENTER - windows
			String clickonLinkTab = Keys.chord(Keys.COMMAND, Keys.ENTER);
			columnDriver.findElements(By.tagName("a")).get(i).sendKeys(clickonLinkTab);
			Thread.sleep(3000);
			//using below method is not a good practice
			//driver.navigate().back();
			
		}
		//get the title of each tab which opens up
		Set<String> abc = driver.getWindowHandles();
		Iterator<String> it = abc.iterator();
		//if it has child window then it goes into the loop
		while(it.hasNext())
		{
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}
		
		
		

	}

}
