package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelUtility {

	public static FileInputStream fi;
	public static FileOutputStream fo;
	public static XSSFWorkbook wb;
	public static XSSFSheet ws;
	public static XSSFRow row;
	public static XSSFCell cell;
	
// below method used to count the total number of rows	
public static int getRowCount(String xlfile, String xlSheet) throws IOException 
{
	fi=new FileInputStream(xlfile);
	wb = new XSSFWorkbook(fi);
	ws = wb.getSheet(xlSheet);
	int rowCount =ws.getLastRowNum();
	wb.close();
	fi.close();
	return rowCount;
	
}
	
public static int getCellCount (String xlfile, String xlSheet, int rownum) throws IOException 
{
	fi=new FileInputStream(xlfile);
	wb = new XSSFWorkbook(fi);
	ws = wb.getSheet(xlSheet);
	row = ws.getRow(rownum);
	int cellcount = row.getLastCellNum();
	wb.close();
	fi.close();
	return cellcount;
}

/*
public static String getCellData (String xlfile, String xlSheet, int rownum, int column) throws IOException 
{
	fi=new FileInputStream(xlfile);
	wb = new XSSFWorkbook(fi);
	ws = wb.getSheet(xlSheet);
	row = ws.getRow(rownum);
	

}
*/
	
}
