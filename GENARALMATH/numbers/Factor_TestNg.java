package numbers;
import java.io.File;		
import com.google.common.io.Files;				
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class Factor_TestNg {
	public static WebDriver driver;
	@BeforeTest 	
	public void LaunchApp() throws Exception, Throwable {					
		System.setProperty("webdriver.chrome.driver", "D:\\ECLIPS\\HDFC\\Automation\\WEB_MATH\\ChromeDriver\\chromedriver.exe"); 													
		driver = new ChromeDriver();													
		driver.get("https://www.webmath.com/index.html");													
		driver.manage().window().maximize();													
	}
	@AfterTest		
	public void CloseApp() { 		
	driver.close();		
	}		
	@Test						
	public void ValidationApp() throws Throwable, Exception {						
		WebElement gnma = driver.findElement(By.xpath("//a[@title='General Math']"));	
		Actions act=new Actions(driver);	
		act.moveToElement(gnma).click().perform();
		Thread.sleep(3000);	
		WebElement factor = driver.findElement(By.xpath("//a[normalize-space()='Factor']"));	
		Actions act1=new Actions(driver); 	
		act1.moveToElement(factor).click().perform();
		Thread.sleep(3000);	
		WebElement name = driver.findElement(By.xpath("//select[@name='param0']"));	
		act1.moveToElement(name).click().perform();
		name.sendKeys(Keys.ARROW_DOWN);
		name.sendKeys(Keys.ENTER);
		Thread.sleep(3000);	
		WebElement type = driver.findElement(By.xpath("//input[@name='param1']"));
		type.clear();	
		type.sendKeys("16");
		driver.findElement(By.xpath("//input[@value='Factor it']")).click();
		Thread.sleep(10000);	
		File f1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);											
		Files.copy(f1, new File("D:\\ECLIPS\\HDFC\\Automation\\WEB_MATH\\ScreenShots\\factorit.png"));											
	}
}

