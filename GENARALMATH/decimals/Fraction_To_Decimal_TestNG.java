package decimals;
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
public class Fraction_To_Decimal_TestNG {
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
		WebElement ftod = driver.findElement(By.xpath("//a[normalize-space()='Fraction to Decimal']"));	
		Actions act1=new Actions(driver); 	
		act1.moveToElement(ftod).click().perform();
		WebElement ftdtop = driver.findElement(By.xpath("//input[@name='top']"));
		ftdtop.clear();
		Thread.sleep(3000);	
		ftdtop.sendKeys("23");	
		Thread.sleep(3000);	
		WebElement ftdbtm = driver.findElement(By.xpath("//input[@name='bottom']"));
		ftdbtm.clear();
		Thread.sleep(3000);	
		ftdbtm.sendKeys("32");	
		Thread.sleep(3000);
		WebElement ftd = driver.findElement(By.xpath("//input[@name='dplaces']"));
		ftd.clear();
		Thread.sleep(3000);	
		ftd.sendKeys("3");	
		Thread.sleep(3000);
		WebElement covit = driver.findElement(By.xpath("//input[@value='Convert it']"));
		covit.click();
		Thread.sleep(10000);	
		File f1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);											
		Files.copy(f1, new File("D:\\ECLIPS\\HDFC\\Automation\\WEB_MATH\\ScreenShots\\FractiontoDecimal.png"));										
													

}
}
