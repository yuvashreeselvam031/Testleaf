package base;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelFromDataProvider extends BaseHooks {

	public static String[][] readData(String fileName) throws IOException {

		XSSFWorkbook wb = new XSSFWorkbook("./data/"+fileName+".xlsx");

		XSSFSheet sheet = wb.getSheet("Sheet1");
		int lastRowNum = sheet.getLastRowNum();
		short lastCellNum = sheet.getRow(0).getLastCellNum();
		String[][] data = new String[lastRowNum][lastCellNum];
		for (int i = 1; i <= lastRowNum; i++) {
			for (int j = 0; j < lastCellNum; j++) {
				String text = sheet.getRow(i).getCell(j).getStringCellValue();
				 System.out.println(text);
				data[i-1][j] = text;
			}

		}
		wb.close();
		return data;

	}

}
