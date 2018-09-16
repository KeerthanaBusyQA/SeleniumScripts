package DDT;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
 
public class ExcelToDataProvider {
     
    String xlFilePath = "E:\\DataDrivenTest\\testdata.xlsx";
    String sheetName = "Credentials";
     
    @Test(dataProvider = "userData")
    public void fillUserForm(String userName, String passWord)
    {
       System.out.println("UserName: "+ userName);
       System.out.println("PassWord: "+ passWord);
    }
     
     
    @DataProvider(name="userData")
    public Object[][] userFormData() throws Exception
    {
        Object[][] data = {{"Tester@987","Tester@987"},{"Tester@987","Tester@987"}};
        return data;
    }
     
    public Object[][] testData(String xlFilePath, String sheetName) throws Exception
    {
        Object[][] excelData = null;
        FileInputStream fis = new FileInputStream(xlFilePath);
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        XSSFSheet sheet = workbook.getSheet(sheetName);
        XSSFRow row = sheet.getRow(0);
        int columns = row.getLastCellNum();
        System.out.println("Total Number of Columns in the excel is : "+columns);
        int rows = sheet.getLastRowNum()+1;
        System.out.println("Total Number of Rows in the excel is : "+rows);
       
                 
        excelData = new Object[rows-1][columns];
         
        for(int i=1; i<rows; i++)
        {
            for(int j=0; j<columns; j++)
            {
                excelData[i-1][j] = sheet.getRow(i).getCell(j).getStringCellValue();

            }
             
        }
        return excelData;
    }
}