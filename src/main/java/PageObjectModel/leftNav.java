package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class leftNav extends AbstractClass {
    WebDriver driver;

    public leftNav() {
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);


    }

    @FindBy(xpath ="(//span[contains(text(),'Setup')])[1]")
    private WebElement dropdownSetup;

    @FindBy(xpath ="(//span[contains(text(),'Parameters')])[1]")
    private WebElement dropdownParameters;

    @FindBy(xpath ="//span[text()='Countries']")
    private WebElement buttonCountries;

    @FindBy(xpath ="//span[contains(text(),'Citizenships')]")
    private WebElement buttonCitizenship;

    @FindBy (xpath = "//span[text()='Subject Categories']")
    private WebElement buttonSubjectCategories;

    @FindBy(xpath="//span[contains(text(),'Nationalities')]")
    private WebElement buttonNatioanlity;

    @FindBy (xpath = "//span[contains(text(), 'Cities')]")
    private WebElement buttonCities;
    @FindBy(xpath="//span[text()='Discounts']")

    private WebElement discounts;




    public void clickOnDiscounts(){
        clickFunction(discounts);

    }

    public void clickOndropDownSetup() {
        dropdownSetup.click();
    }

    public void clickOndropdownParameters() {
       clickFunction(dropdownParameters);
    }

    public void clickOnbuttonCountries() {
       clickFunction(buttonCountries);
    }
    public void clickOnbuttonCitizenship() {
        clickFunction(buttonCitizenship);
    }

    public void clickSubjectCategories(){
        clickFunction(buttonSubjectCategories);
    }

    public void clickOnbuttonNatioanlity(){
        clickFunction( buttonNatioanlity );
    }

    public void clickoncities(){
        clickFunction(buttonCities);
    }
    }


