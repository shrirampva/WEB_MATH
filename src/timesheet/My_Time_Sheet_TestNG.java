package timesheet;
import java.io.FileInputStream;
import jxl.Sheet;
import jxl.Workbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.Keys;
import java.io.File;		
import com.google.common.io.Files;	
import org.openqa.selenium.TakesScreenshot;					
import org.openqa.selenium.OutputType;				

public class My_Time_Sheet_TestNG {
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
		File f1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);											
		Files.copy(f1, new File("D:\\ECLIPS\\ORANGE_HRM(TIME)\\Screenshots\\Time.png"));
		Actions act=new Actions(driver);	
		act.moveToElement(time).perform();	
		Thread.sleep(3000);	
		WebElement timeSheets = driver.findElement(By.xpath("//a[@id='menu_time_Timesheets']"));
		File f2 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);											
		Files.copy(f2, new File("D:\\ECLIPS\\ORANGE_HRM(TIME)\\Screenshots\\Timesheets.png"));
		Actions act1=new Actions(driver); 	
		act1.moveToElement(timeSheets).click().perform();
		Thread.sleep(3000);	
		WebElement mytimeSheets = driver.findElement(By.xpath("//a[@id='menu_time_viewMyTimesheet']"));	
		File f3 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);											
		Files.copy(f3, new File("D:\\ECLIPS\\ORANGE_HRM(TIME)\\Screenshots\\MyTimesheet.png"));
		act1.moveToElement(mytimeSheets).click().perform();	
		WebElement sheetWeek = driver.findElement(By.xpath("//select[@id='startDates']"));	
		Select sel=new Select(sheetWeek);	
		sel.selectByValue("0");
		Thread.sleep(3000);	
		WebElement status = driver.findElement(By.xpath("//*[@id=\"timesheet_status\"]/h2"));	
		System.out.println(status.getText());	
		WebElement edit = driver.findElement(By.xpath("//input[@id='btnEdit']"));	
		edit.click();	
		Thread.sleep(3000);	
		WebElement row = driver.findElement(By.xpath("//input[@id='initialRows_0_projectName']"));	
		row.clear();	
		row.sendKeys("MARY - S");
		row.sendKeys(Keys.ARROW_DOWN);			
		row.sendKeys(Keys.ENTER);			
		Thread.sleep(4000);	
		Select drpActivicty = new Select(driver.findElement(By.name("initialRows[0][projectActivityName]")));													
        drpActivicty.selectByVisibleText("ENG");
		Thread.sleep(1000);	
		driver.findElement(By.xpath("//input[@id='initialRows_0_0']")).sendKeys("8:00");
		driver.findElement(By.xpath("//input[@id='initialRows_0_0']")).clear();
		driver.findElement(By.xpath("//input[@id='initialRows_0_0']")).sendKeys("9:00");
		driver.findElement(By.xpath("//input[@id='initialRows_0_1']")).sendKeys("8:00");	
		driver.findElement(By.xpath("//input[@id='initialRows_0_1']")).clear();
		driver.findElement(By.xpath("//input[@id='initialRows_0_1']")).sendKeys("9:00");
		driver.findElement(By.xpath("//input[@id='initialRows_0_2']")).sendKeys("8:00");	
		driver.findElement(By.xpath("//input[@id='initialRows_0_2']")).clear();
		driver.findElement(By.xpath("//input[@id='initialRows_0_2']")).sendKeys("9:00");
		driver.findElement(By.xpath("//input[@id='initialRows_0_3']")).sendKeys("8:00");	
		driver.findElement(By.xpath("//input[@id='initialRows_0_3']")).clear();
		driver.findElement(By.xpath("//input[@id='initialRows_0_3']")).sendKeys("9:00");
		driver.findElement(By.xpath("//input[@id='initialRows_0_4']")).sendKeys("8:00");	
		driver.findElement(By.xpath("//input[@id='initialRows_0_4']")).clear();
		driver.findElement(By.xpath("//input[@id='initialRows_0_4']")).sendKeys("9:00");
		driver.findElement(By.xpath("//input[@id='initialRows_0_5']")).sendKeys("0:00");
		driver.findElement(By.xpath("//input[@id='initialRows_0_5']")).clear();
		driver.findElement(By.xpath("//input[@id='initialRows_0_5']")).sendKeys("9:00");
		driver.findElement(By.xpath("//input[@id='initialRows_0_6']")).sendKeys("0:00");	
		driver.findElement(By.xpath("//input[@id='initialRows_0_6']")).clear();
		driver.findElement(By.xpath("//input[@id='initialRows_0_6']")).sendKeys("9:00");
		driver.findElement(By.xpath("//input[@id='submitSave']")).click();	
		Thread.sleep(1000);	
		//driver.findElement(By.xpath("//input[@id='btnSubmit']")).click();	
		Thread.sleep(3000);	
		WebElement newstatus = driver.findElement(By.xpath("//*[@id=\"timesheet_status\"]/h2"));	
		System.out.println(newstatus.getText());
		
		
}
}

