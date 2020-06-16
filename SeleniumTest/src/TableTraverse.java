import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableTraverse {

	public static void main(String[] args) {
		int sum = 0;
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Pragya\\Documents\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("https://www.cricbuzz.com/live-cricket-scorecard/22853/wi-vs-ind-1st-t20i-india-tour-of-west-indies-2019");
		WebElement table = dr.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
		int rowcount = table
				.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();
		System.out.println(rowcount);
		for (int i = 0; i < rowcount - 2; i++) {
			String value = table
					.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i)
					.getText();
			int valueInteger = Integer.parseInt(value);
			sum += valueInteger;
		}

		String Extras = dr.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText();
		int intExtras = Integer.parseInt(Extras);
		sum += intExtras;
		System.out.println("sum is: " + sum);
		String ActuaTotal = (dr.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText());
		int ActualTotalInt = Integer.parseInt(ActuaTotal);
		if (sum == ActualTotalInt) {
			System.out.println("Both totals are equal");
		} else {
			System.out.println("Totals are not equal");
		}
	}

}
