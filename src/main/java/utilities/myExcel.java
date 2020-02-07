package utilities;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class myExcel {
    /*
    how to read data in the excel
    Use it in the application
    Write in the excel
     */

    /*
    Advantage:
    1)Able to get all the data from excel so it is easy maintain
     */

    public static void main(String[] args) throws IOException {
        String path = "src/test/java/excelFiles/releaseNotes.xlsx";

        // if your utilities in the src test java folder
        //  String path2="excelFiles/releaseNotes.xlsx";

        FileInputStream inStream=new FileInputStream(path);

        Workbook workbook= WorkbookFactory.create(inStream);

        Sheet sheet=workbook.getSheet("Sheet1");

        Row  row= sheet.getRow(0);

        Cell cell= row.getCell(0);

        System.out.println(cell);

    }

    /*

          How do u get data from excel sheet?
          I am using apache poi to get data from excel.

     */
}
