import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		
		//driver.findElement(By.xpath("//a[@value='GOI']")).click();
		//if you write below xpath it throws an error because 2 elements are matching with that xpath
		//driver.findElement(By.xpath("(//a[@Value='DHM'])")).click();
		//by adding index to xpath
		Thread.sleep(2000);
	//	driver.findElement(By.xpath("(//a[@value='DHM'])[2]")).click();
		//instead of searching by index we can search by using parent to child traverse
		//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='GOI']
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='GOI']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='DHM']")).click();

	}

}
