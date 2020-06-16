import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestive {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Pragya\\Documents\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("https://www.makemytrip.com/");
		dr.findElement(By.xpath("//*[@id='root']/div/div[2]/div/div[2]/div[1]/div[1]/div[1]/div/div/div/input"))
				.clear();
		// dr.findElement(By.xpath("//input[@class='react-autosuggest__input
		// react-autosuggest__input--open']")).sendKeys("Mum");
		// Thread.sleep(3000);
		// dr.findElement(By.xpath("//input[@class='react-autosuggest__input
		// react-autosuggest__input--open']")).sendKeys(Keys.ENTER);

	}

}
