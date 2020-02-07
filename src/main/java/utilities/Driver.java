package utilities;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {

    /*
    Why we need to use one driver(singLeton pattern)

    Because we are using page object model and we need to switch between the pages without singleTon pattern it will throw null pointer exception
     */
    private static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null) {
          //  System.setProperty("webdriver.chrome.driver", "/Users/yavuzaydin/Documents/Libraries/drivers/chromedriver");
            ChromeDriverManager.chromedriver().setup();
            driver = new ChromeDriver(  );

        }
        return driver;
    }


        public static void closeDriver(){
            if(driver!=null){
                driver.quit();
                driver=null;
            }

    }
}
