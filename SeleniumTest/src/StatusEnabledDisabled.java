import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StatusEnabledDisabled {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Pragya\\Documents\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("https://www.spicejet.com/");
		System.out.println(dr.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());
		System.out.println(dr.findElement(By.id("Div1")).getAttribute("style"));
		// dr.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		// System.out.println(dr.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());
		System.out.println(dr.findElement(By.id("Div1")).getAttribute("style"));
		if (dr.findElement(By.id("Div1")).getAttribute("style").contains("1")) {
			System.out.println("IS Enabled");
		} else {
			System.out.println("Is Disabled");
		}

	}
}
