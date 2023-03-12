package PackageDemo.ProjectName;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BatchActionClass {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		Actions act = new Actions(driver);
		WebElement element = driver.findElement(By.xpath("//span[text()='right click me']"));
		act.contextClick(element).build().perform();
		driver.findElement(By.xpath("//span[text()='Copy']")).click();
		String alertmessage = driver.switchTo().alert().getText();
		System.out.println(alertmessage);
	}

}
