import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SynchronysedTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Pragya\\Documents\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("https://www.alaskaair.com/");
		dr.findElement(By.id("tab-hotels")).click();
		dr.findElement(By.cssSelector("div.form-group.col-sm-6.right-sm.right-md.right-lg.pull-right")).click();
		dr.findElement(By.xpath(
				"//input[@class='rm-input-base.ng-dirty.ng-invalid.ng-empty.ng-valid-editable.ng-valid-parse.ng-invalid-required.ng-touched']"))
				.click();

	}

}
