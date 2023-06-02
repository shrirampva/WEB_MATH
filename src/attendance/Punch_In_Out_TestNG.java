package attendance;
import java.io.File;
import java.io.FileInputStream;
import jxl.Sheet;
import jxl.Workbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.google.common.io.Files;
//import org.openqa.selenium.Keys;
public class Punch_In_Out_TestNG {
	public static WebDriver driver;
	public Workbook wb; 
	public Sheet sh;
	@BeforeTest 	
	public void LaunchApp() throws Exception, Throwable {					
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sree Harish\\Downloads\\chromedriver_win32\\chromedriver.exe"); 													
		driver = new ChromeDriver();													
		driver.get("https://adminjon-osondemand.orangehrm.com/symfony/web/index.php/auth/login");													
		driver.manage().window().maximize();													
	}
	@AfterTest		
	public void CloseApp() { 		
	driver.close();		
	}		
	@Test						
	public void ValidationApp() throws Throwable, Exception {						
		FileInputStream f = new FileInputStream("D:\\ECLIPS\\ORANGE_HRM(TIME)\\testfolder\\ORANGEHRM.xls");									
		Workbook wb = Workbook.getWorkbook(f);
		Sheet s = wb.getSheet("Sheet1");			
		driver.findElement(By.name(s.getCell(1, 2).getContents())).sendKeys(s.getCell(1, 5).getContents());											
		driver.findElement(By.name(s.getCell(1, 3).getContents())).sendKeys(s.getCell(1, 6).getContents());											
		driver.findElement(By.name(s.getCell(1, 4).getContents())).click();
		WebElement time = driver.findElement(By.xpath("//*[@id=\"menu_time_viewTimeModule\"]/b"));	
		Actions act=new Actions(driver);	
		act.moveToElement(time).perform();
		Thread.sleep(3000);	
		WebElement attendance = driver.findElement(By.xpath("//a[@id='menu_attendance_Attendance']"));	
		Actions act1=new Actions(driver); 	
		act1.moveToElement(attendance).click().perform();
		Thread.sleep(3000);	
		WebElement punchin = driver.findElement(By.xpath("//a[@id='menu_attendance_punchIn']"));	
		act1.moveToElement(punchin).click().perform();
		driver.findElement(By.xpath("//*[@id=\"note\"]")).sendKeys("In");
		WebElement in = driver.findElement(By.xpath("//*[@id=\"btnPunch\"]"));	
		act1.moveToElement(in).click().perform();
		Thread.sleep(3000);	
		driver.navigate().to("https://adminjon-osondemand.orangehrm.com/symfony/web/index.php/attendance/punchOut");
		driver.findElement(By.xpath("//*[@id=\"note\"]")).sendKeys("Out");
		WebElement out = driver.findElement(By.xpath("//*[@id=\"btnPunch\"]"));	
		act1.moveToElement(out).click().perform();
		Thread.sleep(10000);	
		File f1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);											
		Files.copy(f1, new File("D:\\ECLIPS\\ORANGE_HRM(TIME)\\ScreenShots\\employeerecords.png"));											
		Thread.sleep(10000);	
		File f12 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);											
		Files.copy(f12, new File("D:\\ECLIPS\\ORANGE_HRM(TIME)\\ScreenShots\\punchinout.png"));											

}
}
