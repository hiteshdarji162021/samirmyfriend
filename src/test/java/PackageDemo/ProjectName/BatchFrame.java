package PackageDemo.ProjectName;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BatchFrame {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// WebElement ele = driver.findElement(By.xpath("//iframe[@id='frm1']"));
		driver.switchTo().frame("frm1");
		Select drop = new Select(driver.findElement(By.id("course")));
		drop.selectByVisibleText("Java");
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frm2");
		driver.findElement(By.id("firstName")).sendKeys("Hitesh");
		driver.switchTo().defaultContent();

	}

}
