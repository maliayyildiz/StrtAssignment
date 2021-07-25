package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.DriverMobile;

public class Hooks {
    //        @Before
//    public void setUp(){
//    }


    @After()
    public void tearDown(Scenario scenario){
        final byte[] screenshot=((TakesScreenshot) DriverMobile.getAppiumDriver()).getScreenshotAs(OutputType.BYTES);
        if (scenario.isFailed()) {
            scenario.attach(screenshot, "image/png","screenshots");
        }
        DriverMobile.quitAppiumDriver();
    }
}
