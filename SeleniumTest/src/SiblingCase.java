import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SiblingCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Pragya\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("https://qaclickacademy.com/interview.php");
		dr.findElement(By.xpath("//li[@id='tablist1-tab1']")).click();
		dr.findElement(By.xpath("//li[@id='tablist1-tab2']")).click();
		dr.findElement(By.xpath("//li[@id='tablist1-tab3']")).click();
		dr.findElement(By.xpath("//li[@id='tablist1-tab4']")).click();
	}

}
