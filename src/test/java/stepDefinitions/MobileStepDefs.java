package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.AllPages;
import utilities.ConfigurationReader;
import utilities.DriverMobile;
import utilities.ReusableMethods;

public class MobileStepDefs {
    AllPages elements = new AllPages();
    String orderId = null;

    @Given("user should be on sandbox environment")
    public void user_should_be_on_sandbox_environment() {
        DriverMobile.getAppiumDriver();
        ReusableMethods.waitForClickablility(elements.homePage().loginButton, 3);
        ReusableMethods.tapByElement(elements.homePage().loginButton);
        ReusableMethods.waitForVisibility(elements.loginPage().welcomeBackText, 3);
        Assert.assertTrue(elements.loginPage().welcomeBackText.isDisplayed());
        ReusableMethods.tapByElement(elements.loginPage().welcomeBackText);
        ReusableMethods.tapByElement(elements.loginPage().changeDomainButton);
        ReusableMethods.waitForVisibility(elements.loginPage().sandBoxRadioButton, 3);
        ReusableMethods.tapByElement(elements.loginPage().sandBoxRadioButton);
        ReusableMethods.tapByElement(elements.loginPage().httpsSwitchButton);
        ReusableMethods.tapByElement(elements.loginPage().saveButton);
        ReusableMethods.waitForVisibility(elements.loginPage().welcomeBackText, 3);
        Assert.assertTrue(elements.loginPage().welcomeBackText.isDisplayed());
    }

    @Given("user successfully logged in with valid credentials")
    public void userSuccessfullyLoggedInWithValidCredentials() {
        elements.loginPage().emailBox.sendKeys(ConfigurationReader.getProperty("testClient"));
        elements.loginPage().passwordBox.sendKeys(ConfigurationReader.getProperty("testPassword"));
        elements.loginPage().loginButton.click();
        Assert.assertTrue(elements.requestCourierPage().addPickupAddressButton.isDisplayed());
    }

    @When("user create delivery request by setting pick up location")
    public void userCreateDeliveryRequestBySettingPickUpLocation() {
        ReusableMethods.tapByElement(elements.requestCourierPage().addPickupAddressButton);
        if (elements.requestCourierPage().allowDeviceLocation.size() > 0) {
            ReusableMethods.tapByElement(elements.requestCourierPage().allowDeviceLocation.get(0));
        }
        ReusableMethods.tapByElement(elements.addressPage().savedPickupAddress);
        Assert.assertTrue(elements.addressPage().selectedPickupAddress.isDisplayed());
        ReusableMethods.tapByElement(elements.addressPage().continueButton);
    }

    @And("user set schedule for the delivery")
    public void userSetScheduleForTheDelivery() {
        ReusableMethods.tapByElement(elements.requestCourierPage().scheduleDeliveryOptionsBox);
        ReusableMethods.tapByElement(elements.schedulePage().pickupASAPButton);
        Assert.assertTrue(elements.requestCourierPage().scheduleDeliveryOptionsBox.getText().contains("Pickup ASAP"));
    }

    @And("user set the drop off location")
    public void userSetTheDropOffLocation() {
        ReusableMethods.tapByElement(elements.requestCourierPage().addDropOffAddressButton);
        ReusableMethods.tapByElement(elements.addressPage().savedDropOffAddress);
        ReusableMethods.tapByElement(elements.addressPage().continueButton);
        ReusableMethods.tapByElement(elements.describePackagePage().continueButton);

    }

    @And("there should be an option to add new drop off location")
    public void thereShouldBeAnOptionToAddNewDropOffLocation() {
        Assert.assertTrue(elements.requestCourierPage().addAnotherDropOffButton.get(0).isDisplayed());
    }

    @When("user taps on continue button")
    public void userTapsOnContinueButton() throws InterruptedException {
        Thread.sleep(3000);
        ReusableMethods.tapByElement(elements.requestCourierPage().continueButton);
    }

    @Then("user will see transport options and select bike")
    public void userWillSeeTransportOptionsAndSelectBike() {
        Assert.assertTrue(elements.transportTypePage().transportTypeTitle.isDisplayed());
        ReusableMethods.tapByElement(elements.transportTypePage().selectMoto);
    }

    @When("user tap on Request Now button")
    public void userTapOnRequestNowButton() {
        ReusableMethods.tapByElement(elements.transportTypePage().requestNowButton);
    }

    @Then("system is going to assign a carrier for the delivery")
    public void systemIsGoingToAssignACarrierForTheDelivery() throws InterruptedException {
        Thread.sleep(5000);
        Assert.assertTrue(elements.deliveriesPage().jobHeader.isDisplayed());
        System.out.println("The courier is assigned by system.");
    }

    @When("user cancel delivery should see message for cancellation")
    public void userCancelDeliveryShouldSeeMessageForCancellation() {
        ReusableMethods.tapByElement(elements.deliveriesPage().cancelButton);
        Assert.assertTrue(elements.deliveriesPage().cancellationTitle.isDisplayed());
    }

    @When("user confirm cancellation will see popup message")
    public void userConfirmCancellationWillSeePopupMessage() {
        ReusableMethods.tapByElement(elements.deliveriesPage().reasonOfCancellationList.get(0));
        ReusableMethods.tapByElement(elements.deliveriesPage().confirmButton);
    }

    @Then("user can validate delivery cancelled on Finished page")
    public void userCanValidateDeliveryCancelledOnFinishedPage() {
        ReusableMethods.tapByElement(elements.deliveriesPage().finishedTab);
        Assert.assertEquals(elements.deliveriesPage().idListOnFinishedPage.get(0).getText(), orderId);
        Assert.assertTrue(elements.deliveriesPage().statusDeliveryListOnFinishedPage.get(0).getText().contains("Cancelled"));
    }
}
