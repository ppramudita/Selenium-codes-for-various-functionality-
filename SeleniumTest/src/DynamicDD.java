import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DynamicDD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Pragya\\Documents\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("https://www.spicejet.com/");
		dr.findElement(By.xpath("//a[@title='Hotels']")).click();
		// dr.findElement(By.xpath("//*[@id='ctl00_mainContent_txtOriginStation1_MST\']")).clear();
		dr.findElement(By.xpath("//input[@name='ctl00$mainContent$txtOriginStation1_MST']")).click();
		// dr.findElement(By.xpath("//*[@id=\'ctl00_mainContent_txtOriginStation1_MST\']")).sendKeys("Mum");
		// dr.findElement(By.xpath("//*[@id=\'ctl00_mainContent_txtOriginStation1_MST\']")).sendKeys(Keys.ARROW_DOWN.ENTER);
		// Select s = new Select(dr.findElement(By.id("ddl_Adult_MST")));
		// s.selectByValue("5");

	}

}
