import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Pragya\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver chromeDr = new ChromeDriver();
		chromeDr.get("https://www.spicejet.com/");
		chromeDr.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		chromeDr.findElement(By.xpath("//div[@id ='ctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='BOM']"))
				.click();
		Thread.sleep(2000);
		chromeDr.findElement(By.xpath("//div[@id ='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='PAT']"))
				.click();

	}

}
