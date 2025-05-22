package readWriteDataFromexcel;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class writeDynamicData {

	public static void main(String[] args) throws IOException {
		//Create a file
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir") + "\\testdata\\WriteDynamicTestdata01.xlsx");
		
		//Create a workbook
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("DynamicData");
		Scanner sc = new Scanner(System.in);
		
		//Enter the no of row and column want to create
		
		System.out.println("Enter the number of row: ");
		int numOfrow = sc.nextInt(); 
		
		System.out.println("Enter the number of columns: ");
		int numOfcol = sc.nextInt(); 
		
		for(int r=0; r <= numOfrow; r++) 
		{
			XSSFRow currentrow = sheet.createRow(r);
			for (int c =0; c < numOfcol; c++)
			{
			XSSFCell cureentcell = currentrow.createCell(c);
			cureentcell.setCellValue(sc.next());
			}
		}
		
		workbook.write(file);
		System.out.println("File created successfully....!");
		workbook.close();
		file.close();
	}

}
