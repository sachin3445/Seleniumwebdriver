package readWriteDataFromexcel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readData {

	public static void main(String[] args) throws IOException {
		//get the excel file from location
		
		FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "\\testdata\\Testdata01.xlsx");
		
		//open the excel workbook
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
		//open excel sheet
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		
		// get the total number of rows from sheet
		int totalRows = sheet.getLastRowNum();
		int totalcols = sheet.getRow(1).getLastCellNum();
		
		//print  total rows and columns
		System.out.println("Total number of Rows: "+totalRows);
		System.out.println("Total number of Columns: "+totalcols);
		
		//Read data from each row & cells
		
		for(int r=0; r<=totalRows; r++)
		{
			XSSFRow currentrow = sheet.getRow(r);
			
			for( int c=0; c<totalcols; c++) 
			{
				XSSFCell currentcol = currentrow.getCell(c);
				System.out.print(currentcol.toString()+ "\t");
			}
			System.out.println();
		}
		
		workbook.close();
		file.close();
	}

}
