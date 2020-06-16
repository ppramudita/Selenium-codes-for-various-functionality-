import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkCount {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Pragya\\Documents\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("https://qaclickacademy.com/practice.php");
		System.out.println(dr.findElements(By.tagName("a")).size());

		// To find the count of links in footer section

		WebElement footerDr = dr.findElement(By.id("gf-BIG"));
		System.out.println(footerDr.findElements(By.tagName("a")).size());

		// To find the count of links in first coulumn of footer section

		WebElement firstcolDr = footerDr.findElement(By.xpath("//*[@id=\'gf-BIG\']/table/tbody/tr/td[1]/ul"));
		System.out.println(firstcolDr.findElements(By.tagName("a")).size());

		// Open each link in a separate tabs
		for (int i = 1; i < firstcolDr.findElements(By.tagName("a")).size(); i++) {
			String openLinkTab = Keys.chord(Keys.CONTROL, Keys.ENTER);
			firstcolDr.findElements(By.tagName("a")).get(i).sendKeys(openLinkTab);
		}
		Thread.sleep(5000);
		Set<String> ids = dr.getWindowHandles();
		Iterator<String> it = ids.iterator();
		while (it.hasNext()) {
			dr.switchTo().window(it.next());
			System.out.println(dr.getTitle());
		}

	}

}
