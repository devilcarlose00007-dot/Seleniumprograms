package Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Saucedemo1 {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
WebElement Username = driver.findElement(By.name("user-name"));
Username.sendKeys("standard_user");
WebElement Password = driver.findElement(By.id("password"));
Password.sendKeys("secret_sauce");
WebElement Loginbutton = driver.findElement(By.id("Login"));
Loginbutton.click();
driver.close();

	}

}
