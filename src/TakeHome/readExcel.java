package TakeHome;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class readExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		String path = "Data\\myExcel.xlsx";

		doesFileExits(path);
	}

	public static void doesFileExits(String path) throws EncryptedDocumentException, IOException {
		File f = new File(path);
		try {
			FileInputStream fo = new FileInputStream(f);
			Workbook wb = WorkbookFactory.create(fo);
			Sheet ws = wb.getSheetAt(0);
			Row r = ws.getRow(0);
			Cell c = r.getCell(1);
			
			for (int i = 0; i < 3; i++) {
				System.out.println(ws.getRow(i).getCell(0));
			}
			for (int i = 0; i < 3; i++) {
				System.out.println(ws.getRow(i).getCell(1));
			}
			wb.close();
			fo.close();
			
			System.out.println("File exist");
		} catch (FileNotFoundException e) {
			System.out.println("File does not exist");
		}


	}
}
