package TakeHome;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class writeAFile {

	public static void main(String[] args) throws IOException {
		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet ws = wb.createSheet("Data");

		Row r = ws.createRow(0);
		Cell c = r.createCell(0);
		c.setCellValue("Apple");
		Cell c1 = r.createCell(1);
		c1.setCellValue("table");
		Cell c2 = r.createCell(2);
		c2.setCellValue("Orange");

		Row r1 = ws.createRow(1);
		Cell d = r1.createCell(0);
		d.setCellValue("a fruit");
		Cell d1 = r1.createCell(1);
		d1.setCellValue("an object");
		Cell d2 = r1.createCell(2);
		d2.setCellValue("a fruit");
		
		Row r2 = ws.createRow(2);
		Cell e = r2.createCell(0);
		e.setCellValue("a tech firm");
		Cell e1 = r2.createCell(1);
		e1.setCellValue("contains rows and columns when used in context of computers");
		Cell e2 = r2.createCell(2);
		e2.setCellValue("a fruit");

		File f = new File("Data\\myExcel.xlsx");
		FileOutputStream fo = new FileOutputStream(f);
		wb.write(fo);
		wb.close();
		fo.close();

	}

}
