package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class citizenshipPage extends AbstractClass {


    WebDriver driver;

    public citizenshipPage() {
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);


    }

    @FindBy(xpath = "//ms-dialog-content//ms-text-field[@placeholder='GENERAL.FIELD.NAME']//input")
    private WebElement inputcitizenName;

    @FindBy(xpath = "//ms-dialog-content//ms-text-field[@placeholder='GENERAL.FIELD.SHORTNAME']//input")
    private WebElement getInputCitizenShortName;

    @FindBy(xpath = "//table//tbody//tr//td[2]")
    private WebElement nameList;

    public void typeInputCitizenName(String citizenName) {
        sendkeysFunction(inputcitizenName, citizenName);
    }

    public void typeInputCitizenShortName(String shortName) {
        sendkeysFunction(getInputCitizenShortName, shortName);
    }
}
