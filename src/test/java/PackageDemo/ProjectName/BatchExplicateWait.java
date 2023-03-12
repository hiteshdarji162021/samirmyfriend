package PackageDemo.ProjectName;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BatchExplicateWait {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		driver.manage().window().maximize();

		// String getOsName = System.getProperty("os.name");
		// System.out.println(getOsName);

		// driver.navigate().refresh();
		// driver.navigate().forward();
		// driver.navigate().back();

		// Implicite wait apply globally.

		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		// Explicite wait apply based on particuler element.
		/*
		 * driver.findElement(By.
		 * xpath("//*[text()='Click me, to Open an alert after 5 seconds']")).click();
		 * WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		 * wait.until(ExpectedConditions.alertIsPresent());
		 * 
		 * String alertMessage = driver.switchTo().alert().getText();
		 * System.out.println(alertMessage); driver.switchTo().alert().accept();
		 */
		driver.findElement(By.xpath("//*[text()='Change Text to Selenium Webdriver']")).click();
		WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait2.until(ExpectedConditions.textToBe(By.xpath("//*[text()='Selenium Webdriver']"), "Selenium Webdriver"));
		WebElement element = driver.findElement(By.xpath("//*[text()='Selenium Webdriver']"));

		boolean status = element.isDisplayed();

		System.out.println(status);

	}

}
