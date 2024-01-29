package eCommercePractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new ChromeDriver();
		//explicit wait
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");
		//radio button
		driver.findElement(By.xpath("(//span[@class='checkmark'])[2]")).click();
		
	
		w.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
		driver.findElement(By.xpath("//button[@id='okayBtn']")).click();

		//static dropdown
		WebElement options = driver.findElement(By.cssSelector("select[class='form-control']"));
		Select s = new Select(options);
		s.selectByValue("consult");
		
		driver.findElement(By.cssSelector("input[name='terms']")).click();
		driver.findElement(By.id("signInBtn")).click();
		//takes sometime
		w.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("ProtoCommerce Home")));
		System.out.println(driver.findElement(By.linkText("ProtoCommerce Home")).getText());
		
		List<WebElement> products =  driver.findElements(By.xpath("//button[@class='btn btn-info']"));
		
		for (int i=0; i<products.size(); i++)
		{
			products.get(i).click();
		}
		driver.findElement(By.partialLinkText("Checkout")).click();
	}

}
