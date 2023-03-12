package PackageDemo.ProjectName;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabHandle {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.id("newTabBtn")).click();
		Thread.sleep(5000);
		Set<String> handles = driver.getWindowHandles();
		String parent = driver.getWindowHandle();
		for (String handle : handles) {
			if (!parent.equals(handle)) {
				driver.switchTo().window(handle);				
				driver.findElement(By.id("alertBox")).click();
				String alertMessage = driver.switchTo().alert().getText();
				System.out.println(alertMessage);
				driver.switchTo().alert().accept();
				driver.switchTo().window(parent);
			}
		}
		
		driver.findElement(By.id("newWindowBtn")).click();

	}

}
