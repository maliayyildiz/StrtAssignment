package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import utilities.DriverMobile;

import java.time.Duration;

public class AddressPage {
    public AddressPage(){
        PageFactory.initElements(new AppiumFieldDecorator(DriverMobile.getAppiumDriver(), Duration.ofSeconds(30)),this);
    }
    @AndroidFindBy(xpath = "(//android.widget.TextView)[2]")
    public AndroidElement savedPickupAddress;
    @AndroidFindBy(xpath = "(//android.widget.TextView)[10]")
    public AndroidElement savedDropOffAddress;
    @AndroidFindBy(xpath = "(//android.widget.TextView)[12]")
    public AndroidElement savedDropOffAddress2;
    @AndroidFindBy(id = "com.stuart.client.beta:id/contact_edit_address_second_line")
    public AndroidElement selectedPickupAddress;
    @AndroidFindBy(id = "com.stuart.client.beta:id/contact_edit_continue_button")
    public AndroidElement continueButton;

}
