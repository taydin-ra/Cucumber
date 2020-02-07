package stepDefinition;

import PageObjectModel.AbstractClass;
import PageObjectModel.applicationPage;
import PageObjectModel.citizenshipPage;
import PageObjectModel.leftNav;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class citizenshipSteps extends AbstractClass {

    leftNav ln = new leftNav();


    citizenshipPage cp = new citizenshipPage();
    applicationPage ap=new applicationPage();

    @Given("^Click on citizenship$")
    public void click_on_citizenship() throws Throwable {
        ln.clickOnbuttonCitizenship();
    }

    @Given("^Type the citizenship name \"(.*?)\"$")
    public void type_the_citizenship_name(String name) throws Throwable {
        cp.typeInputCitizenName( name );
    }

    @Given("^Type the shortName \"(.*?)\"$")
    public void type_the_shortName(String shortName) throws Throwable {
        cp.typeInputCitizenShortName( shortName );
    }
    @Then("^Remove the data \"([^\"]*)\"$")
    public void remove_the_data(String name) throws Throwable {
     ap.deletingElement(name);
    }

    @Then("^Verify data is removed \"([^\"]*)\"$")
    public void verify_data_is_removed(String arg1) throws Throwable {
        ap.verifingDeleted(arg1);

    }





}