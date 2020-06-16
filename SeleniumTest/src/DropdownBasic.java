import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownBasic {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Pragya\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("https://www.goindigo.in/");
		// dr.findElement(By.xpath("//*[@id=\"buttons\"]/div/div/ul/li[2]/a/span[2]")).click();
		// Select s =new
		// Select(dr.findElement(By.cssSelector("input[class*='hpBookingForm']")));
		dr.findElement(By.cssSelector("input[class*='hpBookingForm']")).click();
		Thread.sleep(2000L);
		int i = 1;
		while (i < 5) {
			dr.findElement(By.className("icon-plus")).click();
			i++;
		}
		dr.findElement(By.cssSelector("button.btn.btn-primary.pax-done.btn-pad-y")).click();
		// s.selectByValue("2");
		// s.selectByIndex(5);
//	s.selectByVisibleText("9");
		// Select S = new Select(dr.findElement(By.cssSelector("")));

	}

}
