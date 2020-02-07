package utilities;

import java.io.FileInputStream;

public class readExcel {
    public String getData(String pathOfTheExcel) {

        String path = ReadPropertiesFile.getData(pathOfTheExcel);

        FileInputStream inStream = null;

        try {
            inStream = new FileInputStream(path);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


        return path;
    }

}
