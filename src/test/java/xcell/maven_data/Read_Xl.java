package xcell.maven_data;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Read_Xl {
	static public String read_xl(int r,int c) throws IOException {
		String path=".\\src\\test\\java\\excel\\yuva.xlsx";
		File fa = new File(path);
		FileInputStream fs = new FileInputStream(fa);
		Workbook wb = new XSSFWorkbook(fs);
		Sheet sheetAt = wb.getSheetAt(1);
		Row row = sheetAt.getRow(r);
		Cell cell = row.getCell(c);
		DataFormatter data = new DataFormatter();
		String formatCellValue = data.formatCellValue(cell);
		System.out.println(formatCellValue);
		return formatCellValue;
		
		
	}
	
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", ".\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(read_xl(0,0));
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys(read_xl(0,1),Keys.ENTER);
	}

}
