package stepDefinition;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

import java.io.File;

public class hooks {

    /*
    Before and after
     */

    @After

    public void afterClass(Scenario scenario){

        if(scenario.isFailed()){

            TakesScreenshot ScreenShot = ((TakesScreenshot)Driver.getDriver());

            File srcFile = ScreenShot.getScreenshotAs( OutputType.FILE );

            String featureFileName = scenario.getId();

            System.out.println(featureFileName+"<------------");

            File destinationFile = new File("target/screenShots/"+featureFileName+".png");

            try {
                FileUtils.copyFile( srcFile, destinationFile );
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
        Driver.closeDriver();
    }
}
