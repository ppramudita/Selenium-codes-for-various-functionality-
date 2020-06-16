import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Pragya\\Documents\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("http://echoecho.com/htmlforms10.htm");
		dr.findElement(By.xpath("//input[@value='Cheese']")).click();
		int count = dr.findElements(By.xpath("//input[@name='group1']")).size();
		for (int i = 0; i < count; i++) {
			String text = dr.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value");
			if (text.equalsIgnoreCase("butter")) {
				dr.findElements(By.xpath("//input[@name='group1']")).get(i).click();
			}
		}

	}

}
