import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_01 {
	@Test
	public void testOne() {
		WebDriverManager.chromedriver().version("80").setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		Reporter.log(driver.getTitle(), true);
		driver.close();
	}

}
