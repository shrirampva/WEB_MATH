package scientificnotation;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

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
public class Multiplywith {
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
				HSSFSheet s1 = wb1.getSheet("Sheet3");
		WebElement gnma = driver.findElement(By.xpath(s1.getRow(1).getCell(1).getStringCellValue()));	
		Actions act=new Actions(driver);	
		act.moveToElement(gnma).click().perform();
		Thread.sleep(3000);	
		WebElement add = driver.findElement(By.xpath(s1.getRow(2).getCell(1).getStringCellValue()));	
		Actions act1=new Actions(driver); 	
		act1.moveToElement(add).click().perform();
		Thread.sleep(3000);
		WebElement exp1 = driver.findElement(By.xpath(s1.getRow(3).getCell(1).getStringCellValue()));
		exp1.sendKeys("23");	
		Thread.sleep(3000);	
		WebElement exp2 = driver.findElement(By.xpath(s1.getRow(4).getCell(1).getStringCellValue()));
		exp2.sendKeys("14");	
		Thread.sleep(3000);	
		WebElement base1 = driver.findElement(By.xpath(s1.getRow(5).getCell(1).getStringCellValue()));
		base1.sendKeys("24");	
		Thread.sleep(3000);	
		WebElement base2 = driver.findElement(By.xpath(s1.getRow(6).getCell(1).getStringCellValue()));
		base2.sendKeys("64");	
		Thread.sleep(3000);	
		WebElement muit = driver.findElement(By.xpath(s1.getRow(7).getCell(1).getStringCellValue()));
		muit.click();
			}
		Thread.sleep(10000);	
		}
		catch (Exception e) {
		File f1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);	
		try {
		Files.copy(f1, new File("D:\\ECLIPS\\HDFC\\Automation\\WEB_MATH\\ScreenShots\\mumip.png"));
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		}	
	}
		@Test						
		public void validationApp1()  {		
			try {
				FileInputStream f = new FileInputStream("D:\\ECLIPS\\HDFC\\Automation\\WEB_MATH\\testfolder\\Scientificnotation.xls");		
				try (HSSFWorkbook wb1 = new HSSFWorkbook(f)) {
					HSSFSheet s1 = wb1.getSheet("Sheet3");
			WebElement gnma = driver.findElement(By.xpath(s1.getRow(8).getCell(1).getStringCellValue()));	
			Actions act=new Actions(driver);	
			act.moveToElement(gnma).click().perform();
			Thread.sleep(3000);	
			WebElement add = driver.findElement(By.xpath(s1.getRow(9).getCell(1).getStringCellValue()));	
			Actions act1=new Actions(driver); 	
			act1.moveToElement(add).click().perform();
			Thread.sleep(3000);	
			WebElement exp1 = driver.findElement(By.xpath(s1.getRow(10).getCell(1).getStringCellValue()));
			exp1.sendKeys("13");	
			Thread.sleep(3000);	
			WebElement base1 = driver.findElement(By.xpath(s1.getRow(11).getCell(1).getStringCellValue()));
			base1.sendKeys("24");	
			Thread.sleep(3000);	
			WebElement base2 = driver.findElement(By.xpath(s1.getRow(12).getCell(1).getStringCellValue()));
			base2.sendKeys("64");	
			Thread.sleep(3000);	
			WebElement muit = driver.findElement(By.xpath(s1.getRow(13).getCell(1).getStringCellValue()));
			muit.click();
				}
			Thread.sleep(10000);
			}
			catch(Exception e) {
			File f1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			try {
			Files.copy(f1, new File("D:\\ECLIPS\\HDFC\\Automation\\WEB_MATH\\ScreenShots\\mump.png"));	
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			}		
}

}
