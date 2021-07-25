package pages;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import utilities.DriverMobile;

import java.time.Duration;

public class DescribePackagePage {
    public DescribePackagePage(){
        PageFactory.initElements(new AppiumFieldDecorator(DriverMobile.getAppiumDriver(), Duration.ofSeconds(30)),this);
    }
    @AndroidFindBy(id = "com.stuart.client.beta:id/package_details_continue_button")
    public AndroidElement continueButton;
    @AndroidFindBy(id = "com.stuart.client.beta:id/package_details_id")
    public AndroidElement orderIdBox;
    @AndroidFindBy(id = "com.stuart.client.beta:id/package_details_comment")
    public AndroidElement commentButton;


}
