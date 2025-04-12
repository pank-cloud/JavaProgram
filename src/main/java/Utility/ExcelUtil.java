package Utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;

public class ExcelUtil {

	public static String ExcelData() throws InvalidFormatException, IOException
	{
		FileInputStream fs = new FileInputStream("F:\\Users\\Pankaj\\eclipse-workspace\\Project\\DataFile\\ExcelSheet.xlsx");
		Workbook w1 = WorkbookFactory.create(fs);
//		String search = w1.getSheet("Search").getRow(1).getCell(0).getStringCellValue();
//		//return search;
		
		String searchInv = NumberToTextConverter.toText(w1.getSheet("Search").getRow(2).getCell(0).getNumericCellValue());		
		return searchInv;
		
	}
	
	
	
}
