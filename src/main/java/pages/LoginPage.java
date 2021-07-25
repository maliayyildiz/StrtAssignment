package pages;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.cucumber.java.en.And;
import org.openqa.selenium.support.PageFactory;
import utilities.DriverMobile;

import java.time.Duration;

public class LoginPage {
    public LoginPage(){
        PageFactory.initElements(new AppiumFieldDecorator(DriverMobile.getAppiumDriver(), Duration.ofSeconds(30)),this);
    }

    @AndroidFindBy(id = "com.stuart.client.beta:id/pos_toolbar_title")
    public AndroidElement welcomeBackText;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Change domain']")
    public AndroidElement changeDomainButton;
    @AndroidFindBy(xpath = "(//android.widget.RadioButton)[4]")
    public AndroidElement sandBoxRadioButton;
    @AndroidFindBy(id = "com.stuart.client.beta:id/httpsSwitch")
    public AndroidElement httpsSwitchButton;
    @AndroidFindBy(id = "com.stuart.client.beta:id/change_domain_dialog_btn_save")
    public AndroidElement saveButton;
    @AndroidFindBy(id = "com.stuart.client.beta:id/change_domain_dialog_btn_cancel")
    public AndroidElement cancelButton;
    @AndroidFindBy(id = "com.stuart.client.beta:id/edit_email")
    public AndroidElement emailBox;
    @AndroidFindBy(id = "com.stuart.client.beta:id/login_password")
    public AndroidElement passwordBox;
    @AndroidFindBy(id = "com.stuart.client.beta:id/login_button")
    public AndroidElement loginButton;




}
