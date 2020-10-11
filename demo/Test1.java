package demo;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Test1 {
	private WebDriver driver;
	private String baseUrl;
	private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();
	
	@BeforeClass(alwaysRun = true)
	public void setUp() throws Exception {
		
		String projPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projPath +"\\src\\test\\java\\driver\\chromedriver.exe");
		
		driver = new ChromeDriver();
		baseUrl = "https://www.amalitech.com/";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@Test
	public void test1() throws Exception {
		driver.get("");
	}

}
