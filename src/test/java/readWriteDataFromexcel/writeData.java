package readWriteDataFromexcel;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class writeData {

	public static void main(String[] args) throws IOException {
		
		//Create a file in folder
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir") + "\\testdata\\WriteTestdata01.xlsx");
		
		//Create a new workbook
		XSSFWorkbook workbook = new XSSFWorkbook();
		
		//create a sheet in workbook
		XSSFSheet sheet = workbook.createSheet("Mysheet1");	
		
		
		//Create a row and cells in sheet and assign values
		XSSFRow row1 = sheet.createRow(0);
		row1.createCell(0).setCellValue("Java");
		row1.createCell(1).setCellValue(2);
		row1.createCell(2).setCellValue("Automation");
		
		XSSFRow row2 = sheet.createRow(1);
		row2.createCell(0).setCellValue("Paython");
		row2.createCell(1).setCellValue(1);
		row2.createCell(2).setCellValue("Automation");
		
		XSSFRow row3 = sheet.createRow(2);
		row3.createCell(0).setCellValue(".net");
		row3.createCell(1).setCellValue(1);
		row3.createCell(2).setCellValue("Automation");
		
		// create a workbook in  file
		workbook.write(file);
		System.out.println("File created successfuly...!");
		workbook.close();
		file.close();
		
	}

}
