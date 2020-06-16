import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Pragya\\Documents\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
		dr.findElement(By.xpath("//*[@id=\"initialView\"]/footer/ul/li[1]/a")).click();
		System.out.println(dr.getTitle());
		Set<String> ids = dr.getWindowHandles();
		Iterator<String> it = ids.iterator();
		String pid = it.next();
		String cid = it.next();
		dr.switchTo().window(cid);
		System.out.println(dr.getTitle());
		
	}

}
