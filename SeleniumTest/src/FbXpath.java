import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//set chrome property : invoke .exe file
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pragya\\Downloads\\chromedriver_win32\\chromedriver.exe");
	//create object of ChromeDriver class
	ChromeDriver chromeDr = new ChromeDriver();
	//get the website trying to automate
	chromeDr.get("https://facebook.com");	
	//locate user id using xpath
	/*chromeDr.findElement(By.xpath("//input[@name='email']")).sendKeys("userid");
	chromeDr.findElement(By.xpath("//input[@name='pass']")).sendKeys("password");
	chromeDr.findElement(By.xpath("//input[@aria-label='Log In']")).click();
	System.out.println(chromeDr.findElement(By.xpath("//div[@class='_4rbf _53ij']")).getText());*/
	
	//locator using CSS
	chromeDr.findElement(By.cssSelector("input[name='email']")).sendKeys("user");
	chromeDr.findElement(By.cssSelector("input[name='pass']")).sendKeys("Pass");
	chromeDr.findElement(By.cssSelector("input[aria-label='Log In']")).click();
	}

}
