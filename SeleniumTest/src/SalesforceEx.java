import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SalesforceEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Pragya\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver chromeDr = new ChromeDriver();
		chromeDr.get("https://www.reebok.com/");
		chromeDr.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[1]/div/div[1]/div/div/a[4]")).click();
		chromeDr.findElement(By.cssSelector("input[name*='dwfrm_login']")).sendKeys("userid");
		chromeDr.findElement(By.cssSelector("input[type*='password']")).sendKeys("password");
		chromeDr.findElement(By.cssSelector("button[class*='materialize']")).click();
		System.out.println("pass");

	}

}
