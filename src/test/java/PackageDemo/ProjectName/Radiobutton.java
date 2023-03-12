package PackageDemo.ProjectName;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobutton {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();

		List<WebElement> lst = driver.findElements(By.xpath("//input[@name='radiooptions']"));

		for (int i = 0; i<lst.size(); i++) {
			
			WebElement ele = lst.get(i);
			
			String val = ele.getAttribute("value");
			
			if(val.equalsIgnoreCase("Male")){
				ele.click();
			}
			
			System.out.println(val);

		}

	}

}
