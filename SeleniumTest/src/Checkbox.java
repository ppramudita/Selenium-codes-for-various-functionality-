import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Checkbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Pragya\\Documents\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("https://www.spicejet.com/");
		Assert.assertFalse(dr.findElement(By.cssSelector("input[name*='SeniorCitizenDiscount']")).isSelected());
		// System.out.println(dr.findElement(By.cssSelector("input[name*='SeniorCitizenDiscount']")).isSelected());
		dr.findElement(By.cssSelector("input[name*='SeniorCitizenDiscount']")).click();
		Assert.assertTrue(dr.findElement(By.cssSelector("input[name*='SeniorCitizenDiscount']")).isSelected());

		// System.out.println(dr.findElement(By.cssSelector("input[name*='SeniorCitizenDiscount']")).isSelected());
		// Count the number of checkboxes
		System.out.println(dr.findElements(By.xpath("//input[@type='checkbox']")).size());

	}

}
