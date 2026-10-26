package Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Car_demo {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.carwale.com/new-cars/");
		WebElement Search = driver.findElement(By.name("Input field"));
		Search.sendKeys("Tata Cars");
		driver.close();


	}

}
