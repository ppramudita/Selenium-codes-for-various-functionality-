import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestCase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Firefox
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Pragya\\Documents\\selenium\\geckodriver.exe");
		WebDriver firefoxDr = new FirefoxDriver();
		firefoxDr.get("http://google.com");
		System.out.println(firefoxDr.getTitle());
	}

}
