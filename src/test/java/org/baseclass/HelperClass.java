package org.baseclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HelperClass {

	public static WebDriver driver;

	public static void launchChromeBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	public static void launchEdgeBrowser() {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();

	}

	public static void maxi() {
		driver.manage().window().maximize();

	}

	public static void getUrl(String url) {
		driver.get(url);
	}

	public static void btnClick(WebElement element) {
		element.click();

	}

	public static void fillText(WebElement element, String value) {
		element.sendKeys(value);
	}

	public static void ScreenShot(String name) throws IOException  {
		TakesScreenshot t=(TakesScreenshot)driver;
		File a = t.getScreenshotAs(OutputType.FILE);
		File b= new File("\"C:\\\\Users\\\\zubee\\\\ClassWorkSpace\" + \"\\\\Morning9AmMaven\\\\ScreenShot\" + name + \".png\"");
		FileUtils.copyFile(a, b);
		
//		TakesScreenshot t = (TakesScreenshot) driver;
//		File src = t.getScreenshotAs(OutputType.FILE);
//		File des = new File("C:\\Users\\zubee\\ClassWorkSpace" + "\\Morning9AmMaven\\ScreenShot" + name + ".png");
//		FileUtils.copyFile(src, des);
	}

	public static String readFromExcel(String sheetName, int rowNo, int cellNo) throws IOException {
		File f = new File("C:\\Users\\zubee\\ClassWorkSpace\\Morning9AmMaven\\ExternalFile\\ExcelWorkBook.xlsx");
		FileInputStream fin = new FileInputStream(f);
		Workbook book = new XSSFWorkbook(fin);
		Sheet s = book.getSheet(sheetName);
		Row r = s.getRow(rowNo);
		Cell c = r.getCell(cellNo);
				
		int type = c.getCellType();
		String name="";
		if (type == 1) {
			 name = c.getStringCellValue();

		} else if (DateUtil.isCellDateFormatted(c)) {
			Date da = c.getDateCellValue();
			SimpleDateFormat sim = new SimpleDateFormat("dd-MM ,yyyy");
			 name = sim.format(da);
		}else {
			double d = c.getNumericCellValue();
			long l=(long)d;
			name = String.valueOf(l);
		}
      return name;
	}
	
	public static void printtitle() {
		String title = driver.getTitle();
		System.out.println(title);
	}
	public static void printurl() {
		String curl = driver.getCurrentUrl();
		System.out.println(curl);
	}
	
	public static void fill(WebElement loc,String name) {
	loc.sendKeys(name);
	}
	
	public static void btnclick(WebElement loc) {
	loc.click();
	}
	
	public static void rightclck(WebElement loc) {
		Actions a= new Actions(driver);
		a.contextClick(loc).perform();

	}
	
	public static void closeBroswer() {
		driver.quit();

	}
	public static void dates() {
		Date a= new Date();
		System.out.println(a);

	}
	
	public static  void implictWait() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
}
