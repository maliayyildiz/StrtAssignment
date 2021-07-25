package pages;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AndroidFindBys;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.DriverMobile;

import java.time.Duration;
import java.util.List;

public class TransportTypePage {
    public TransportTypePage(){
        PageFactory.initElements(new AppiumFieldDecorator(DriverMobile.getAppiumDriver(), Duration.ofSeconds(30)),this);
    }
    @AndroidFindBy(id = "com.stuart.client.beta:id/pos_toolbar_title")
    public AndroidElement transportTypeTitle;
    @AndroidFindBy(id = "com.stuart.client.beta:id/item_vehicle_type_price")
    public List<AndroidElement> transportPriceList;
    @AndroidFindBy(id = "com.stuart.client.beta:id/item_vehicle_type_second_line")
    public List<AndroidElement> estimatedTransportTimeStringList;
    @AndroidFindBy(id = "com.stuart.client.beta:id/vehicle_select_create_job_button")
    public AndroidElement requestNowButton;
    @AndroidFindBy(xpath = "(//android.widget.RelativeLayout)[3]")
    public AndroidElement selectMoto;


}
