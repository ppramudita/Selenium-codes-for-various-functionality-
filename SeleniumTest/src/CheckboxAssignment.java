import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CheckboxAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Pragya\\Documents\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("http://qaclickacademy.com/practice.php");
		Assert.assertFalse(dr.findElement(By.id("checkBoxOption1")).isSelected());
		dr.findElement(By.id("checkBoxOption1")).click();
		System.out.println("True");
		Assert.assertTrue(dr.findElement(By.id("checkBoxOption1")).isSelected());
		dr.findElement(By.id("checkBoxOption1")).click();
		// Assert.assertFalse(dr.findElement(By.xpath("//label[@for =
		// 'bmw']")).isSelected());

		// count the number of checkboxes
		System.out.println(dr.findElements(By.xpath("//input[@type='checkbox']")).size());

	}

}
