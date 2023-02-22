package xcell.maven_data;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class data {
public static void main(String[] args) throws IOException {
	String path=".\\src\\test\\java\\excel\\yuva.xlsx";
	File f = new File(path);
	FileInputStream fa = new FileInputStream(f);
	Workbook wb = new XSSFWorkbook(fa);
	int y = wb.getNumberOfSheets();
	System.out.println(y);
	Sheet sheetAt = wb.getSheetAt(0);
	
	
	
	int physicalNumberOfRows = sheetAt.getPhysicalNumberOfRows();
	for (int i = 0; i <physicalNumberOfRows; i++) {
		Row row = sheetAt.getRow(i);
		Cell cell2 = row.getCell(2);
		DataFormatter data = new DataFormatter();
		String formatCellValue = data.formatCellValue(cell2);
		System.out.println(formatCellValue);
		
//	for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
//		Cell cell = row.getCell(j);
//		DataFormatter data = new DataFormatter();
//		String formatCellValue = data.formatCellValue(cell);
//		System.out.println(formatCellValue);
//	}
//	
	
	}
	
}
}
