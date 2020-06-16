import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignementSix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Pragya\\Documents\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("https://qaclickacademy.com/practice.php");
		dr.findElement(By.id("checkBoxOption2")).click();
		String a = dr.findElement(By.xpath("//label[@for='benz']")).getText();
		System.out.println(a);
		dr.findElement(By.id("dropdown-class-example")).click();
		WebElement dropdown = dr.findElement(By.id("dropdown-class-example"));
		Select s = new Select(dropdown);
		s.selectByVisibleText(a);
		dr.findElement(By.name("enter-name")).sendKeys(a);
		dr.findElement(By.id("alertbtn")).click();
		String alertText = dr.switchTo().alert().getText();
		if (alertText.contains(a)) {
			System.out.println("Alert message Success");
		} else
			System.out.println("Something wrong");
	}

}
