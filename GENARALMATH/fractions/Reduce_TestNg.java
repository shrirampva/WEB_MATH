package fractions;
import java.io.File;
import jxl.Sheet;
import jxl.Workbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.google.common.io.Files;
public class Reduce_TestNg {
	public static WebDriver driver;
	public Workbook wb; 
	public Sheet sh;
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
		WebElement redu = driver.findElement(By.xpath("//a[normalize-space()='Reduce']"));	
		Actions act1=new Actions(driver); 	
		act1.moveToElement(redu).click().perform();
		WebElement top = driver.findElement(By.xpath("//input[@name='top']"));
		top.clear();
		top.sendKeys("6");	
		Thread.sleep(3000);	
		WebElement bottom = driver.findElement(By.xpath("//input[@name='bottom']"));
		bottom.clear();
		bottom.sendKeys("63");	
		Thread.sleep(3000);	
		WebElement reduceit = driver.findElement(By.xpath("//input[@value='Reduce it']"));
		reduceit.click();
		Thread.sleep(3000);
		Thread.sleep(10000);	
		File f1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);											
		Files.copy(f1, new File("D:\\ECLIPS\\HDFC\\Automation\\WEB_MATH\\ScreenShots\\Reduceit.png"));

		
}

	}

		