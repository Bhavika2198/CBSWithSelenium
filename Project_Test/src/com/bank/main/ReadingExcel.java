package com.bank.main;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingExcel {

	public static void main(String[] args)  throws Exception{
		// TODO Auto-generated method stub
		
		File src=new File("E:\\Lectures_Link\\Lectures_Link.xlsx");
		FileInputStream fis =new FileInputStream(src);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sh=wb.getSheet("Java");
		System.out.println(sh.getSheetName());
		

	}

}
