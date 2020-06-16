import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//import jdk.internal.jline.WindowsTerminal.KEY_EVENT_RECORD;

public class ActionsClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Pragya\\Documents\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://www.amazon.com/");
		Actions a = new Actions(dr);
		WebElement move = dr.findElement(By.id("nav-link-accountList"));
		a.moveToElement(dr.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("gel")
				.doubleClick().build().perform();
		a.moveToElement(move).build().perform();
	}

}
