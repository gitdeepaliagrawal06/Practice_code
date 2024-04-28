package DataDrivenFramework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcel {

	public static void main(String[] args) throws Throwable 
	{
	//Step1: Create the java Object of the Physical WorkBook
	FileInputStream fis=new FileInputStream("./testData/Test_Data.xlsx");	
	//Open WorkBook in read mode
	Workbook wb=WorkbookFactory.create(fis);
	//Get the Control Of "Sheet1"
	Sheet sh=wb.getSheet("Sheet1");
	//Get the control of 1st Row index
	Row row1=sh.getRow(1);
	//Read data from 2nd cell from 1st row
	Cell cel=row1.getCell(2);
	
	String BankName=cel.getStringCellValue();
	System.out.println(BankName);
		

	}

}
