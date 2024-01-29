import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowActivities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		//to open the browser in maximized mode
		driver.manage().window().maximize();
		//below method will implicitly wait till all the components of the page are loaded
		driver.get("http://google.com");
		//the below method doesnot wait for all the components to load but this helps 
		//to navigate to other window when other page is already opened
		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
		//it navigates back to google page
		driver.navigate().back();
		//the page goes back to rahulshettyacademy
		driver.navigate().forward();
		
		

	}

}
