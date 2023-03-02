package com.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonBase {
	
public static WebDriver driver;
	
	public static Robot r;
	
	public static Actions a;

	public static void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		 driver =new ChromeDriver();
	}
	 public static void edgeLaunch() { WebDriverManager.edgedriver().setup();
	  driver= new EdgeDriver();}
	  
	  public static void firefoxLaunch() {
	  WebDriverManager.firefoxdriver().setup(); driver = new FirefoxDriver();}
	 
	public static void launchUrl(String url) {
		driver.get(url);
	}
	public static void maximize() {
		driver.manage().window().maximize();
	}
	public static void currentUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
	}
    public static void gettitle() {
		String title = driver.getTitle();
		System.out.println(title);
	
	    }
    public static void fill(WebElement element, String text) {
		element.sendKeys(text);
	}
    public static void close() {
		driver.quit();
	}
  public static void dateandtime() {
	java.util.Date d= new java.util.Date();
	System.out.println(d);
}
    public static void click(WebElement name) {
		name.click();
	}
    public static void sleep(long millis) throws InterruptedException {
		Thread.sleep(millis);
	}
    public static String data(int Row, int Cell) throws IOException {
		File f=new File("C:\\Users\\yuvaraj\\eclipse-workspace\\AmazonTrial\\Test Data\\LogIn Credentials.xlsx");
		FileInputStream fis= new FileInputStream(f);
		Workbook w=new XSSFWorkbook(fis);
		Sheet sh = w.getSheet("Sheet1");
		Row r = sh.getRow(Row);
		Cell c = r.getCell(Cell);
		String value = c.getStringCellValue();
		return value;
	    
    }
    
    
    public static void screenShot(String path) throws IOException {
		TakesScreenshot ts=(TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File f=new File(path);
		FileUtils.copyFile(source, f);
		
	}
    
    public static void keyDown(int down) throws AWTException {
		r = new Robot();
		for (int i = 0; i<down; i++) {

			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
						
		}
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

	}
    public static void wait(int duration) {
	   driver.manage().timeouts().implicitlyWait(duration,TimeUnit.SECONDS);

}
    public static void window(int value) {
    	
    	String parId = driver.getWindowHandle();
    	Set<String> allWindow = driver.getWindowHandles();
    	List<String> all = new ArrayList<String>();
    	all.addAll(allWindow);
    	driver.switchTo().window(all.get(value));
    	}
    public static void move(WebElement ele) {
		a = new Actions(driver);
		a.moveToElement(ele);
	}
    public static void scrollDown(WebElement ele) {
		JavascriptExecutor je= (JavascriptExecutor) driver;
		je.executeScript("arguments[0].scrollIntoView(false)", ele);

	}

}
