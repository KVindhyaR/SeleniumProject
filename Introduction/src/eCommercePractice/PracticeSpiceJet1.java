package eCommercePractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeSpiceJet1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		Thread.sleep(2000);
		//select from city: parent - child 
		driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-knv0ih r-1k1q3bj r-ql8eny r-1dqxon3'] //*[text()='Agartala']")).click();
		//select To city
		driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-knv0ih r-1k1q3bj r-ql8eny r-1dqxon3'] //*[text()='Bengaluru']")).click();
		//Normalize space function: If an element has spaces in its text or in the value of any attribute, 
		//then to create an xpath for such an element we have to use the normalize-space function. 
		//to select depart date [2] : means february is 2nd month
		driver.findElement(By.xpath("(//div[@dir='auto'][normalize-space()='3'])[2]")).click();
		//Passengers
		driver.findElement(By.xpath("(//div[@class='css-1dbjc4n'])[1]")).click();
		for (int i=1; i<3;i++)
		{
			driver.findElement(By.cssSelector("div[data-testid='Adult-testID-plus-one-cta']")).click();
		}
		//Click Done
		driver.findElement(By.xpath("//div[contains(text(),'Done')]")).click();
		//select dropdown to pick currency
		driver.findElement(By.xpath("(//div[@class='css-1dbjc4n'])[60]")).click();
		//Currency - static dropdown
		driver.findElement(By.xpath("//div[text()='USD']")).click();
		//Radio Buttons
		driver.findElement(By.xpath("(//div[@class='css-1dbjc4n'])[65]")).click();
	}

}
