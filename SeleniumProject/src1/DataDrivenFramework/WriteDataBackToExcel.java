package DataDrivenFramework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteDataBackToExcel {
	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		
		//Step1: Create the java Object of the Physical WorkBook
		FileInputStream fis=new FileInputStream("./testData/Test_Data.xlsx");
		
		//Open WorkBook in read mode
		Workbook wb=WorkbookFactory.create(fis);
		
		//Get the Control Of "Sheet1"
		Sheet sh=wb.getSheet("Sheet1");
		
		//Get the control of 1st Row index	
		Row row1=sh.getRow(1);
		
		//Row row1=sh.getRow(1);
		Cell cel=row1.createCell(5);//Remove old data and create new cell
		cel.setCellValue("Pass");//Place the new data in 3rd cell
		
		//Create the java object of the Physical Workbook in write mode
		FileOutputStream fos=new FileOutputStream("./testData/Test_Data.xlsx");
		wb.write(fos);
		wb.close();
		
		
		
		
		
		
		
		
		
		
	}

}
