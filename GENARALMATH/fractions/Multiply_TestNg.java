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
public class Multiply_TestNg {
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
		WebElement mul = driver.findElement(By.xpath("//a[normalize-space()='Multiply']"));	
		Actions act1=new Actions(driver); 	
		act1.moveToElement(mul).click().perform();
		Thread.sleep(3000);
		WebElement clearform = driver.findElement(By.xpath("//input[@value='Clear the Entire Form']"));
        clearform.click();	
		Thread.sleep(3000);	
		WebElement atop = driver.findElement(By.xpath("//input[@name='atop1']"));
		atop.sendKeys("23");	
		Thread.sleep(3000);	
		WebElement abottom = driver.findElement(By.xpath("//input[@name='abottom1']"));
		abottom.sendKeys("22");	
		Thread.sleep(3000);	
		WebElement bwhole = driver.findElement(By.xpath("//input[@name='bwhole1']"));
		bwhole.sendKeys("25");	
		Thread.sleep(3000);	
		WebElement btop = driver.findElement(By.xpath("//input[@name='btop1']"));
		btop.sendKeys("45");	
		Thread.sleep(3000);
		WebElement bbottom = driver.findElement(By.xpath("//input[@name='bbottom1']"));
		bbottom.sendKeys("56");	
		Thread.sleep(3000);
		WebElement cwhole = driver.findElement(By.xpath("//input[@name='cwhole1']"));
		cwhole.sendKeys("25");	
		Thread.sleep(3000);
		WebElement ctop = driver.findElement(By.xpath("//input[@name='ctop1']"));
		ctop.sendKeys("74");	
		Thread.sleep(3000);
		WebElement cbottom = driver.findElement(By.xpath("//input[@name='cbottom1']"));
		cbottom.sendKeys("45");	
		Thread.sleep(3000);
		WebElement atop1 = driver.findElement(By.xpath("//input[@name='atop2']"));
		atop1.sendKeys("22");	
		Thread.sleep(3000);
		WebElement abottom1 = driver.findElement(By.xpath("//input[@name='abottom2']"));
		abottom1.sendKeys("45");	
		Thread.sleep(3000);
		WebElement btop1 = driver.findElement(By.xpath("//input[@name='btop2']"));
		btop1.sendKeys("45");	
		Thread.sleep(3000);
		WebElement bbottom1 = driver.findElement(By.xpath("//input[@name='bbottom2']"));
		bbottom1.sendKeys("65");	
		Thread.sleep(3000);
		WebElement cwhole1 = driver.findElement(By.xpath("//input[@name='cwhole2']"));
		cwhole1.sendKeys("45");	
		Thread.sleep(3000);
		WebElement ctop1 = driver.findElement(By.xpath("//input[@name='ctop2']"));
		ctop1.sendKeys("58");	
		Thread.sleep(3000);
		WebElement cbottom1 = driver.findElement(By.xpath("//input[@name='cbottom2']"));
		cbottom1.sendKeys("78");	
		Thread.sleep(3000);
		WebElement addit = driver.findElement(By.xpath("//input[@value='Multiply']"));
		addit.click();
		Thread.sleep(10000);	
		File f1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);											
		Files.copy(f1, new File("D:\\ECLIPS\\HDFC\\Automation\\WEB_MATH\\ScreenShots\\multyplyit.png"));

		
}
}
