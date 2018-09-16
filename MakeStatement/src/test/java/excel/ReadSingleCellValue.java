package excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadSingleCellValue {
	public static void main(String[] args) throws IOException {
		//specify the excel file containing test data
	File src=new File("E:\\DataDrivenTest\\testdata.xlsx");
	//load the excel file
			FileInputStream fis=new FileInputStream(src);
			//load the workbook from the above excel file 
			XSSFWorkbook wb=new XSSFWorkbook(fis);
			//load the sheet from above excel workbook
			XSSFSheet sheet=wb.getSheetAt(0);
			int rowCount=sheet.getLastRowNum()+1;
			int colCount=sheet.getRow(0).getLastCellNum();
			System.out.println(rowCount);
			System.out.println(colCount);

			String[][] data = new String[rowCount][colCount];
			int j;
			for(int i=1; i<=rowCount; i++) {
				//Reading first column(getCell refer to Column)
				for(j=0; j<colCount; j++)
				data[i-1][j] =sheet.getRow(i-1).getCell(j).getStringCellValue();
			}
		
			for(int i=1; i<=rowCount; i++) {
				//Reading first column(getCell refer to Column)
				for(j=0; j<colCount; j++)
			System.out.print(data[i-1][j]);
			System.out.println();
	}//close the workbook		
			wb.close();
			}



	}

