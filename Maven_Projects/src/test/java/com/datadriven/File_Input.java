package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.baseclass.Base_Class1;

public class File_Input extends Base_Class1 {
public static void main(String[] args) throws IOException {
		//allDataFromExcel("C:\\Users\\Admin\\eclipse-workspace\\Maven_Projects\\Excel\\Usernames.xlsx");
		particularDataFromExcel("C:\\Users\\Admin\\eclipse-workspace\\Maven_Projects\\Excel\\Usernames.xlsx", 2, 1);
	}
}



