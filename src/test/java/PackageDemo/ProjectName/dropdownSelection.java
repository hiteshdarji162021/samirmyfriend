package PackageDemo.ProjectName;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdownSelection {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();

		WebElement ele = driver.findElement(By.xpath("//*[@id='Skills']"));

		 Select st = new Select(ele);

		st.selectByIndex(1);

		List<WebElement> lst = st.getOptions();

		for (WebElement eles : lst) {

			String value = eles.getText();

			if (value.equalsIgnoreCase("Microsoft Visual")) {
				st.selectByValue(eles.getText());

			}

		}

	}

}
