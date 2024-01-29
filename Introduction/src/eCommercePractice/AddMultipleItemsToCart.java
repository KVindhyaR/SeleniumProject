package eCommercePractice;

import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class AddMultipleItemsToCart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(3000);
		//if you want to add more than one vegetable, store them in an array
		String[] itemsNeeded = {"Cucumber", "Beetroot"};
		int j=0;
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		
		for (int i=0; i< products.size(); i++)
			
		{
			//store index value in a variable - but it returns cucumber - 1 kg which will not match the array list
			//so split the product name using - , when u split return type should not be string it should array.
			//String name = products.get(i).getText();
			String[] name = products.get(i).getText().split("-");
			//trims any white spaces
			String formattedName = name[0].trim();
			//String formattedName = name[0].trim();
			
			//check whether the name you extracted is present in array or not
			//convert array to arraylist - if we create arraylist initially it takes lots of memory, so we are converting in the runtime
			List itemsList = Arrays.asList(itemsNeeded);
			//to store the value of that index in a variable
			
			if(itemsList.contains(formattedName)) 
			{
				
				j++;
				System.out.println(i);
				//below xpath if add to cart changes to added and doesn't comeback to add to cart quickly, wrong item will be added
				//"//div[@class='product-action']/button"
				////button[text()='ADD TO CART']
			driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
			
			//if there are many products and we don't want to waste time in running all other iterations if we ghave added desired vegetables
			//so let's write a if condition
			if(j==itemsNeeded.length)
			{
				break;
			}
			}
			
		}
		driver.quit();
		
		
		


	}

}
