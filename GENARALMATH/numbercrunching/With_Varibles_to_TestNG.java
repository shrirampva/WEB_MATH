package numbercrunching;
import java.io.File;
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
public class With_Varibles_to_TestNG {
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
		WebElement wvar = driver.findElement(By.xpath("//a[normalize-space()='with variables too']"));	
		Actions act1=new Actions(driver); 	
		act1.moveToElement(wvar).click().perform();
		WebElement dtf = driver.findElement(By.xpath("//input[@name='param0']"));
		dtf.clear();
		dtf.sendKeys("2a+4b-3c+2xyz");	
		Thread.sleep(3000);	
		WebElement a = driver.findElement(By.xpath("//input[@name='a']"));
		a.clear();
		a.sendKeys("1");	
		Thread.sleep(3000);	
		WebElement b = driver.findElement(By.xpath("//input[@name='b']"));
		b.clear();
		b.sendKeys("2");	
		Thread.sleep(3000);	
		WebElement c = driver.findElement(By.xpath("//input[@name='c']"));
		c.clear();
		c.sendKeys("2");	
		Thread.sleep(3000);	
		WebElement x = driver.findElement(By.xpath("//input[@name='x']"));
		x.clear();
		x.sendKeys("2");	
		Thread.sleep(3000);	
		WebElement y = driver.findElement(By.xpath("//input[@name='y']"));
		y.clear();
		y.sendKeys("5");	
		Thread.sleep(3000);	
		WebElement z = driver.findElement(By.xpath("//input[@name='z']"));
		z.clear();
		z.sendKeys("8");	
		Thread.sleep(3000);	
		WebElement ncrunch = driver.findElement(By.xpath("//input[@value='Number Crunch']"));
		ncrunch.click();
		Thread.sleep(3000);
		driver.navigate().to("https://www.webmath.com/cgi-bin/gopoly.cgi?s=2%281%29%2B4%282%29%2D3%282%29%2B2%282%294%285%29&back=/crunchvar.html");
		Thread.sleep(10000);	
		File f1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);											
		Files.copy(f1, new File("D:\\ECLIPS\\HDFC\\Automation\\WEB_MATH\\ScreenShots\\Numbercrunch.png"));	
}
}
