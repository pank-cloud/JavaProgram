package Utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;

public class ExcelUtil {

	public static Object[][] getData(String sheetName) throws InvalidFormatException, IOException 
	{
//		Object arr[][] = new Object[3][2];
//		for (int i = 1; i < 3; i++) {
//			for (int j = 0; j < 2; j++) {
//				arr[i][j] = ExcelUtil.ExcelData(sheetName, i, j);
//			}
//		}
//		return new Object[][] {
//			{arr[1][0], arr[1][1]},
//			{arr[2][0], arr[2][1]},
//			};
		
		FileInputStream fs = new FileInputStream(
	            "F:\\Users\\Pankaj\\eclipse-workspace\\Project\\DataFile\\ExcelSheet.xlsx");
	    Workbook w1 = WorkbookFactory.create(fs);
	    Sheet sheet = w1.getSheet(sheetName);

	    int rowCount = sheet.getLastRowNum() + 1; // includes header (3)
	    int colCount = sheet.getRow(0).getLastCellNum();  // (2)

	    Object data[][] = new Object[rowCount - 1][colCount];

	    
	    for(int i = 1; i < rowCount; i++) { // start from row 1 to skip header
	        for (int j = 0; j < colCount; j++) {
	            data[i - 1][j] = ExcelData(sheetName, i, j);
	            //data[0][0] = ExcelData(Login, 1, 0);
	        }
	    }
	    return data;
	}

// i & j should start from 0 that's why we have written data[i-1][j]
// otherwise arr[0][0] and arr[0][1] are never initialized and remain null
// that's why earlier its not transferring the data to login page
			
	
	public static String ExcelData(String TabName, int rowVal, int cellVal) throws InvalidFormatException, IOException {
		FileInputStream fs = new FileInputStream(
				"F:\\Users\\Pankaj\\eclipse-workspace\\Project\\DataFile\\ExcelSheet.xlsx");
		Workbook w1 = WorkbookFactory.create(fs);
		
		Cell cell = w1.getSheet(TabName).getRow(rowVal).getCell(cellVal);
		String val = "";

		if (cell == null || cell.getCellType() == CellType.BLANK) {
			val = "";
		}

		else if (cell.getCellType() == CellType.STRING) {
			val = cell.getStringCellValue();
		}

		else if (cell.getCellType() == CellType.NUMERIC) 
		{
			val = NumberToTextConverter.toText(cell.getNumericCellValue());
		}

		return val;

	}

}
