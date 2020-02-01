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
            ChromeDriverManager.chromedriver().setup();
            driver = new ChromeDriver(  );

        }
        return driver;
    }
}
