package eCommercePractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToCart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		//list<webelement> - as it returns list of elements with that classname
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		
		//products.size - it checks for all the items returned with that classname
		for(int i=0; i<products.size();i++)
		{
			//store the index value in a variable to match with the desired vegetable
			String name = products.get(i).getText();
			//arrays don't support contains, so if you're using array change to array list
			if(name.contains("Cucumber"))
			{
				System.out.println(i);
				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
				break;
			}
		}

	}

}
