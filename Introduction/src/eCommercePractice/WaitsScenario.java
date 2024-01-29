package eCommercePractice;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class WaitsScenario {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		//implicit wait - declare it globally
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		//Thread.sleep(3000);
		String[] itemsNeeded = {"Cucumber", "Beetroot"};
		addItems(driver, itemsNeeded);
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.cssSelector("div[class='cart-preview active'] button[type='button']")).click();
		//it doesnot enter the code because of page load time. so we have to either use implicit or explicit
		w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//input[@placeholder='Enter promo code']")));
		driver.findElement(By.xpath("//input[@placeholder='Enter promo code']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector(".promoBtn")).click();
		//Explicit wait - specific to webelement
		//WebDriverWait w=new WebDriverWait(driver,10) - this syntax is deprecated
		
		w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector(".promoInfo")));
		System.out.println(driver.findElement(By.cssSelector(".promoInfo")).getText());
		
		
	}

public static void addItems(WebDriver driver, String[] itemsNeeded) throws InterruptedException
{
	int j=0;
	List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
	
	for (int i=0; i< products.size(); i++)	
	{
		String[] name = products.get(i).getText().split("-");
		String formattedName = name[0].trim();
		List itemsList = Arrays.asList(itemsNeeded);
		
		
		if(itemsList.contains(formattedName)) 
		{
			
			j++;
			System.out.println(i);
		Thread.sleep(1000);	
		driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
		if(j==itemsNeeded.length)
		{
			break;
		}
		}
	}
}


}