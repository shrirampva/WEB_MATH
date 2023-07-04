package numbercrunching;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
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
public class With_Varibles_to {
	public static WebDriver driver;
	@BeforeTest 	
	public void launchApp()  {					
		System.setProperty("webdriver.chrome.driver", "D:\\ECLIPS\\HDFC\\Automation\\WEB_MATH\\ChromeDriver\\chromedriver.exe"); 													
		driver = new ChromeDriver();													
		driver.get("https://www.webmath.com/index.html");													
		driver.manage().window().maximize();													
	}
	@AfterTest		
	public void closeApp() { 		
	driver.close();		
	}		
	@Test						
	public void validationApp(){
		try {
			FileInputStream f = new FileInputStream("D:\\ECLIPS\\HDFC\\Automation\\WEB_MATH\\testfolder\\Numbercrunching.xls");		
			try (HSSFWorkbook wb1 = new HSSFWorkbook(f)) {
				HSSFSheet s1 = wb1.getSheet("Sheet1");
		WebElement gnma = driver.findElement(By.xpath(s1.getRow(1).getCell(1).getStringCellValue()));	
		Actions act=new Actions(driver);	
		act.moveToElement(gnma).click().perform();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement wvar = driver.findElement(By.xpath(s1.getRow(2).getCell(1).getStringCellValue()));	
		Actions act1=new Actions(driver); 	
		act1.moveToElement(wvar).click().perform();
		WebElement dtf = driver.findElement(By.xpath(s1.getRow(3).getCell(1).getStringCellValue()));
		dtf.clear();
		dtf.sendKeys("2a+4b-3c+2xyz");	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement a = driver.findElement(By.xpath(s1.getRow(4).getCell(1).getStringCellValue()));
		a.clear();
		a.sendKeys("1");	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement b = driver.findElement(By.xpath(s1.getRow(5).getCell(1).getStringCellValue()));
		b.clear();
		b.sendKeys("2");	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement c = driver.findElement(By.xpath(s1.getRow(6).getCell(1).getStringCellValue()));
		c.clear();
		c.sendKeys("2");	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement x = driver.findElement(By.xpath(s1.getRow(7).getCell(1).getStringCellValue()));
		x.clear();
		x.sendKeys("2");	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement y = driver.findElement(By.xpath(s1.getRow(8).getCell(1).getStringCellValue()));
		y.clear();
		y.sendKeys("5");	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
		WebElement z = driver.findElement(By.xpath(s1.getRow(9).getCell(1).getStringCellValue()));
		z.clear();
		z.sendKeys("8");	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement ncrunch = driver.findElement(By.xpath(s1.getRow(10).getCell(1).getStringCellValue()));
		ncrunch.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to("https://www.webmath.com/cgi-bin/gopoly.cgi?s=2%281%29%2B4%282%29%2D3%282%29%2B2%282%294%285%29&back=/crunchvar.html");
			}
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			}
		catch (Exception e) {
		File f1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);	
		try {
		Files.copy(f1, new File("D:\\ECLIPS\\HDFC\\Automation\\WEB_MATH\\ScreenShots\\Numbercrunch.png"));	
		} catch (IOException e1) {
			e1.printStackTrace();
}
}
}
}