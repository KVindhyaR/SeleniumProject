package AjaxCallsChildWindows;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		//click highlighted link
		driver.findElement(By.className("blinkingText")).click();
		//window handles - parent to child
		Set<String> window = driver.getWindowHandles();
		Iterator<String> it = window.iterator();
		String parentID = it.next();
		String childID = it.next();
		//switching window to child tab and retrieving text
		driver.switchTo().window(childID);
		//Retrieving mail id by splitting the text - mycode
		System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
		/*
		String[] splittedText = driver.findElement(By.cssSelector(".im-para.red")).getText().split("at");
		String[] mail = splittedText[1].split("with");
		String FormattedMail = mail[0].trim();
		System.out.println(FormattedMail);
		*/
		//rahulshetty code
		String emailId= driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
		
		driver.switchTo().window(parentID);
		driver.findElement(By.id("username")).sendKeys(emailId);
	}

}
