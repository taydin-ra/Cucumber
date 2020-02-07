package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class cityPage extends AbstractClass{
    WebDriver driver;

    public cityPage() {
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);


    }

    @FindBy(xpath="//mat-dialog-container//mat-select//span")
    private WebElement frameDropdown;

    @FindAll({
            @FindBy(xpath="//span[@class='mat-option-text']")
    }  )
    private List<WebElement> listOfcity;

    public void handlingDropdown(){

            handleDropdown( frameDropdown , listOfcity );
        }
    }

