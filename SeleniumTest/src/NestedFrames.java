import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Pragya\\Documents\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("https://the-internet.herokuapp.com/");
		dr.findElement(By.xpath("//*[@id=\'content\']/ul/li[34]/a")).click();
		dr.switchTo().frame(dr.findElement(By.xpath("//frame[@name='frame-top']")));
		dr.switchTo().frame(dr.findElement(By.xpath("//frame[@name='frame-middle']")));
		System.out.println(dr.findElement(By.xpath("//div[@id ='content']")).getText());

	}

}
