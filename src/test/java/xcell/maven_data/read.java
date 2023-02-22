package xcell.maven_data;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
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

public class read {
	public static String read(int r,int c) throws IOException {
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
	static public void write_1(int r,int c,String value) throws IOException {
		String path=".\\src\\test\\java\\excel\\yuva.xlsx";
		File f = new File(path);
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheetAt = wb.getSheetAt(2);
		Row row = sheetAt.getRow(r);
		if(row==null) {
			row  = sheetAt.createRow(r);
			//System.out.println("created row ");

		}
		Cell cell = row.getCell(c);
		if(cell==null) {
			cell =row.createCell(c,CellType.STRING);


		}
		cell.setCellValue(value);
		FileOutputStream out = new FileOutputStream(f);
		wb.write(out);
		out.close();

	}
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", ".\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(read(0,0));
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys(read(0,1),Keys.ENTER);
		List<WebElement> findElements = driver.findElements(By.cssSelector("[class=\"a-section a-spacing-none a-spacing-top-small s-title-instructions-style\"]"));
		for (int i = 0; i < findElements.size(); i++) {
			write_1(i,0,findElements.get(i).getText());
		}
		List<WebElement> findElements2 = driver.findElements(By.cssSelector("[class=\"a-price\"]"));
		for (int i = 62; i <150 ; i++) {
			write_1(i,62,findElements2.get(i).getText());
		}
	}
}
