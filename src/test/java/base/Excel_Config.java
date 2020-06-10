package base;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Config {
	XSSFWorkbook wb;
	XSSFSheet sb;

	public Excel_Config(String excelPath) {
		try {
			File src = new File(excelPath);
			FileInputStream fis = new FileInputStream(src);
			wb = new XSSFWorkbook(fis);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String getData(int row, int column) {
		sb = wb.getSheetAt(0);
		String data = sb.getRow(row).getCell(column).getStringCellValue();
		return data;
	}
}
