package ExcelReaderBasics;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReader {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		String xlFile = "C:\\Selenium\\Sample HTML Pages\\TestData.xlsx";
		
		FileInputStream fis = new FileInputStream(xlFile);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Sheet1");
		
		// sheet contains rows and cells
		// Rows count 
		int rowscnt = sh.getLastRowNum();
		System.out.println("rowscnt="+rowscnt);//rowscnt=3
		
		// Get columns count
		int colscnt = sh.getRow(0).getLastCellNum();
		System.out.println("colscnt="+colscnt);//colscnt=3
		
		// Read data from row, cell -  0,0 
		String data00 = sh.getRow(0).getCell(0).toString();
		System.out.println("data00="+data00);//data00=Product Name
		
		// Read data from row, cell -  0,1
		String data01 = sh.getRow(0).getCell(1).toString();
		System.out.println("data01="+data01);//data01=Qty
		
		// HW Read data from 0,2
		String data02 = sh.getRow(0).getCell(2).toString();
		System.out.println("data02="+data02);//data02=Price
		
		// Read data from 1,0
		String data10 = sh.getRow(1).getCell(0).toString();
		System.out.println("data10="+data10);//data10=Lux
		
		// Read data from row, cell -  1,1
		String data11 = sh.getRow(1).getCell(1).toString();
		System.out.println("data11="+data11);//data11=2.0
		
		//Read data from 1,2
		String data12 = sh.getRow(1).getCell(2).toString();
		System.out.println("data12="+data12);//data12=100.0
		
		// HW read  all rowsdata - from first column?
		String datac00 = sh.getRow(0).getCell(0).toString();
		System.out.println("datac00="+datac00);
		
		
	}

}
