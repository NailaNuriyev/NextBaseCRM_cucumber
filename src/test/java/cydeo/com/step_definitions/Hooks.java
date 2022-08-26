package cydeo.com.step_definitions;

import cydeo.com.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    @Before
    public void setUpScenario(){
        System.out.println("--> It is coming @Before in Hooks");

    }
    @After
    public void tearDownScenario(Scenario scenario){
        System.out.println("--> it's coming from @After in Hooks");

        if (scenario.isFailed()) {

            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }

        Driver.closeDriver();

    }
}
