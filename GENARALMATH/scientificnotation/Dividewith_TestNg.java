package scientificnotation;
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
public class Dividewith_TestNg {
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
		WebElement add = driver.findElement(By.xpath("//a[normalize-space()='Divide with']"));	
		Actions act1=new Actions(driver); 	
		act1.moveToElement(add).click().perform();
		Thread.sleep(3000);
		WebElement exp1 = driver.findElement(By.xpath("//input[@name='p1exp1']"));
		exp1.sendKeys("23");	
		Thread.sleep(3000);	
		WebElement exp2 = driver.findElement(By.xpath("//input[@name='p1exp2']"));
		exp2.sendKeys("14");	
		Thread.sleep(3000);	
		WebElement base1 = driver.findElement(By.xpath("//input[@name='p1base1']"));
		base1.sendKeys("24");	
		Thread.sleep(3000);	
		WebElement base2 = driver.findElement(By.xpath("//input[@name='p1base2']"));
		base2.sendKeys("64");	
		Thread.sleep(3000);	
		WebElement muit = driver.findElement(By.xpath("//p[1]//input[1]"));
		muit.click();
		Thread.sleep(10000);	
		File f1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);											
		Files.copy(f1, new File("D:\\ECLIPS\\HDFC\\Automation\\WEB_MATH\\ScreenShots\\Divip.png"));
	}
		@Test						
		public void ValidationApp1() throws Throwable, Exception {		
			WebElement gnma = driver.findElement(By.xpath("//a[@title='General Math']"));	
			Actions act=new Actions(driver);	
			act.moveToElement(gnma).click().perform();
			Thread.sleep(3000);	
			WebElement add = driver.findElement(By.xpath("//a[normalize-space()='Divide with']"));	
			Actions act1=new Actions(driver); 	
			act1.moveToElement(add).click().perform();
			Thread.sleep(3000);	
			WebElement exp1 = driver.findElement(By.xpath("//input[@name='p2exp1']"));
			exp1.sendKeys("13");	
			Thread.sleep(3000);	
			WebElement base1 = driver.findElement(By.xpath("//input[@name='p2base1']"));
			base1.sendKeys("24");	
			Thread.sleep(3000);	
			WebElement base2 = driver.findElement(By.xpath("//input[@name='p2base2']"));
			base2.sendKeys("64");	
			Thread.sleep(3000);	
			WebElement muit = driver.findElement(By.xpath("//p[1]//input[1]"));
			muit.click();
			Thread.sleep(10000);	
			File f1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);											
			Files.copy(f1, new File("D:\\ECLIPS\\HDFC\\Automation\\WEB_MATH\\ScreenShots\\devi.png"));		
}
		@Test
		public void ValidationApp2() throws Throwable, Exception {		
			WebElement gnma = driver.findElement(By.xpath("//a[@title='General Math']"));	
			Actions act=new Actions(driver);	
			act.moveToElement(gnma).click().perform();
			Thread.sleep(3000);	
			WebElement add = driver.findElement(By.xpath("//a[normalize-space()='Divide with']"));	
			Actions act1=new Actions(driver); 	
			act1.moveToElement(add).click().perform();
			Thread.sleep(3000);	
			WebElement exp3 = driver.findElement(By.xpath("//input[@name='p3exp2']"));
			exp3.sendKeys("13");	
			Thread.sleep(3000);	
			WebElement base3 = driver.findElement(By.xpath("//input[@name='p3base1']"));
			base3.sendKeys("24");	
			Thread.sleep(3000);	
			WebElement base4 = driver.findElement(By.xpath("//input[@name='p3base2']"));
			base4.sendKeys("64");	
			Thread.sleep(3000);	
			WebElement muit = driver.findElement(By.xpath("//p[1]//input[1]"));
			muit.click();
			Thread.sleep(10000);	
			File f1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);											
			Files.copy(f1, new File("D:\\ECLIPS\\HDFC\\Automation\\WEB_MATH\\ScreenShots\\devede.png"));	
}
}