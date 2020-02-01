package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Driver;

public abstract class AbstractClass {

    /*

    abstract class create
    pass the parameters
    use it in the step definitions
    configuration reader
     */

    /*
     abstract class create

     clickFunction
         click on element
     */

    private WebDriver driver = Driver.getDriver();

    WebDriverWait wait = new WebDriverWait(driver, 20);

    public void clickFunction(WebElement clickElement) {

        wait.until(ExpectedConditions.elementToBeClickable(clickElement));

        clickElement.click();

    }

    public void sendKeysFunction(WebElement sendKeysElement, String value){
        wait.until(ExpectedConditions.visibilityOf(sendKeysElement));

        sendKeysElement.sendKeys(value);
    }
}
