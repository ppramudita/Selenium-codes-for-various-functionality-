import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Pragya\\Documents\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("https://www.spicejet.com/");
		dr.findElement(By.xpath("//button[@class='ui-datepicker-trigger']")).click();

		// Find month

		// Boolean a=
		// dr.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText().contains("January");
		// Boolean b=
		// dr.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText().equals("2020");
		while (!(dr.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText().contains("May"))) {
			dr.findElement(By.xpath("//a[@data-handler ='next'] //span[@class = 'ui-icon ui-icon-circle-triangle-e']"))
					.click();
		}
		List<WebElement> dates = dr.findElements(By.xpath("//a[@class='ui-state-default']"));
		int count = dr.findElements(By.xpath("//a[@class='ui-state-default']")).size();
		for (int i = 0; i < count; i++) {
			String text = dr.findElements(By.xpath("//a[@class='ui-state-default']")).get(i).getText();
			if (text.equals("27")) {
				dr.findElements(By.xpath("//a[@class='ui-state-default']")).get(i).click();
				break;
			}

		}
	}

}
