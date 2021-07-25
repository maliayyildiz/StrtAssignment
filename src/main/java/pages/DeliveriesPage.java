package pages;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AndroidFindBys;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.cucumber.java.en.And;
import org.openqa.selenium.support.PageFactory;
import utilities.DriverMobile;

import java.time.Duration;
import java.util.List;

public class DeliveriesPage {
    public DeliveriesPage(){
        PageFactory.initElements(new AppiumFieldDecorator(DriverMobile.getAppiumDriver(), Duration.ofSeconds(30)),this);
    }
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Picking up']")
    public AndroidElement jobStatusText;
    @AndroidFindBy(id = "com.stuart.client.beta:id/job_cancel_button")
    public AndroidElement cancelButton;
    @AndroidFindBy(id = "com.stuart.client.beta:id/confirm_cancel_send_button")
    public AndroidElement confirmButton;
    @AndroidFindBy(className = "android.widget.CheckedTextView")
    public List<AndroidElement> reasonOfCancellationList;
    @AndroidFindBy(xpath = "//androidx.appcompat.app.a.c[@content-desc='Finished']")
    public AndroidElement finishedTab;
    @AndroidFindBy(id = "com.stuart.client.beta:id/job_id")
    public List<AndroidElement> idListOnFinishedPage;
    @AndroidFindBy(id = "com.stuart.client.beta:id/job_status_text")
    public List<AndroidElement> statusDeliveryListOnFinishedPage;
    @AndroidFindBy(id = "com.stuart.client.beta:id/confirm_cancel_title")
    public AndroidElement cancellationTitle;
    @AndroidFindBy(id = "com.stuart.client.beta:id/job_header_left")
    public AndroidElement jobHeader;





}
