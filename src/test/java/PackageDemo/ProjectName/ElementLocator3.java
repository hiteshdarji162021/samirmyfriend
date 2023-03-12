package PackageDemo.ProjectName;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ElementLocator3 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		/*
		 * driver.manage().window().maximize();
		 * driver.findElement(By.cssSelector("input#username")).sendKeys("student");
		 * driver.findElement(By.name("password")).sendKeys("Password123");//Not have
		 * class attribute so not used.
		 * driver.findElement(By.cssSelector("button.btn")).click(); //Used class
		 * attribute
		 */	}

}
