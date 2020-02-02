package stepDefinition;

import PageObjectModel.leftNav;
import cucumber.api.java.en.Given;

public class citySteps {

    leftNav lv=new leftNav();

    @Given("^Click on City$")
    public void click_on_City() throws Throwable {
        lv.clickoncities();

    }

    @Given("^Choose any value from the dropdown$")
    public void choose_any_value_from_the_dropdown() throws Throwable {

    }
}
