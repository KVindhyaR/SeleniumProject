import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCalendarDepartDate {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		/*
		//click from dropdown
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		//select one city
		driver.findElement(By.cssSelector("a[value='ATQ']")).click();
		Thread.sleep(2000);
		//select to city
		driver.findElement(By.cssSelector("div[id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] a[value='MAA']")).click();
		Thread.sleep(1000);
		//no space in classname, if space is present put a .
		//as this is one way select depart highlighted date
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		*/
		
		//Select Round trip radio button
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		//check if return date calendar is enabled
		System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
		
	}

}
