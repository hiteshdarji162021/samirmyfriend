package PackageDemo.ProjectName;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicateWaitTextisVisible {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[text()='Change Text to Selenium Webdriver']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(6));
		
		wait.until(ExpectedConditions.textToBe(By.xpath("//*[text()='Selenium Webdriver']"), "Selenium Webdriver"));

	}

}
