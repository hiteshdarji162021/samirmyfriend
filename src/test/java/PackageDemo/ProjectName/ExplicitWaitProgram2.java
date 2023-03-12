package PackageDemo.ProjectName;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitProgram2 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[text()='Click me, to Open an alert after 5 seconds']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(6));
		
		wait.until(ExpectedConditions.alertIsPresent());
		
		String name = driver.switchTo().alert().getText();
		
		System.out.println(name);
		
		driver.switchTo().alert().accept();
		//driver.switchTo().alert().dismiss();
		
			

	}

}
