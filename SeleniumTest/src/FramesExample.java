import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FramesExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Pragya\\Documents\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("https://jqueryui.com/droppable/");
		// To find the number of frames

		dr.switchTo().frame(dr.findElement(By.cssSelector("iframe.demo-frame")));
		System.out.println(dr.findElements(By.tagName("iframe")).size());
		dr.findElement(By.id("draggable")).click();
		Actions a = new Actions(dr);
		WebElement src = dr.findElement(By.id("draggable"));
		WebElement dest = dr.findElement(By.id("droppable"));
		a.dragAndDrop(src, dest).build().perform();

	}

}
