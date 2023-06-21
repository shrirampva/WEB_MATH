package fractions;
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
public class Subtract {
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
	public void validationApp()  {
		try {
			FileInputStream f = new FileInputStream("D:\\ECLIPS\\HDFC\\Automation\\WEB_MATH\\testfolder\\Fraction.xls");		
			try (HSSFWorkbook wb1 = new HSSFWorkbook(f)) {
				HSSFSheet s1 = wb1.getSheet("Sheet6");
		WebElement gnma = driver.findElement(By.xpath(s1.getRow(1).getCell(1).getStringCellValue()));	
		Actions act=new Actions(driver);	
		act.moveToElement(gnma).click().perform();
		Thread.sleep(3000);	
		WebElement add = driver.findElement(By.xpath(s1.getRow(2).getCell(1).getStringCellValue()));	
		Actions act1=new Actions(driver); 	
		act1.moveToElement(add).click().perform();
		Thread.sleep(3000);
		WebElement clearform = driver.findElement(By.xpath(s1.getRow(3).getCell(1).getStringCellValue()));
        clearform.click();	
		Thread.sleep(3000);	
		WebElement atop = driver.findElement(By.xpath(s1.getRow(4).getCell(1).getStringCellValue()));
		atop.sendKeys("23");	
		Thread.sleep(3000);	
		WebElement abottom = driver.findElement(By.xpath(s1.getRow(5).getCell(1).getStringCellValue()));
		abottom.sendKeys("22");	
		Thread.sleep(3000);	
		WebElement bwhole = driver.findElement(By.xpath(s1.getRow(6).getCell(1).getStringCellValue()));
		bwhole.sendKeys("25");	
		Thread.sleep(3000);	
		WebElement btop = driver.findElement(By.xpath(s1.getRow(7).getCell(1).getStringCellValue()));
		btop.sendKeys("45");	
		Thread.sleep(3000);
		WebElement bbottom = driver.findElement(By.xpath(s1.getRow(8).getCell(1).getStringCellValue()));
		bbottom.sendKeys("56");	
		Thread.sleep(3000);
		WebElement cwhole = driver.findElement(By.xpath(s1.getRow(9).getCell(1).getStringCellValue()));
		cwhole.sendKeys("25");	
		Thread.sleep(3000);
		WebElement ctop = driver.findElement(By.xpath(s1.getRow(10).getCell(1).getStringCellValue()));
		ctop.sendKeys("74");	
		Thread.sleep(3000);
		WebElement cbottom = driver.findElement(By.xpath(s1.getRow(11).getCell(1).getStringCellValue()));
		cbottom.sendKeys("45");	
		Thread.sleep(3000);
		WebElement atop1 = driver.findElement(By.xpath(s1.getRow(12).getCell(1).getStringCellValue()));
		atop1.sendKeys("22");	
		Thread.sleep(3000);
		WebElement abottom1 = driver.findElement(By.xpath(s1.getRow(13).getCell(1).getStringCellValue()));
		abottom1.sendKeys("45");	
		Thread.sleep(3000);
		WebElement btop1 = driver.findElement(By.xpath(s1.getRow(14).getCell(1).getStringCellValue()));
		btop1.sendKeys("45");	
		Thread.sleep(3000);
		WebElement bbottom1 = driver.findElement(By.xpath(s1.getRow(15).getCell(1).getStringCellValue()));
		bbottom1.sendKeys("65");	
		Thread.sleep(3000);
		WebElement cwhole1 = driver.findElement(By.xpath(s1.getRow(16).getCell(1).getStringCellValue()));
		cwhole1.sendKeys("45");	
		Thread.sleep(3000);
		WebElement ctop1 = driver.findElement(By.xpath(s1.getRow(17).getCell(1).getStringCellValue()));
		ctop1.sendKeys("58");	
		Thread.sleep(3000);
		WebElement cbottom1 = driver.findElement(By.xpath(s1.getRow(18).getCell(1).getStringCellValue()));
		cbottom1.sendKeys("78");	
		Thread.sleep(3000);
		WebElement addit = driver.findElement(By.xpath(s1.getRow(19).getCell(1).getStringCellValue()));
		addit.click();
			}
		Thread.sleep(10000);
		}
		catch(Exception e) {
		File f1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);	
		try {
		Files.copy(f1, new File("D:\\ECLIPS\\HDFC\\Automation\\WEB_MATH\\ScreenShots\\Subit.png"));
		} catch (IOException e1) {
			e1.printStackTrace();										
}	
}				
}
}
