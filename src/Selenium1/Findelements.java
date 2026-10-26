package Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Findelements {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
driver.get("https://practicetestautomation.com/practice-test-login/");
WebElement Username = driver.findElement(By.name("username"));
Username.sendKeys("deeraj");
WebElement Password = driver.findElement(By.id("password"));
Password.sendKeys("password123;");
WebElement Loginbutton = driver.findElement(By.id("submit"));
Loginbutton.click();
driver.close();
}

}
