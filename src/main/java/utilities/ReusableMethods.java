package utilities;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ReusableMethods {
// mobile actions

    public static void tapByElement(WebElement element){
        new TouchAction<>(DriverMobile.getAppiumDriver()).
                tap(TapOptions.tapOptions().withElement(ElementOption.element(element))).
                waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000))).perform();
    }
    public static void scrollIntoViewWithUiScrollable(String elementText){
        AndroidDriver driver = (AndroidDriver) DriverMobile.getAppiumDriver();

         driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text("+elementText+"))");

        driver.findElementByXPath("//*[@text="+elementText+"]").click();
    }

    public static WebElement waitForVisibility(WebElement element, int timeToWaitInSec) {
        WebDriverWait wait = new WebDriverWait(DriverMobile.getAppiumDriver(), timeToWaitInSec);
        return wait.until(ExpectedConditions.visibilityOf(element));
    }
    public static WebElement waitForVisibility(By locator, int timeout) {
        WebDriverWait wait = new WebDriverWait(DriverMobile.getAppiumDriver(), timeout);
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
    public static Boolean waitForInVisibility(By locator, int timeout) {
        WebDriverWait wait = new WebDriverWait(DriverMobile.getAppiumDriver(), timeout);
        return wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
    }
    public static WebElement waitForClickablility(WebElement element, int timeout) {
        WebDriverWait wait = new WebDriverWait(DriverMobile.getAppiumDriver(), timeout);
        return wait.until(ExpectedConditions.elementToBeClickable(element));
    }
    public static WebElement waitForClickablility(By locator, int timeout) {
        WebDriverWait wait = new WebDriverWait(DriverMobile.getAppiumDriver(), timeout);
        return wait.until(ExpectedConditions.elementToBeClickable(locator));
    }
}
