package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class signInPage extends AbstractClass {

    /*
    Advantage of Page Factory
     */
    WebDriver driver;

    public signInPage() {
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);

    }

// find by is working as driver.findElement

    @FindBy(css = "[formcontrolname=\"username\"]")

    private WebElement inputUserName;

    @FindBy(css = "[formcontrolname=\"password\"]")

    private WebElement inputPassword;

    @FindBy(css = "button[aria-label=\"LOGIN\"]")

    private WebElement buttonLogin;

    public void typeIninputUserName() {
        sendKeysFunction(inputUserName,"nigeria_tenant_admin");


    }

    public void typeIninputPassword() {
        sendKeysFunction(inputPassword,"TnvLOl54WxR75vylop2A");

    }

    public void clickOnbuttonLogin() {
        clickFunction(buttonLogin);
    }
}
