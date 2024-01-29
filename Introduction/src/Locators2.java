import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locators2 {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		
		String name = "Vindhya";
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//one way of calling method and other way is declaring it.
		String password = getPassword(driver);
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		//driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		driver.findElement(By.name("inputPassword")).sendKeys(password);
		driver.findElement(By.cssSelector(".signInBtn")).click();
		//TagName Locator
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.tagName("p")).getText());
		//assertions to validate the text on the page
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
		Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(),"Hello "+name+",");
		//logout button
		//driver.findElement(By.xpath("//div/button")).click();
		driver.findElement(By.xpath("//button[text()='Log Out']")).click();
		driver.close();

	}
	
	public static String getPassword(WebDriver driver) throws InterruptedException{
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(2000);
		//Please use temporary password 'rahulshettyacademy' to Login.
		//0th index = Please use temporary password
		//1st index = rahulshettyacademy' to Login.
		driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();
		String passwordText = driver.findElement(By.cssSelector("form p")).getText();
		String[] passwordArray = passwordText.split("'");
		Thread.sleep(1000);
		//rahulshettyacademy' to Login. split with ' and stores the value in password variable
		String password = passwordArray[1].split("'")[0];
		//String[] passwordArray2 = passwordArray[1].split("'");
		//String password = passwordArray2[0];
		return password;
		
		
	}


}
