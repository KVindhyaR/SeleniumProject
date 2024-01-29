package AjaxCallsChildWindows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//select any checkbox and pass the selected checkbox label into a dropdown without hard coding
		driver.findElement(By.id("checkBoxOption2")).click();
		String checkboxValue = driver.findElement(By.xpath("//label[normalize-space()='Option2']")).getText();
		driver.findElement(By.cssSelector("#dropdown-class-example")).sendKeys(checkboxValue);
		//enter the grabbed text into a editbox(alert box)
		driver.findElement(By.id("name")).sendKeys(checkboxValue);
		//click alert button
		driver.findElement(By.id("alertbtn")).click();
		//check if grabbed text is present when we click alert button
		System.out.println(
				driver.switchTo().alert().getText().contains(checkboxValue));
		
	
	}

}
