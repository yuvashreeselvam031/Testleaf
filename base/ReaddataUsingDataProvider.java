package base;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReaddataUsingDataProvider {
	
	
	public String[][] toReadData(String excelFileName) throws IOException  {

		XSSFWorkbook wb = new XSSFWorkbook("./data/"+excelFileName+".xlsx");
		 XSSFSheet sheet = wb.getSheet("Sheet2");
		// String data = sheet.getRow(1).getCell(1).getStringCellValue();
		// System.out.println();
		 int rowCount = sheet.getLastRowNum();
		// System.out.println("rowcount "+rowCount );
		 short  cellCount = sheet.getRow(0).getLastCellNum();
		// System.out.println("cellCount "+cellCount );
		 String[][] data = new String[rowCount][cellCount];

		 for (int i = 1; i <= rowCount; i++) {
			 for (int j = 0; j < cellCount ; j++) {
				 String text = sheet.getRow(i).getCell(j).getStringCellValue();
			//	 System.out.println(data2);
				data[i-1][j] = text; 
			}
			  

			 
		}
		 return data;
		
	}



}
