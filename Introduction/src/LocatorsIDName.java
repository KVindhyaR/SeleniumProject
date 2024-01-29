import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsIDName {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//invoking browser
		//System.setProperty("webdriver.chrome.driver", "/Users/tilakreddy/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		//Wait Mechanism - implicit wait 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//launching url
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		//enter username with ID Locator
		driver.findElement(By.id("inputUsername")).sendKeys("vindhya");
		//enter password using Name Locator
		driver.findElement(By.name("inputPassword")).sendKeys("hello123");
		//click signin button using classname locator
		driver.findElement(By.className("signInBtn")).click();
		//if valid credentials then it signs in otherwise it throws an error and to capture the error on console we write in below way
	System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
	
		//Link Text Locator whenever there is <a> or if it is a link
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Vin");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("vin@yahoo.com");
		//Clear the text using xpath and css selector
		//driver.findElement(By.xpath("//input[@placeholder='Email']")).clear();
		//driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).clear();
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("vindhya@gmail.com");
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("7894567831");
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
	System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		//driver.findElement(By.xpath("button[@class='go-to-login-btn']")) .click();
		driver.findElement(By.cssSelector("button.go-to-login-btn")).click();
		//driver.findElement(By.xpath("//div[@class='forgot-pwd-container']/[1]")).click();
		Thread.sleep(3000);
		//driver.quit();
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("Happy");
		//regular expression - if the value is dynamic
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
		//Thread.sleep(2000);
		driver.findElement(By.id("chkboxOne")).click();
		//regular expression - xpath
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
		
	}

}
