package PackageDemo.ProjectName;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BatchJavaScriptExector {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.xpath("//*[text()='Shop for your baby by age']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// js.executeScript("scroll(0,400)");
		// js.executeScript("arguments[0].scrollIntoView(true);", element);

		driver.findElement(By.xpath("//span[text()='Hello, sign in']")).click();
		WebElement emailId = driver.findElement(By.xpath("//*[@name='email']"));
		// js.executeScript("arguments[0].value=arguments[1]",
		// emailId,"hiteshdarji@gmail.com");
		js.executeScript("arguments[0].value='hiteshdarji@gmail.com'", emailId);

		WebElement continuebutton = driver.findElement(By.xpath("//input[@id='continue']"));
		js.executeScript("arguments[0].click()", continuebutton);
	}

}
