package util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.*;

public class XLS_Reader {
	static File file;
	static FileInputStream fs;
	static XSSFWorkbook wb;
	static XSSFRow row;
	static XSSFSheet sheet;
	static XSSFCell cell;
	DataFormatter dataFormatter = new DataFormatter();
	
	XLS_Reader(String path) throws IOException {
		file = new File(path);
		fs = new FileInputStream(file);
		wb = new XSSFWorkbook(fs);
	}
	public void readExcel(int sheetNum, int rowNum, int cellNum) throws IOException {
		sheet = wb.getSheetAt(sheetNum);
		row = sheet.getRow(rowNum);
		cell = row.getCell(cellNum);

		System.out.print(dataFormatter.formatCellValue(cell));
	}
	
	public static void main(String[] args) throws IOException {
		XLS_Reader read = new XLS_Reader("C:\\Users\\ivigi\\Documents\\testbench_eclipse\\testng_maven_selenium\\src\\test\\java\\testdata/xltest1.xlsx");
		read.readExcel(0, 0, 0);
		System.out.print("\t");
		read.readExcel(0, 0, 1);
		System.out.println();
		read.readExcel(0, 1, 0);
		System.out.print("\t");
		read.readExcel(0, 1, 1);
	}
}
