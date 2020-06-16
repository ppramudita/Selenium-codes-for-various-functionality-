import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TestCase3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Internet explorer
		System.setProperty("webdriver.ie.driver", "C:\\Users\\Pragya\\Documents\\selenium\\IEDriverServer.exe");
		WebDriver ieDriver = new InternetExplorerDriver();
		ieDriver.get("http://google.com");
	}

}
