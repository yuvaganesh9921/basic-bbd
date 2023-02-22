package itratorparticularrowcell;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Itrator_cell_row {

	public static void main(String[] args) throws InvalidFormatException, IOException {
		// TODO Auto-generated method stub
		String path=".\\src\\test\\java\\excel\\yuva.xlsx";
		File fa = new File(path);
		FileInputStream fs = new FileInputStream(fa);
		Workbook wb = new XSSFWorkbook(fa);
		Sheet sheetAt = wb.getSheetAt(4);
		Iterator<Row> row = sheetAt.iterator();
		Row firstrow = row.next();
		//Row secondrow = row.next();
		Iterator<Cell> cell = firstrow.cellIterator();
		int y=0;
		int coloumn =0;
		while(cell.hasNext()) {
			Cell value = cell.next();
			if(value.getStringCellValue().equalsIgnoreCase("selenium")) {
				coloumn=y;
			}
			y++;
			
		}
		System.out.println(coloumn);
		
	}

}
