package com.flipkart.genericlib;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.openxml4j.exceptions.OpenXML4JException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileUtils 
{
	String PropertyPath ="C:\\Users\\Agrawal\\eclipse-workspace\\FlipkartGenericProject\\TestData\\UniversalData.properties";
	String ExcelPath ="C:\\Users\\Agrawal\\eclipse-workspace\\FlipkartGenericProject\\TestData\\FlipkartBook1.xlsx";
    public <Workbook> Properties getProperties() throws IOException
    {
    	FileInputStream fis = new FileInputStream(PropertyPath);
		Properties pobj =new Properties();
		pobj.load(fis);
	    return pobj;
    }
	    
    public String getExcelData(String sheetName, int rowNum, int cellNum ) throws Throwable
    {
    	FileInputStream fis=new FileInputStream(ExcelPath);
    	Workbook wb=WorkbookFactory.create(fis);
    	Sheet sh=wb.getSheet(sheetName);
    	Row rh=sh.getRow(rowNum);
    	Cell ch=rh.getCell(cellNum);
    	String data=ch.getStringCellValue();
    	wb.close();
    	return data;
    }	
	    public void putExcelData(String sheetName , int rowNum1 , int cellNum1 , String data1) throws RuntimeException, OpenXML4JException, IOException
	    {
	 	  FileInputStream fis1=new FileInputStream(ExcelPath);
	 	  
	    
	    
	    
//	    public String getExcelData(String sheetName,int rowNum,int cellNum) throws RuntimeException, OpenXML4JException, IOException
//	    {
//	 	   FileInputStream fis = new FileInputStream(ExcelPath);
//	 	   Workbook wb = WorkbookFactory.create(fis);
//	 	   Sheet sh=wb.getSheet(sheetName);
//	 	   Row rh=sh.getRow(rowNum);
//	 	   Cell ch =rh.getCell(cellNum);
//	 	   String data = ch.getStringCellValue();
//	 	   wb.close();
//	 	   return data;
//	 }
//	    public void putExcelData(String sheetName1,int rowNum1,int cellNum1,String data1) throws RuntimeException, OpenXML4JException, IOException
//	    {
//	 	   FileInputStream fis = new FileInputStream(ExcelPath);
//	 	   Workbook wb = WorkbookFactory.create(fis);
//	 	   Sheet sh=wb.getSheet(sheetName1);
//	 	   Row rh=sh.getRow(rowNum1);
//	 	   Cell ch =rh.createCell(cellNum1);
//	 	   ch.setCellValue(data1);
//	 	   FileOutputStream fio = new FileOutputStream(ExcelPath);
//	 	   wb.write(fio);
//	 	   wb.close();   
//	   		  
//	    
	    
	    
    }
    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	
    	
    }
	

