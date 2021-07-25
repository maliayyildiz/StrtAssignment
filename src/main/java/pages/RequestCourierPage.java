package pages;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.DriverMobile;

import java.time.Duration;
import java.util.List;

public class RequestCourierPage {
    public RequestCourierPage(){
        PageFactory.initElements(new AppiumFieldDecorator(DriverMobile.getAppiumDriver(), Duration.ofSeconds(30)),this);
    }
    @AndroidFindBy(xpath = "//android.widget.Button[@text='Add pickup address']")
    public AndroidElement addPickupAddressButton;
    @AndroidFindBy(xpath = "//android.widget.Button[@text='Add dropoff address']")
    public AndroidElement addDropOffAddressButton;
    @AndroidFindBy(id = "com.android.permissioncontroller:id/permission_allow_foreground_only_button")
    public List<AndroidElement> allowDeviceLocation;
    @AndroidFindBy(id = "com.stuart.client.beta:id/address_card_scheduled_at")
    public AndroidElement scheduleDeliveryOptionsBox;
    @FindBy(id = "com.stuart.client.beta:id/request_add_extra_drop_off")
    public List<WebElement> addAnotherDropOffButton;
    @AndroidFindBy(id = "com.stuart.client.beta:id/request_continue_vehicle_select_button")
    public AndroidElement continueButton;


}
