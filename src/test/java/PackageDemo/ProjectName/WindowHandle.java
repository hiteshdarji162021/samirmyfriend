package PackageDemo.ProjectName;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.id("newWindowBtn")).click();
		Thread.sleep(5000);
		Set<String> handles = driver.getWindowHandles();
		String parent = driver.getWindowHandle();
		for (String handle : handles) {
			if (!parent.equals(handle)) {

				driver.switchTo().window(handle);
				driver.findElement(By.id("firstName")).sendKeys("Hitesh");
			}
		}
	}

}
