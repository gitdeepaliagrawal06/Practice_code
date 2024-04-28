package DataDrivenFramework;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadAllDataFromExcel {

	public static void main(String[] args) throws Throwable, Throwable, IOException 
	{

		//Step1: Create the java Object of the Physical WorkBook
		FileInputStream fis=new FileInputStream("./testData/Test_Data.xlsx");
		
		//Step2: Open WorkBook in read mode
		Workbook wb=WorkbookFactory.create(fis);
		
		//Step3: Get the Control Of "Sheet1"
		Sheet sh=wb.getSheet("Sheet1");
		
		//Step4: Get the last used row count from "sheet1"
		 Row rw = sh.getRow(1);
		
	
		//Read data from 2nd Cell
		 String cel= rw.getCell(2).getStringCellValue();
		 System.out.println(cel);
		
		
		
		//for (int i=0;i<5;i++) 
		//{
       // String cellData = rw.getCell(i).getStringCellValue();
		//System.out.print(cellData+" ");
		}
}







