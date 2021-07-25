package pages;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.cucumber.java.en.And;
import org.openqa.selenium.support.PageFactory;
import utilities.DriverMobile;

import java.time.Duration;
import java.util.List;

public class SchedulePage {
    public SchedulePage(){PageFactory.initElements(new AppiumFieldDecorator(DriverMobile.getAppiumDriver(), Duration.ofSeconds(30)),this);}

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Today']")
    public AndroidElement defaultSelectedToday;
    @AndroidFindBy(id = "com.stuart.client.beta:id/calendar_day_name_unselected")
    public List<AndroidElement> otherDaysList;
    @AndroidFindBy(id = "android:id/numberpicker_input")
    public AndroidElement defaultSelectedTime;
    @AndroidFindBy(className = "android.widget.Button")
    public List<AndroidElement> otherTimesList;
    @AndroidFindBy(id = "com.stuart.client.beta:id/schedule_screen_later_button")
    public AndroidElement setTimeButton;
    @AndroidFindBy(id = "com.stuart.client.beta:id/schedule_screen_now_button")
    public AndroidElement pickupASAPButton;
    @AndroidFindBy(id = "com.stuart.client.beta:id/job_creation_title")
    public AndroidElement jobCreationTitle;
    @AndroidFindBy(id = "com.stuart.client.beta:id/job_header_left")
    public AndroidElement countDelivery;




}
