import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.findElement(By.name("name")).sendKeys("Vindhya");
		driver.findElement(By.name("email")).sendKeys("vin@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("Reddy");
		driver.findElement(By.cssSelector("input[type='checkbox']")).click();
		
		WebElement gender = driver.findElement(By.id("exampleFormControlSelect1"));
		Select dropdown = new Select(gender);
		Thread.sleep(2000);
		dropdown.selectByVisibleText("Female");
		
		driver.findElement(By.cssSelector("input[value='option1']")).click();
		driver.findElement(By.name("bday")).sendKeys("14/08/1996");
		driver.findElement(By.cssSelector("input[Value='Submit']")).click();
		System.out.println(driver.findElement(By.cssSelector(".alert.alert-success.alert-dismissible")).getText());
		driver.quit();

	}

}
