import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EndToEndSpiceJetBasic {
	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Pragya\\Documents\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("https://www.spicejet.com/");
		dr.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
		dr.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).clear();
		dr.findElement(By.xpath("//a[@value = 'BOM']")).click();
		dr.findElement(By.xpath("//div[@id = 'ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value = 'DEL']"))
				.click();
		// dr.findElement(By.id("ctl00_mainContent_view_date1")).click();
		dr.findElement(By.cssSelector("a.ui-state-default.ui-state-highlight.ui-state-active.ui-state-hover")).click();
		// dr.findElement(By.id("divpaxinfo")).click();
		// Thread.sleep(3000);
		// dr.findElement(arg0)
		// dr.findElement(By.id("hrefIncAdt")).click();
		// dr.findElement(By.id("btnclosepaxoption")).click();
		Select s = new Select(dr.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		s.selectByValue("INR");
		dr.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();

	}
}
