package pages;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import utilities.DriverMobile;

import java.time.Duration;

public class HomePage {
    public HomePage(){
        PageFactory.initElements(new AppiumFieldDecorator(DriverMobile.getAppiumDriver(), Duration.ofSeconds(30)),this);
    }
    @AndroidFindBy(id = "com.stuart.client.beta:id/splash_login")
    public AndroidElement loginButton;

    @AndroidFindBy(id = "com.stuart.client.beta:id/splash_register")
    public AndroidElement createAccountButton;
}
