import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Create chrome driver object
		// invoke .exe file first
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Pragya\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver chromeDr = new ChromeDriver();
		// chromeDr.get("http://google.com");
		// System.out.println(chromeDr.getTitle());
		// System.out.println(chromeDr.getCurrentUrl());
		// System.out.println(chromeDr.getPageSource());
		// chromeDr.get("http://yahoo.com");
		// chromeDr.navigate().back();
		// chromeDr.close();
		// chromeDr.quit();
		// Login to facebook
		chromeDr.get("https://facebook.com");
		System.out.println(chromeDr.getCurrentUrl());
		chromeDr.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("pragyapramudita99@gmail.com");
		chromeDr.findElement(By.cssSelector("input#pass.inputtext")).sendKeys("password");
		// chromeDr.findElement(By.linkText("Forgotten account?")).click();

		// Forgot passwod
//		chromeDr.findElement(By.xpath("//*[@id=\"login_form\"]/table/tbody/tr[3]/td[2]/div/a")).click();
		// Login button
		chromeDr.findElement(By.xpath("//input[@value='Log In']")).click();
		System.out.println(chromeDr.findElement(By.cssSelector("div._4rbf._53ij")).getText());
		System.out.println("pass");

	}

}
