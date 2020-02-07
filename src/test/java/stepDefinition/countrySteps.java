package stepDefinition;

import PageObjectModel.*;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import utilities.Driver;
import utilities.ReadPropertiesFile;

import java.util.concurrent.TimeUnit;

public class countrySteps extends AbstractClass {

    WebDriver driver;
    signInPage sip = new signInPage();
    leftNav ln = new leftNav();
    countryPage cp = new countryPage();
    applicationPage ap= new applicationPage();

    @Given("^Go to mersys website$")
    public void go_to_mersys_website() throws Throwable {


        driver = Driver.getDriver();
        driver.manage().window().maximize();

        driver.get(ReadPropertiesFile.getData("URL"));

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @Given("^Type the username and password and click on login button$")
    public void type_the_username_and_password_and_click_on_login_button() throws Throwable {

        sip.typeIninputUserName();
        sip.typeIninputPassword();
        sip.clickOnbuttonLogin();
    }

    @Given("^Click on setup on top$")
    public void click_on_setup_on_top() throws Throwable {
        ln.clickOndropDownSetup();

    }

    @Given("^Click on parameter$")
    public void click_on_parameter() throws Throwable {
        ln.clickOndropdownParameters();

    }

    @Given("^Click on countries$")
    public void click_on_countries() throws Throwable {
        ln.clickOnbuttonCountries();

    }

    @Given("^Click on plus icon$")
    public void click_on_plus_icon() throws Throwable {
        ap.clickPlusButton();

    }

    @Given("^Type in the Name \"([^\"]*)\"$")
    public void type_in_the_Name(String name) throws Throwable {
        cp.typeCountryName(name);

    }

    @Given("^Type in the code \"([^\"]*)\"$")
    public void type_in_the_code(String code) throws Throwable {
        cp.typeCountryCode(code);
    }

    @Given("^Click on save button$")
    public void click_on_save_button() throws Throwable {
        ap.clickSaveButton();
    }

    @Then("^\"([^\"]*)\" should be displayed$")
    public void should_be_displayed(String arg1) throws Throwable {
        ap.nameIsCreated(arg1);

    }


}

