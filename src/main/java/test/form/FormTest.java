package test.form;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.qameta.allure.Description;
import io.qameta.allure.TmsLink;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import test.BaseTest;
import test_flows.form.FormFlow;

public class FormTest extends BaseTest {

    @TmsLink("Form_001")
    @Description("what user input can be displayed")
    @Test(description = "Verify input text from user can be displayed")
    public void verifyInputTextCanBeDisplayed() {
        AppiumDriver<MobileElement> appiumDriver = getDriver();
        FormFlow formFlow = new FormFlow(appiumDriver);
        formFlow
                .navigateToFormsPage()
                .inputRandomText()
                .verifyInputTextDisplayCorrectly();
    }

    @TmsLink("Form_002")
    @TmsLink("Form_003")
    @Description("user can switch on/off and text displayed")
    @Test(dataProvider = "switchBtnState", description = "Verify user can tap on switch on/off button and text is displayed")
    public void verifyClickingOnSwitchButton(String state) {
        AppiumDriver<MobileElement> appiumDriver = getDriver();
        FormFlow formFlow = new FormFlow(appiumDriver);
        formFlow
                .navigateToFormsPage()
                .tapOnSwitchButton(state)
                .verifySwitchBtnState(state)
                .verifyTextDisplayedAsState(state);
    }

    @TmsLink("Form_004")
    @Description("user can select dropdown webdriverio/appium/this app is awesome")
    @Test(dataProvider = "dropdownItems", description = "Verify user is able to select item from dropdown")
    public void verifyItemInDropdownList(String item) {
        AppiumDriver<MobileElement> appiumDriver = getDriver();
        FormFlow formFlow = new FormFlow(appiumDriver);
        formFlow
                .selectValueInDropdown()
                .verifySelectedItemIsDisplayed(item);
    }

    @DataProvider
    public Object[][] switchBtnState() {
        return new Object[][] { { "ON" },
                                { "OFF" } };
    }

    @DataProvider
    public Object[][] dropdownItems() {
        return new Object[][] { { "webdriver.io is awesome" },
                                { "Appium is awesome" },
                                { "This app is awesome" } };
    }
}
