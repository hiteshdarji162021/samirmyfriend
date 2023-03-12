package PackageDemo.ProjectName;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorprogram2 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[text()='Hello, sign in']")).click();
		JavascriptExecutor js =(JavascriptExecutor)driver;
		WebElement emailId = driver.findElement(By.xpath("//*[@id='ap_email']"));
		WebElement continueButton = driver.findElement(By.xpath("//input[@id='continue']"));
		js.executeScript("arguments[0].value=arguments[1]", emailId,"hiteshdarji@gmail.com");
		//js.executeScript("arguments[0].value='hiteshdarji@gmail.com'", emailId);

		js.executeScript("arguments[0].click()", continueButton);
	}

}
