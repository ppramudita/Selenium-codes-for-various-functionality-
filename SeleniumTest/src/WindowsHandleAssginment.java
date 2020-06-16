import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandleAssginment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Pragya\\Documents\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("https://the-internet.herokuapp.com/");
		dr.findElement(By.xpath("//*[@id=\'content\']/ul/li[33]/a")).click();
		dr.findElement(By.xpath("//*[@id=\'content\']/div/a")).click();
		Set <String> ids = dr.getWindowHandles();
		Iterator<String> it =ids.iterator();
		String pid = it.next();
		String cid= it.next();
		dr.switchTo().window(cid);
		System.out.println(dr.getTitle());
		dr.switchTo().window(pid);
		System.out.println(dr.findElement(By.xpath("//*[@id=\'content\']/div/h3")).getText());
		
	}

}
