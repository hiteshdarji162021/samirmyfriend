package PackageDemo.ProjectName;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox_Radiobutton {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();

		List<WebElement> lst = driver
				.findElements(By.xpath("//*[text()='Hobbies']//parent :: div //following-sibling :: input"));

		System.out.println(lst.size());
		for (int i = 0; i < lst.size(); i++) {

			WebElement ele = lst.get(i);

			String value = ele.getAttribute("value");
			
			if(value.equalsIgnoreCase("Movies")) {
				ele.click();
			}

		//	System.out.println(value);

		}

	}

}
