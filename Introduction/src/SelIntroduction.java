import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelIntroduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//invoking Browser
		//ChromeDriver driver = new ChromeDriver(); - might not work with other browsers
		//WebDriver driver = new ChromeDriver(); - works with all browsers 
		
		//System.setProperty("webdriver.chrome.driver", "/Users/tilakreddy/Documents/chromedriver-mac-x64");
		//WebDriver driver = new ChromeDriver();
		
		//Firefox browser
		
		System.setProperty("webdriver.gecko.driver", "/Users/tilakreddy/Downloads/geckodriver");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://rahulshettyacademy.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		//driver.close();
		driver.quit();

	}

} 
