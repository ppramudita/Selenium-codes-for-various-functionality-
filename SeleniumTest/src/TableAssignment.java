import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Pragya\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("https://qaclickacademy.com/practice.php");
		WebElement table = dr.findElement(By.id("product"));
		System.out.println(table.findElements(By.tagName("tr")).size());
		System.out.println(table.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th")).size());
		int count = table.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td")).size();
		for (int i = 0; i < count; i++) {
			System.out.println(
					table.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td")).get(i).getText());
		}

	}

}
