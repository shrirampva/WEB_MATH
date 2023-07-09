package scientificnotation;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import jxl.Sheet;
import jxl.Workbook;
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
import decimals.Decimal_To_Fraction;
public class Dividewith extends Decimal_To_Fraction{
	public static WebDriver driver;
	public Workbook wb; 
	public Sheet sh;
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
	public void validationApp() {	
		try {
			FileInputStream f = new FileInputStream("D:\\ECLIPS\\HDFC\\Automation\\WEB_MATH\\testfolder\\Scientificnotation.xls");		
			try (HSSFWorkbook wb1 = new HSSFWorkbook(f)) {
				HSSFSheet s1 = wb1.getSheet("Sheet2");
		WebElement gnma = driver.findElement(By.xpath(s1.getRow(1).getCell(1).getStringCellValue()));	
		Actions act=new Actions(driver);	
		act.moveToElement(gnma).click().perform();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement add = driver.findElement(By.xpath(s1.getRow(2).getCell(1).getStringCellValue()));	
		Actions act1=new Actions(driver); 	
		act1.moveToElement(add).click().perform();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement exp1 = driver.findElement(By.xpath(s1.getRow(3).getCell(1).getStringCellValue()));
		exp1.sendKeys("23");	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
		WebElement exp2 = driver.findElement(By.xpath(s1.getRow(4).getCell(1).getStringCellValue()));
		exp2.sendKeys("14");	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement base1 = driver.findElement(By.xpath(s1.getRow(5).getCell(1).getStringCellValue()));
		base1.sendKeys("24");	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement base2 = driver.findElement(By.xpath(s1.getRow(6).getCell(1).getStringCellValue()));
		base2.sendKeys("64");	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement muit = driver.findElement(By.xpath(s1.getRow(7).getCell(1).getStringCellValue()));
		muit.click();
			}
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		}
		catch (Exception e) {
		File f1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);	
		try {
		Files.copy(f1, new File("D:\\ECLIPS\\HDFC\\Automation\\WEB_MATH\\ScreenShots\\Divip.png"));
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		}
	    }
		@Test						
		public void validationApp1() {	
			try {
				FileInputStream f = new FileInputStream("D:\\ECLIPS\\HDFC\\Automation\\WEB_MATH\\testfolder\\Scientificnotation.xls");		
				try (HSSFWorkbook wb1 = new HSSFWorkbook(f)) {
					HSSFSheet s1 = wb1.getSheet("Sheet2");
			WebElement gnma = driver.findElement(By.xpath(s1.getRow(8).getCell(1).getStringCellValue()));	
			Actions act=new Actions(driver);	
			act.moveToElement(gnma).click().perform();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			WebElement add = driver.findElement(By.xpath(s1.getRow(9).getCell(1).getStringCellValue()));	
			Actions act1=new Actions(driver); 	
			act1.moveToElement(add).click().perform();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			WebElement exp1 = driver.findElement(By.xpath(s1.getRow(10).getCell(1).getStringCellValue()));
			exp1.sendKeys("13");	
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			WebElement base1 = driver.findElement(By.xpath(s1.getRow(11).getCell(1).getStringCellValue()));
			base1.sendKeys("24");	
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			WebElement base2 = driver.findElement(By.xpath(s1.getRow(12).getCell(1).getStringCellValue()));
			base2.sendKeys("64");	
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
			WebElement muit = driver.findElement(By.xpath(s1.getRow(13).getCell(1).getStringCellValue()));
			muit.click();
				}
				driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			}
			catch (Exception e) {
			File f1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);	
			try {
			Files.copy(f1, new File("D:\\ECLIPS\\HDFC\\Automation\\WEB_MATH\\ScreenShots\\devi.png"));
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			}		
}
		@Test
		public void validationApp2(){
			try {
				FileInputStream f = new FileInputStream("D:\\ECLIPS\\HDFC\\Automation\\WEB_MATH\\testfolder\\Scientificnotation.xls");		
				try (HSSFWorkbook wb1 = new HSSFWorkbook(f)) {
					HSSFSheet s1 = wb1.getSheet("Sheet2");
			WebElement gnma = driver.findElement(By.xpath(s1.getRow(14).getCell(1).getStringCellValue()));	
			Actions act=new Actions(driver);	
			act.moveToElement(gnma).click().perform();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			WebElement add = driver.findElement(By.xpath(s1.getRow(15).getCell(1).getStringCellValue()));	
			Actions act1=new Actions(driver); 	
			act1.moveToElement(add).click().perform();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			WebElement exp3 = driver.findElement(By.xpath(s1.getRow(16).getCell(1).getStringCellValue()));
			exp3.sendKeys("13");	
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			WebElement base3 = driver.findElement(By.xpath(s1.getRow(17).getCell(1).getStringCellValue()));
			base3.sendKeys("24");	
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
			WebElement base4 = driver.findElement(By.xpath(s1.getRow(18).getCell(1).getStringCellValue()));
			base4.sendKeys("64");	
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			WebElement muit = driver.findElement(By.xpath(s1.getRow(19).getCell(1).getStringCellValue()));
			muit.click();
				}
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);	
			}
			catch (Exception e) {
			File f1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);	
			try {
			Files.copy(f1, new File("D:\\ECLIPS\\HDFC\\Automation\\WEB_MATH\\ScreenShots\\devede.png"));
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			}		
}
}
