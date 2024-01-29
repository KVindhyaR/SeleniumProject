import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class DropDownLooping {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		//No of passengers selection by id locator
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		//Add one adult
		//driver.findElement(By.id("hrefIncAdt")).click();
		//Click Done
		//driver.findElement(By.id("btnclosepaxoption")).click();
		//To add 5 adults, it is not good to repeat same line 4 times so we use while loop
		int i=1; //already by default 1 adult is added
		while(i<5)
		{
			driver.findElement(By.id("hrefIncAdt")).click();	
			i++;
		}
		
		driver.findElement(By.id("btnclosepaxoption")).click();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
		driver.quit();
	}

}
