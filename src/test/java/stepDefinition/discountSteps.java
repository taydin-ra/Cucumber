package stepDefinition;

import PageObjectModel.discountPage;
import PageObjectModel.leftNav;
import cucumber.api.java.en.Given;

public class discountSteps {

    leftNav ln=new leftNav();
    discountPage dp=new discountPage();

    @Given("^Click on Discount$")
    public void click_on_Discount() throws Throwable {
       ln.clickOnDiscounts();

    }

    @Given("^Type in the Description \"([^\"]*)\"$")
    public void type_in_the_Description(String desname) throws Throwable {
        dp.typeInthedescription(desname);


    }

    @Given("^Type in the Integration Code \"([^\"]*)\"$")
    public void type_in_the_Integration_Code(String intcode) throws Throwable {
        dp.typeInIntegrationCode(intcode);

    }

    @Given("^Type in the Priority \"([^\"]*)\"$")
    public void type_in_the_Priority(String priority) throws Throwable {
        dp.typeIninputPriority(priority);

    }



}
