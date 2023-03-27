package ExcelReaderBasics;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReader2 {
	
	public static int getRowsCnt(String xlFile,String sheet) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(xlFile);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Sheet1");
		int rowscnt = sh.getLastRowNum();
		System.out.println("rowscnt="+rowscnt);
		
		return rowscnt;
	}
	
	public static int getColumnssCnt(String xlFile,String sheet) throws EncryptedDocumentException, IOException
	{
		FileInputStream  fis  =  new FileInputStream(xlFile);
		Workbook  wb =  WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Sheet1");
		int columnscnt = sh.getRow(0).getLastCellNum();
		System.out.println("columnscnt="+columnscnt);
		
		return columnscnt;
		
	}
	
	public static String readDataFromExcel(String xlFile,String sheet, int rowno, int cellNo) throws EncryptedDocumentException, IOException
	{
		FileInputStream  fis  =  new FileInputStream(xlFile);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Sheet1");
		String data = sh.getRow(rowno).getCell(cellNo).toString();

		return data;
	}
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		String xlFile = "C:\\Selenium\\Sample HTML Pages\\TestData.xlsx";
		
		int rowscnt = getRowsCnt(xlFile,"Sheet1");
		System.out.println("rowscnt="+rowscnt);

		rowscnt = getRowsCnt(xlFile,"CreateUsers");
		System.out.println("rowscnt="+rowscnt);
		
		
	}
	

}
